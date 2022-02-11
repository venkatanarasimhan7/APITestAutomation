
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for SaveOutputOrderInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveOutputOrderInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="finalizeOrderInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="manualInterventionReqdInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="incrementalDeliveryReqdInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="outputOrderCreationDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputDeliveryReqdFrequency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productionEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productionStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="selectedMarketNameClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toDoListHTML" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toDoListTemplateName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOutputOrderInputVO", propOrder = {
    "finalizeOrderInd",
    "manualInterventionReqdInd",
    "incrementalDeliveryReqdInd",
    "outputOrderCreationDate",
    "outputOrderId",
    "outputDeliveryReqdFrequency",
    "productionEndDate",
    "productionStartDate",
    "selectedMarketNameClId",
    "toDoListHTML",
    "toDoListTemplateName",
    "user"
})
public class SaveOutputOrderInputVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean finalizeOrderInd;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean manualInterventionReqdInd;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean incrementalDeliveryReqdInd;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long outputOrderCreationDate;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String outputDeliveryReqdFrequency;
    @XmlElement(required = true, nillable = true)
    protected String productionEndDate;
    @XmlElement(required = true, nillable = true)
    protected String productionStartDate;
    @XmlElement(required = true, nillable = true)
    protected String selectedMarketNameClId;
    @XmlElement(required = true, nillable = true)
    protected String toDoListHTML;
    @XmlElement(required = true, nillable = true)
    protected String toDoListTemplateName;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;

    /**
     * Gets the value of the finalizeOrderInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalizeOrderInd() {
        return finalizeOrderInd;
    }

    /**
     * Sets the value of the finalizeOrderInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalizeOrderInd(Boolean value) {
        this.finalizeOrderInd = value;
    }

    /**
     * Gets the value of the manualInterventionReqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualInterventionReqdInd() {
        return manualInterventionReqdInd;
    }

    /**
     * Sets the value of the manualInterventionReqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualInterventionReqdInd(Boolean value) {
        this.manualInterventionReqdInd = value;
    }

    /**
     * Gets the value of the incrementalDeliveryReqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncrementalDeliveryReqdInd() {
        return incrementalDeliveryReqdInd;
    }

    /**
     * Sets the value of the incrementalDeliveryReqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncrementalDeliveryReqdInd(Boolean value) {
        this.incrementalDeliveryReqdInd = value;
    }

    /**
     * Gets the value of the outputOrderCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutputOrderCreationDate() {
        return outputOrderCreationDate;
    }

    /**
     * Sets the value of the outputOrderCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutputOrderCreationDate(Long value) {
        this.outputOrderCreationDate = value;
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
     * Gets the value of the outputDeliveryReqdFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDeliveryReqdFrequency() {
        return outputDeliveryReqdFrequency;
    }

    /**
     * Sets the value of the outputDeliveryReqdFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDeliveryReqdFrequency(String value) {
        this.outputDeliveryReqdFrequency = value;
    }

    /**
     * Gets the value of the productionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionEndDate() {
        return productionEndDate;
    }

    /**
     * Sets the value of the productionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionEndDate(String value) {
        this.productionEndDate = value;
    }

    /**
     * Gets the value of the productionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionStartDate() {
        return productionStartDate;
    }

    /**
     * Sets the value of the productionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionStartDate(String value) {
        this.productionStartDate = value;
    }

    /**
     * Gets the value of the selectedMarketNameClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedMarketNameClId() {
        return selectedMarketNameClId;
    }

    /**
     * Sets the value of the selectedMarketNameClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedMarketNameClId(String value) {
        this.selectedMarketNameClId = value;
    }

    /**
     * Gets the value of the toDoListHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDoListHTML() {
        return toDoListHTML;
    }

    /**
     * Sets the value of the toDoListHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDoListHTML(String value) {
        this.toDoListHTML = value;
    }

    /**
     * Gets the value of the toDoListTemplateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDoListTemplateName() {
        return toDoListTemplateName;
    }

    /**
     * Sets the value of the toDoListTemplateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDoListTemplateName(String value) {
        this.toDoListTemplateName = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setUser(UserVO value) {
        this.user = value;
    }

}
