
package com.elsevier.obii.services.utility.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.utility.facade.ArrayOfXsdNillableString;


/**
 * <p>Java class for OutputOrderDeliveryDataVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputOrderDeliveryDataVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderDeliveryFileIds" type="{http://facade.utility.services.obii.elsevier.com}ArrayOf_xsd_nillable_string" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ftpAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputXMLFileIds" type="{http://facade.utility.services.obii.elsevier.com}ArrayOf_xsd_nillable_string" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderDeliveryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correlationinfo" type="{http://vo.utility.services.obii.elsevier.com}NameValuePairVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputOrderDeliveryDataVO", propOrder = {
    "userId",
    "outputOrderDeliveryFileIds",
    "outputOrderId",
    "ftpAddressId",
    "outputXMLFileIds",
    "outputOrderDeliveryId",
    "correlationinfo"
})
public class OutputOrderDeliveryDataVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String userId;
    protected ArrayOfXsdNillableString outputOrderDeliveryFileIds;
    protected String outputOrderId;
    protected String ftpAddressId;
    protected ArrayOfXsdNillableString outputXMLFileIds;
    protected String outputOrderDeliveryId;
    protected NameValuePairVO correlationinfo;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the outputOrderDeliveryFileIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getOutputOrderDeliveryFileIds() {
        return outputOrderDeliveryFileIds;
    }

    /**
     * Sets the value of the outputOrderDeliveryFileIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setOutputOrderDeliveryFileIds(ArrayOfXsdNillableString value) {
        this.outputOrderDeliveryFileIds = value;
    }

    /**
     * Gets the value of the outputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderId() {
        return outputOrderId;
    }

    /**
     * Sets the value of the outputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderId(String value) {
        this.outputOrderId = value;
    }

    /**
     * Gets the value of the ftpAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpAddressId() {
        return ftpAddressId;
    }

    /**
     * Sets the value of the ftpAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpAddressId(String value) {
        this.ftpAddressId = value;
    }

    /**
     * Gets the value of the outputXMLFileIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getOutputXMLFileIds() {
        return outputXMLFileIds;
    }

    /**
     * Sets the value of the outputXMLFileIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setOutputXMLFileIds(ArrayOfXsdNillableString value) {
        this.outputXMLFileIds = value;
    }

    /**
     * Gets the value of the outputOrderDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderDeliveryId() {
        return outputOrderDeliveryId;
    }

    /**
     * Sets the value of the outputOrderDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderDeliveryId(String value) {
        this.outputOrderDeliveryId = value;
    }

    /**
     * Gets the value of the correlationinfo property.
     * 
     * @return
     *     possible object is
     *     {@link NameValuePairVO }
     *     
     */
    public NameValuePairVO getCorrelationinfo() {
        return correlationinfo;
    }

    /**
     * Sets the value of the correlationinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValuePairVO }
     *     
     */
    public void setCorrelationinfo(NameValuePairVO value) {
        this.correlationinfo = value;
    }

}
