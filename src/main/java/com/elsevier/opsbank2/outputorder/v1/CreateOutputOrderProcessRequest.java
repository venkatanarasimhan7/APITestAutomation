
package com.elsevier.opsbank2.outputorder.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.opsbank2.common.User;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultSetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customformattingRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://common.opsbank2.elsevier.com}user" minOccurs="0"/&gt;
 *         &lt;element name="skipFormattingTest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="outputDeliveryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instructionsForFormatting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerFtpAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderId",
    "parentOrderId",
    "resultSetId",
    "customformattingRequired",
    "user",
    "skipFormattingTest",
    "outputDeliveryId",
    "supplierId",
    "instructionsForFormatting",
    "customerFtpAddressId"
})
@XmlRootElement(name = "createOutputOrderProcessRequest")
public class CreateOutputOrderProcessRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String orderId;
    protected String parentOrderId;
    protected String resultSetId;
    protected Boolean customformattingRequired;
    protected User user;
    protected Boolean skipFormattingTest;
    protected String outputDeliveryId;
    protected String supplierId;
    protected String instructionsForFormatting;
    protected String customerFtpAddressId;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the parentOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderId() {
        return parentOrderId;
    }

    /**
     * Sets the value of the parentOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderId(String value) {
        this.parentOrderId = value;
    }

    /**
     * Gets the value of the resultSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultSetId() {
        return resultSetId;
    }

    /**
     * Sets the value of the resultSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultSetId(String value) {
        this.resultSetId = value;
    }

    /**
     * Gets the value of the customformattingRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomformattingRequired() {
        return customformattingRequired;
    }

    /**
     * Sets the value of the customformattingRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomformattingRequired(Boolean value) {
        this.customformattingRequired = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the skipFormattingTest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipFormattingTest() {
        return skipFormattingTest;
    }

    /**
     * Sets the value of the skipFormattingTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipFormattingTest(Boolean value) {
        this.skipFormattingTest = value;
    }

    /**
     * Gets the value of the outputDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDeliveryId() {
        return outputDeliveryId;
    }

    /**
     * Sets the value of the outputDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDeliveryId(String value) {
        this.outputDeliveryId = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierId(String value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the instructionsForFormatting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionsForFormatting() {
        return instructionsForFormatting;
    }

    /**
     * Sets the value of the instructionsForFormatting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionsForFormatting(String value) {
        this.instructionsForFormatting = value;
    }

    /**
     * Gets the value of the customerFtpAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFtpAddressId() {
        return customerFtpAddressId;
    }

    /**
     * Sets the value of the customerFtpAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFtpAddressId(String value) {
        this.customerFtpAddressId = value;
    }

}
