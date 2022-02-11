
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isUploaded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isResupply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSupplierProblem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isManualOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isNewManualOrderChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isNextActivityChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isIndexCorrectionOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="activeStateRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasFailedCARs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSignalEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderState", propOrder = {
    "stateId",
    "isUploaded",
    "isUpdated",
    "isResupply",
    "isSupplierProblem",
    "isClosed",
    "isManualOrder",
    "isNewManualOrderChecked",
    "isNextActivityChecked",
    "isIndexCorrectionOrder",
    "activeStateRefId",
    "hasFailedCARs",
    "isSignalEmpty"
})
public class OrderState
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String stateId;
    protected Boolean isUploaded;
    protected Boolean isUpdated;
    protected Boolean isResupply;
    protected Boolean isSupplierProblem;
    protected Boolean isClosed;
    protected Boolean isManualOrder;
    protected Boolean isNewManualOrderChecked;
    protected Boolean isNextActivityChecked;
    protected Boolean isIndexCorrectionOrder;
    protected String activeStateRefId;
    protected Boolean hasFailedCARs;
    protected Boolean isSignalEmpty;

    /**
     * Gets the value of the stateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateId() {
        return stateId;
    }

    /**
     * Sets the value of the stateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateId(String value) {
        this.stateId = value;
    }

    /**
     * Gets the value of the isUploaded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUploaded() {
        return isUploaded;
    }

    /**
     * Sets the value of the isUploaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUploaded(Boolean value) {
        this.isUploaded = value;
    }

    /**
     * Gets the value of the isUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUpdated() {
        return isUpdated;
    }

    /**
     * Sets the value of the isUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUpdated(Boolean value) {
        this.isUpdated = value;
    }

    /**
     * Gets the value of the isResupply property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResupply() {
        return isResupply;
    }

    /**
     * Sets the value of the isResupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResupply(Boolean value) {
        this.isResupply = value;
    }

    /**
     * Gets the value of the isSupplierProblem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupplierProblem() {
        return isSupplierProblem;
    }

    /**
     * Sets the value of the isSupplierProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupplierProblem(Boolean value) {
        this.isSupplierProblem = value;
    }

    /**
     * Gets the value of the isClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClosed() {
        return isClosed;
    }

    /**
     * Sets the value of the isClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClosed(Boolean value) {
        this.isClosed = value;
    }

    /**
     * Gets the value of the isManualOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManualOrder() {
        return isManualOrder;
    }

    /**
     * Sets the value of the isManualOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManualOrder(Boolean value) {
        this.isManualOrder = value;
    }

    /**
     * Gets the value of the isNewManualOrderChecked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNewManualOrderChecked() {
        return isNewManualOrderChecked;
    }

    /**
     * Sets the value of the isNewManualOrderChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNewManualOrderChecked(Boolean value) {
        this.isNewManualOrderChecked = value;
    }

    /**
     * Gets the value of the isNextActivityChecked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNextActivityChecked() {
        return isNextActivityChecked;
    }

    /**
     * Sets the value of the isNextActivityChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNextActivityChecked(Boolean value) {
        this.isNextActivityChecked = value;
    }

    /**
     * Gets the value of the isIndexCorrectionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIndexCorrectionOrder() {
        return isIndexCorrectionOrder;
    }

    /**
     * Sets the value of the isIndexCorrectionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIndexCorrectionOrder(Boolean value) {
        this.isIndexCorrectionOrder = value;
    }

    /**
     * Gets the value of the activeStateRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveStateRefId() {
        return activeStateRefId;
    }

    /**
     * Sets the value of the activeStateRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveStateRefId(String value) {
        this.activeStateRefId = value;
    }

    /**
     * Gets the value of the hasFailedCARs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFailedCARs() {
        return hasFailedCARs;
    }

    /**
     * Sets the value of the hasFailedCARs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFailedCARs(Boolean value) {
        this.hasFailedCARs = value;
    }

    /**
     * Gets the value of the isSignalEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSignalEmpty() {
        return isSignalEmpty;
    }

    /**
     * Sets the value of the isSignalEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSignalEmpty(Boolean value) {
        this.isSignalEmpty = value;
    }

}
