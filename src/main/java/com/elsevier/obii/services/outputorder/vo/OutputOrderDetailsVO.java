
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for OutputOrderDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputOrderDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachedSearchProfile" type="{http://vo.outputorder.services.obii.elsevier.com}SearchProfileDetailsVO"/&gt;
 *         &lt;element name="finalizeOrderInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="incrementalDeliveryReqdInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="manualInterventionReqdInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="marketNameOptions" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *         &lt;element name="outputDeliveryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputDeliveryReqdFrequency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderCreationDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderStatusClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderTypeClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputRequestDetails" type="{http://vo.outputorder.services.obii.elsevier.com}OutputRequestDetailsVO"/&gt;
 *         &lt;element name="outputRequesterApprovalInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="productionEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productionStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rejectionReasonChangeRequestDtls" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rejectionReasonDataMismatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="remarksOnFinalApprovalOfOrder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultSetId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="selectedMarketNameClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputOrderDetailsVO", propOrder = {
    "attachedSearchProfile",
    "finalizeOrderInd",
    "incrementalDeliveryReqdInd",
    "manualInterventionReqdInd",
    "marketNameOptions",
    "outputDeliveryId",
    "outputDeliveryReqdFrequency",
    "outputOrderCreationDate",
    "outputOrderId",
    "outputOrderStatusClId",
    "outputOrderTypeClId",
    "outputRequestDetails",
    "outputRequesterApprovalInd",
    "productionEndDate",
    "productionStartDate",
    "rejectionReasonChangeRequestDtls",
    "rejectionReasonDataMismatch",
    "remarksOnFinalApprovalOfOrder",
    "resultSetId",
    "selectedMarketNameClId"
})
public class OutputOrderDetailsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected SearchProfileDetailsVO attachedSearchProfile;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean finalizeOrderInd;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean incrementalDeliveryReqdInd;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean manualInterventionReqdInd;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO marketNameOptions;
    @XmlElement(required = true, nillable = true)
    protected String outputDeliveryId;
    @XmlElement(required = true, nillable = true)
    protected String outputDeliveryReqdFrequency;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long outputOrderCreationDate;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderStatusClId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderTypeClId;
    @XmlElement(required = true, nillable = true)
    protected OutputRequestDetailsVO outputRequestDetails;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean outputRequesterApprovalInd;
    @XmlElement(required = true, nillable = true)
    protected String productionEndDate;
    @XmlElement(required = true, nillable = true)
    protected String productionStartDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean rejectionReasonChangeRequestDtls;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean rejectionReasonDataMismatch;
    @XmlElement(required = true, nillable = true)
    protected String remarksOnFinalApprovalOfOrder;
    @XmlElement(required = true, nillable = true)
    protected String resultSetId;
    @XmlElement(required = true, nillable = true)
    protected String selectedMarketNameClId;

    /**
     * Gets the value of the attachedSearchProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SearchProfileDetailsVO }
     *     
     */
    public SearchProfileDetailsVO getAttachedSearchProfile() {
        return attachedSearchProfile;
    }

    /**
     * Sets the value of the attachedSearchProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchProfileDetailsVO }
     *     
     */
    public void setAttachedSearchProfile(SearchProfileDetailsVO value) {
        this.attachedSearchProfile = value;
    }

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
     * Gets the value of the marketNameOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public ArrayOfTns8NillableCodeListItemDetailsVO getMarketNameOptions() {
        return marketNameOptions;
    }

    /**
     * Sets the value of the marketNameOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public void setMarketNameOptions(ArrayOfTns8NillableCodeListItemDetailsVO value) {
        this.marketNameOptions = value;
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
     * Gets the value of the outputRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OutputRequestDetailsVO }
     *     
     */
    public OutputRequestDetailsVO getOutputRequestDetails() {
        return outputRequestDetails;
    }

    /**
     * Sets the value of the outputRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputRequestDetailsVO }
     *     
     */
    public void setOutputRequestDetails(OutputRequestDetailsVO value) {
        this.outputRequestDetails = value;
    }

    /**
     * Gets the value of the outputRequesterApprovalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutputRequesterApprovalInd() {
        return outputRequesterApprovalInd;
    }

    /**
     * Sets the value of the outputRequesterApprovalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutputRequesterApprovalInd(Boolean value) {
        this.outputRequesterApprovalInd = value;
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
     * Gets the value of the rejectionReasonChangeRequestDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejectionReasonChangeRequestDtls() {
        return rejectionReasonChangeRequestDtls;
    }

    /**
     * Sets the value of the rejectionReasonChangeRequestDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRejectionReasonChangeRequestDtls(Boolean value) {
        this.rejectionReasonChangeRequestDtls = value;
    }

    /**
     * Gets the value of the rejectionReasonDataMismatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejectionReasonDataMismatch() {
        return rejectionReasonDataMismatch;
    }

    /**
     * Sets the value of the rejectionReasonDataMismatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRejectionReasonDataMismatch(Boolean value) {
        this.rejectionReasonDataMismatch = value;
    }

    /**
     * Gets the value of the remarksOnFinalApprovalOfOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksOnFinalApprovalOfOrder() {
        return remarksOnFinalApprovalOfOrder;
    }

    /**
     * Sets the value of the remarksOnFinalApprovalOfOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksOnFinalApprovalOfOrder(String value) {
        this.remarksOnFinalApprovalOfOrder = value;
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

}
