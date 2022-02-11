
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for OutputOrderDeliveryInfoVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputOrderDeliveryInfoVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerFtpAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customFormattingReqdInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customFormattingSupplierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliveryInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalDeliverySupplierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalDelvryReqdInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="extFormattingAndDeliveryReqd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="formattingInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internalDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internalDelvryReqdInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDeliveryNotificationMailReqd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastDeliverySuccessInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="manIntvReqdInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="maxRecordsReqd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="minRecordsReqd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderStatusClId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderTypeClId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentOutputOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="searchProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputOrderDeliveryInfoVO", propOrder = {
    "customerFtpAddressId",
    "customFormattingReqdInd",
    "customFormattingSupplierId",
    "deliveryInstructions",
    "externalDeliverySupplierId",
    "externalDelvryReqdInd",
    "extFormattingAndDeliveryReqd",
    "formattingInstructions",
    "internalDeliveryMethod",
    "internalDelvryReqdInd",
    "isDeliveryNotificationMailReqd",
    "lastDeliverySuccessInd",
    "manIntvReqdInd",
    "maxRecordsReqd",
    "minRecordsReqd",
    "outputOrderId",
    "outputOrderStatusClId",
    "outputOrderTypeClId",
    "parentOutputOrderId",
    "partyId",
    "remark",
    "searchProfileId"
})
public class OutputOrderDeliveryInfoVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String customerFtpAddressId;
    protected Boolean customFormattingReqdInd;
    protected String customFormattingSupplierId;
    protected String deliveryInstructions;
    protected String externalDeliverySupplierId;
    protected Boolean externalDelvryReqdInd;
    protected Boolean extFormattingAndDeliveryReqd;
    protected String formattingInstructions;
    protected String internalDeliveryMethod;
    protected Boolean internalDelvryReqdInd;
    protected Boolean isDeliveryNotificationMailReqd;
    protected Boolean lastDeliverySuccessInd;
    protected Boolean manIntvReqdInd;
    protected Double maxRecordsReqd;
    protected Double minRecordsReqd;
    protected String outputOrderId;
    protected String outputOrderStatusClId;
    protected String outputOrderTypeClId;
    protected String parentOutputOrderId;
    protected String partyId;
    protected String remark;
    protected String searchProfileId;

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

    /**
     * Gets the value of the customFormattingReqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomFormattingReqdInd() {
        return customFormattingReqdInd;
    }

    /**
     * Sets the value of the customFormattingReqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomFormattingReqdInd(Boolean value) {
        this.customFormattingReqdInd = value;
    }

    /**
     * Gets the value of the customFormattingSupplierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomFormattingSupplierId() {
        return customFormattingSupplierId;
    }

    /**
     * Sets the value of the customFormattingSupplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomFormattingSupplierId(String value) {
        this.customFormattingSupplierId = value;
    }

    /**
     * Gets the value of the deliveryInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    /**
     * Sets the value of the deliveryInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInstructions(String value) {
        this.deliveryInstructions = value;
    }

    /**
     * Gets the value of the externalDeliverySupplierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDeliverySupplierId() {
        return externalDeliverySupplierId;
    }

    /**
     * Sets the value of the externalDeliverySupplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDeliverySupplierId(String value) {
        this.externalDeliverySupplierId = value;
    }

    /**
     * Gets the value of the externalDelvryReqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalDelvryReqdInd() {
        return externalDelvryReqdInd;
    }

    /**
     * Sets the value of the externalDelvryReqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalDelvryReqdInd(Boolean value) {
        this.externalDelvryReqdInd = value;
    }

    /**
     * Gets the value of the extFormattingAndDeliveryReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtFormattingAndDeliveryReqd() {
        return extFormattingAndDeliveryReqd;
    }

    /**
     * Sets the value of the extFormattingAndDeliveryReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtFormattingAndDeliveryReqd(Boolean value) {
        this.extFormattingAndDeliveryReqd = value;
    }

    /**
     * Gets the value of the formattingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattingInstructions() {
        return formattingInstructions;
    }

    /**
     * Sets the value of the formattingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattingInstructions(String value) {
        this.formattingInstructions = value;
    }

    /**
     * Gets the value of the internalDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalDeliveryMethod() {
        return internalDeliveryMethod;
    }

    /**
     * Sets the value of the internalDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalDeliveryMethod(String value) {
        this.internalDeliveryMethod = value;
    }

    /**
     * Gets the value of the internalDelvryReqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternalDelvryReqdInd() {
        return internalDelvryReqdInd;
    }

    /**
     * Sets the value of the internalDelvryReqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternalDelvryReqdInd(Boolean value) {
        this.internalDelvryReqdInd = value;
    }

    /**
     * Gets the value of the isDeliveryNotificationMailReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeliveryNotificationMailReqd() {
        return isDeliveryNotificationMailReqd;
    }

    /**
     * Sets the value of the isDeliveryNotificationMailReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeliveryNotificationMailReqd(Boolean value) {
        this.isDeliveryNotificationMailReqd = value;
    }

    /**
     * Gets the value of the lastDeliverySuccessInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastDeliverySuccessInd() {
        return lastDeliverySuccessInd;
    }

    /**
     * Sets the value of the lastDeliverySuccessInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastDeliverySuccessInd(Boolean value) {
        this.lastDeliverySuccessInd = value;
    }

    /**
     * Gets the value of the manIntvReqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManIntvReqdInd() {
        return manIntvReqdInd;
    }

    /**
     * Sets the value of the manIntvReqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManIntvReqdInd(Boolean value) {
        this.manIntvReqdInd = value;
    }

    /**
     * Gets the value of the maxRecordsReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxRecordsReqd() {
        return maxRecordsReqd;
    }

    /**
     * Sets the value of the maxRecordsReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxRecordsReqd(Double value) {
        this.maxRecordsReqd = value;
    }

    /**
     * Gets the value of the minRecordsReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinRecordsReqd() {
        return minRecordsReqd;
    }

    /**
     * Sets the value of the minRecordsReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinRecordsReqd(Double value) {
        this.minRecordsReqd = value;
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
     * Gets the value of the outputOrderStatusClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderStatusClId() {
        return outputOrderStatusClId;
    }

    /**
     * Sets the value of the outputOrderStatusClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderStatusClId(String value) {
        this.outputOrderStatusClId = value;
    }

    /**
     * Gets the value of the outputOrderTypeClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderTypeClId() {
        return outputOrderTypeClId;
    }

    /**
     * Sets the value of the outputOrderTypeClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderTypeClId(String value) {
        this.outputOrderTypeClId = value;
    }

    /**
     * Gets the value of the parentOutputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOutputOrderId() {
        return parentOutputOrderId;
    }

    /**
     * Sets the value of the parentOutputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOutputOrderId(String value) {
        this.parentOutputOrderId = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the searchProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchProfileId() {
        return searchProfileId;
    }

    /**
     * Sets the value of the searchProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchProfileId(String value) {
        this.searchProfileId = value;
    }

}
