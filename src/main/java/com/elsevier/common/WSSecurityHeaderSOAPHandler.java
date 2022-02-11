package com.elsevier.common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

import javax.xml.namespace.QName;
import javax.xml.soap.Detail;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.codec.binary.Base64;

public class WSSecurityHeaderSOAPHandler implements SOAPHandler<SOAPMessageContext> {

    private static final String MUST_UNDERSTAND = "mustUnderstand";
    private static final String SOAP_ELEMENT_CREATED = "Created";
    private static final String SOAP_ELEMENT_NONCE = "Nonce";
    private static final String SOAP_ELEMENT_PASSWORD = "Password";
    private static final String SOAP_ELEMENT_USERNAME = "Username";
    private static final String SOAP_ELEMENT_USERNAME_TOKEN = "UsernameToken";
    private static final String SOAP_ELEMENT_SECURITY = "Security";
    private static final String NAMESPACE_SECURITY = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    private static final String NAMESPACE_SECURITY_UTILITY = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
    private static final String PREFIX_SECURITY = "wsse";
    private static final String PREFIX_SECURITY_UTILITY = "wsu";

    private String usernameText;
    private String passwordText;

    public WSSecurityHeaderSOAPHandler(String usernameText, String passwordText) {
        this.usernameText = usernameText;
        this.passwordText = passwordText;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext soapMessageContext) {
        Boolean outboundProperty = (Boolean) soapMessageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty.booleanValue()) {

            try {
                soapMessageContext.put("jaxws.jaxb.write.remove.illegal.chars",
                        Boolean.TRUE);
                SOAPMessage soapMessage = soapMessageContext.getMessage();
                SOAPPart soapPart = soapMessage.getSOAPPart();
                SOAPEnvelope soapEnvelope = soapPart.getEnvelope();

                SOAPHeader header = soapEnvelope.getHeader();
                if (header == null) {
                    header = soapEnvelope.addHeader();
                }
                String headerPrefix = header.getPrefix();
                SOAPElement soapElementSecurityHeader = header.addChildElement(SOAP_ELEMENT_SECURITY, PREFIX_SECURITY, NAMESPACE_SECURITY);
                soapElementSecurityHeader.addNamespaceDeclaration(PREFIX_SECURITY_UTILITY, NAMESPACE_SECURITY_UTILITY);
                soapElementSecurityHeader.addAttribute(new QName(headerPrefix + ":" + MUST_UNDERSTAND), "1");
                SOAPElement soapElementUsernameToken = soapElementSecurityHeader.addChildElement(SOAP_ELEMENT_USERNAME_TOKEN, PREFIX_SECURITY);
                soapElementUsernameToken.addAttribute(new QName(PREFIX_SECURITY_UTILITY + ":Id"), "UsernameToken-9D3476BD1EE39AF22314834496284403");

                SOAPElement soapElementUsername = soapElementUsernameToken.addChildElement(SOAP_ELEMENT_USERNAME, PREFIX_SECURITY);
                soapElementUsername.addTextNode(this.usernameText);

                String nonceStr = buildNonce();
                String nonceB64 = new String(Base64.encodeBase64(nonceStr.getBytes("UTF-8")), "UTF-8");
                SOAPElement nonce = soapElementUsernameToken.addChildElement(SOAP_ELEMENT_NONCE, PREFIX_SECURITY);
                nonce.setAttribute("EncodingType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
                nonce.addTextNode(nonceB64);

                SOAPElement created = soapElementUsernameToken.addChildElement(SOAP_ELEMENT_CREATED, PREFIX_SECURITY_UTILITY);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
                Date c = new Date();
                String dateTime = sdf.format(c.getTime());
                created.addTextNode(dateTime);

                String buildPasswordDigest = buildPasswordDigest(usernameText, passwordText, nonceStr, dateTime);
                SOAPElement soapElementPassword = soapElementUsernameToken.addChildElement(SOAP_ELEMENT_PASSWORD, PREFIX_SECURITY);
                soapElementPassword.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
                soapElementPassword.addTextNode(buildPasswordDigest);
                soapMessage.saveChanges();
                soapMessage.writeTo(System.out);
            } catch (Exception e) {
                throw new RuntimeException("Error on wsSecurityHandler: " + e.getMessage());
            }

        }
        return true;
    }

    public static String buildNonce() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        java.security.SecureRandom random = java.security.SecureRandom.getInstance("SHA1PRNG");
        //random.setSeed(System.currentTimeMillis()); Fix for JIRA# OB2M-5202
        random.setSeed(UUID.randomUUID().toString().getBytes()); /* To generate the unique Nonce for each soap request*/
        byte[] nonceBytes = new byte[16];

        random.nextBytes(nonceBytes);

        String nonce = new String(nonceBytes, "UTF-8");
        return nonce;
    }

    public static String buildPasswordDigest(String userName, String password, String nonce, String dateTime) {
        String passwordB64 = null;
        try {
            byte[] createdDateBytes = dateTime.getBytes("UTF-8");
            byte[] passwordBytes = password.getBytes("UTF-8");
            byte[] nonceBytes = nonce.getBytes("UTF-8");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write(nonceBytes);
            baos.write(createdDateBytes);
            baos.write(passwordBytes);
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] digestedPassword = md.digest(baos.toByteArray());
            passwordB64 = new String(Base64.encodeBase64(digestedPassword), "UTF-8");

        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
        return passwordB64;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        System.out.println("I'm here!!!!");
        try {
            SOAPMessage message = context.getMessage();
            SOAPBody body;
            body = message.getSOAPBody();
            SOAPFault fault = body.getFault();
            String code = fault.getFaultCode();
            String faultString = fault.getFaultString();
            Detail detail = fault.getDetail();
            System.out.println("Error code : " + code + ", fault string: " + faultString + ", Detail : " + detail);
        } catch (SOAPException e) {
            System.out.println("SoapEx " + e.getMessage());
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public void close(MessageContext context) {
        // TODO Auto-generated method stub

    }

    @Override
    public Set<QName> getHeaders() {
        // TODO Auto-generated method stub
        return null;
    }

}
