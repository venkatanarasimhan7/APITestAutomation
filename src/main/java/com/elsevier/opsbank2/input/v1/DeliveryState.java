
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isResupply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSupplierProblem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isCorrectionCar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="processignState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isFileCorrupt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="activeStateRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DeliveryState", propOrder = {
    "stateId",
    "isResupply",
    "isSupplierProblem",
    "isCorrectionCar",
    "processignState",
    "isFileCorrupt",
    "activeStateRefId",
    "isSignalEmpty"
})
public class DeliveryState
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String stateId;
    protected Boolean isResupply;
    protected Boolean isSupplierProblem;
    protected Boolean isCorrectionCar;
    protected String processignState;
    protected Boolean isFileCorrupt;
    protected String activeStateRefId;
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
     * Gets the value of the isCorrectionCar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCorrectionCar() {
        return isCorrectionCar;
    }

    /**
     * Sets the value of the isCorrectionCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCorrectionCar(Boolean value) {
        this.isCorrectionCar = value;
    }

    /**
     * Gets the value of the processignState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessignState() {
        return processignState;
    }

    /**
     * Sets the value of the processignState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessignState(String value) {
        this.processignState = value;
    }

    /**
     * Gets the value of the isFileCorrupt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFileCorrupt() {
        return isFileCorrupt;
    }

    /**
     * Sets the value of the isFileCorrupt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFileCorrupt(Boolean value) {
        this.isFileCorrupt = value;
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
