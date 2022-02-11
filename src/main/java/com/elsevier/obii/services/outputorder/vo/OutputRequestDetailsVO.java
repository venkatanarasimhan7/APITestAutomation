
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.admin.vo.FTPAddressVO;
import com.elsevier.obii.services.admin.vo.PhysicalAddressVO;
import com.elsevier.obii.services.common.vo.CodeListItemDetailsVO;
import com.elsevier.obii.services.common.vo.ElsevierOrgUnitVO;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for OutputRequestDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputRequestDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abstarctUseTypeList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *         &lt;element name="abstractChangeTypeList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *         &lt;element name="attachmentFileList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_OutputAttachmentVO"/&gt;
 *         &lt;element name="businessUnit" type="{http://vo.common.services.obii.elsevier.com}ElsevierOrgUnitVO"/&gt;
 *         &lt;element name="contactPersons" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_ContactPersonVO"/&gt;
 *         &lt;element name="customerDetails" type="{http://vo.outputorder.services.obii.elsevier.com}CustomerDetailsVO"/&gt;
 *         &lt;element name="customerPhysicalAddress" type="{http://vo.admin.services.obii.elsevier.com}PhysicalAddressVO"/&gt;
 *         &lt;element name="customFormattingInstruction" type="{http://vo.outputorder.services.obii.elsevier.com}CustomFormattingInstructionVO"/&gt;
 *         &lt;element name="dataElement" type="{http://vo.outputorder.services.obii.elsevier.com}DataElementsVO"/&gt;
 *         &lt;element name="deliveryEmailAddressList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns9_nillable_EmailAddressVO"/&gt;
 *         &lt;element name="deliveryFtpAddress" type="{http://vo.admin.services.obii.elsevier.com}FTPAddressVO"/&gt;
 *         &lt;element name="deliveryInstruction" type="{http://vo.outputorder.services.obii.elsevier.com}DeliveryInstructionVO"/&gt;
 *         &lt;element name="division" type="{http://vo.common.services.obii.elsevier.com}ElsevierOrgUnitVO"/&gt;
 *         &lt;element name="group" type="{http://vo.common.services.obii.elsevier.com}ElsevierOrgUnitVO"/&gt;
 *         &lt;element name="indexTypeOption" type="{http://vo.outputorder.services.obii.elsevier.com}OutputIndexVO"/&gt;
 *         &lt;element name="isAllRecordSelected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isDeliveryNotificationMailReqd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isManagerApproved" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="managerApprovalRemarks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="maxNoOfRecord" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="minNoOfRecord" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderCreationDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="originalRequesterName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputDataScopeOptions" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_DataScopeVO"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productionDate" type="{http://vo.outputorder.services.obii.elsevier.com}DateRangeVO"/&gt;
 *         &lt;element name="publicationDate" type="{http://vo.outputorder.services.obii.elsevier.com}DateRangeVO"/&gt;
 *         &lt;element name="recordType" type="{http://vo.outputorder.services.obii.elsevier.com}RecordTypeVO"/&gt;
 *         &lt;element name="requesterName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toDoListHtmlText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toDoListTemplateName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fullTxtPdfAttchmntsReqd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="outputOrderStatus" type="{http://vo.common.services.obii.elsevier.com}CodeListItemDetailsVO"/&gt;
 *         &lt;element name="attachmentTypeVOs" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_AttachmentTypeVO"/&gt;
 *         &lt;element name="isChunkDelvryReqd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputRequestDetailsVO", propOrder = {
    "abstarctUseTypeList",
    "abstractChangeTypeList",
    "attachmentFileList",
    "businessUnit",
    "contactPersons",
    "customerDetails",
    "customerPhysicalAddress",
    "customFormattingInstruction",
    "dataElement",
    "deliveryEmailAddressList",
    "deliveryFtpAddress",
    "deliveryInstruction",
    "division",
    "group",
    "indexTypeOption",
    "isAllRecordSelected",
    "isDeliveryNotificationMailReqd",
    "isManagerApproved",
    "managerApprovalRemarks",
    "maxNoOfRecord",
    "minNoOfRecord",
    "orderCreationDate",
    "originalRequesterName",
    "outputDataScopeOptions",
    "outputOrderId",
    "outputOrderName",
    "productionDate",
    "publicationDate",
    "recordType",
    "requesterName",
    "toDoListHtmlText",
    "toDoListTemplateName",
    "fullTxtPdfAttchmntsReqd",
    "outputOrderStatus",
    "attachmentTypeVOs",
    "isChunkDelvryReqd"
})
public class OutputRequestDetailsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO abstarctUseTypeList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO abstractChangeTypeList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableOutputAttachmentVO attachmentFileList;
    @XmlElement(required = true, nillable = true)
    protected ElsevierOrgUnitVO businessUnit;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableContactPersonVO contactPersons;
    @XmlElement(required = true, nillable = true)
    protected CustomerDetailsVO customerDetails;
    @XmlElement(required = true, nillable = true)
    protected PhysicalAddressVO customerPhysicalAddress;
    @XmlElement(required = true, nillable = true)
    protected CustomFormattingInstructionVO customFormattingInstruction;
    @XmlElement(required = true, nillable = true)
    protected DataElementsVO dataElement;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns9NillableEmailAddressVO deliveryEmailAddressList;
    @XmlElement(required = true, nillable = true)
    protected FTPAddressVO deliveryFtpAddress;
    @XmlElement(required = true, nillable = true)
    protected DeliveryInstructionVO deliveryInstruction;
    @XmlElement(required = true, nillable = true)
    protected ElsevierOrgUnitVO division;
    @XmlElement(required = true, nillable = true)
    protected ElsevierOrgUnitVO group;
    @XmlElement(required = true, nillable = true)
    protected OutputIndexVO indexTypeOption;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isAllRecordSelected;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isDeliveryNotificationMailReqd;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isManagerApproved;
    @XmlElement(required = true, nillable = true)
    protected String managerApprovalRemarks;
    @XmlElement(required = true, nillable = true)
    protected String maxNoOfRecord;
    @XmlElement(required = true, nillable = true)
    protected String minNoOfRecord;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long orderCreationDate;
    @XmlElement(required = true, nillable = true)
    protected String originalRequesterName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableDataScopeVO outputDataScopeOptions;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderName;
    @XmlElement(required = true, nillable = true)
    protected DateRangeVO productionDate;
    @XmlElement(required = true, nillable = true)
    protected DateRangeVO publicationDate;
    @XmlElement(required = true, nillable = true)
    protected RecordTypeVO recordType;
    @XmlElement(required = true, nillable = true)
    protected String requesterName;
    @XmlElement(required = true, nillable = true)
    protected String toDoListHtmlText;
    @XmlElement(required = true, nillable = true)
    protected String toDoListTemplateName;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean fullTxtPdfAttchmntsReqd;
    @XmlElement(required = true, nillable = true)
    protected CodeListItemDetailsVO outputOrderStatus;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableAttachmentTypeVO attachmentTypeVOs;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isChunkDelvryReqd;

    /**
     * Gets the value of the abstarctUseTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public ArrayOfTns8NillableCodeListItemDetailsVO getAbstarctUseTypeList() {
        return abstarctUseTypeList;
    }

    /**
     * Sets the value of the abstarctUseTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public void setAbstarctUseTypeList(ArrayOfTns8NillableCodeListItemDetailsVO value) {
        this.abstarctUseTypeList = value;
    }

    /**
     * Gets the value of the abstractChangeTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public ArrayOfTns8NillableCodeListItemDetailsVO getAbstractChangeTypeList() {
        return abstractChangeTypeList;
    }

    /**
     * Sets the value of the abstractChangeTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public void setAbstractChangeTypeList(ArrayOfTns8NillableCodeListItemDetailsVO value) {
        this.abstractChangeTypeList = value;
    }

    /**
     * Gets the value of the attachmentFileList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableOutputAttachmentVO }
     *     
     */
    public ArrayOfTns2NillableOutputAttachmentVO getAttachmentFileList() {
        return attachmentFileList;
    }

    /**
     * Sets the value of the attachmentFileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableOutputAttachmentVO }
     *     
     */
    public void setAttachmentFileList(ArrayOfTns2NillableOutputAttachmentVO value) {
        this.attachmentFileList = value;
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ElsevierOrgUnitVO }
     *     
     */
    public ElsevierOrgUnitVO getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElsevierOrgUnitVO }
     *     
     */
    public void setBusinessUnit(ElsevierOrgUnitVO value) {
        this.businessUnit = value;
    }

    /**
     * Gets the value of the contactPersons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableContactPersonVO }
     *     
     */
    public ArrayOfTns2NillableContactPersonVO getContactPersons() {
        return contactPersons;
    }

    /**
     * Sets the value of the contactPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableContactPersonVO }
     *     
     */
    public void setContactPersons(ArrayOfTns2NillableContactPersonVO value) {
        this.contactPersons = value;
    }

    /**
     * Gets the value of the customerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDetailsVO }
     *     
     */
    public CustomerDetailsVO getCustomerDetails() {
        return customerDetails;
    }

    /**
     * Sets the value of the customerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDetailsVO }
     *     
     */
    public void setCustomerDetails(CustomerDetailsVO value) {
        this.customerDetails = value;
    }

    /**
     * Gets the value of the customerPhysicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddressVO }
     *     
     */
    public PhysicalAddressVO getCustomerPhysicalAddress() {
        return customerPhysicalAddress;
    }

    /**
     * Sets the value of the customerPhysicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddressVO }
     *     
     */
    public void setCustomerPhysicalAddress(PhysicalAddressVO value) {
        this.customerPhysicalAddress = value;
    }

    /**
     * Gets the value of the customFormattingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFormattingInstructionVO }
     *     
     */
    public CustomFormattingInstructionVO getCustomFormattingInstruction() {
        return customFormattingInstruction;
    }

    /**
     * Sets the value of the customFormattingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFormattingInstructionVO }
     *     
     */
    public void setCustomFormattingInstruction(CustomFormattingInstructionVO value) {
        this.customFormattingInstruction = value;
    }

    /**
     * Gets the value of the dataElement property.
     * 
     * @return
     *     possible object is
     *     {@link DataElementsVO }
     *     
     */
    public DataElementsVO getDataElement() {
        return dataElement;
    }

    /**
     * Sets the value of the dataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataElementsVO }
     *     
     */
    public void setDataElement(DataElementsVO value) {
        this.dataElement = value;
    }

    /**
     * Gets the value of the deliveryEmailAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns9NillableEmailAddressVO }
     *     
     */
    public ArrayOfTns9NillableEmailAddressVO getDeliveryEmailAddressList() {
        return deliveryEmailAddressList;
    }

    /**
     * Sets the value of the deliveryEmailAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns9NillableEmailAddressVO }
     *     
     */
    public void setDeliveryEmailAddressList(ArrayOfTns9NillableEmailAddressVO value) {
        this.deliveryEmailAddressList = value;
    }

    /**
     * Gets the value of the deliveryFtpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link FTPAddressVO }
     *     
     */
    public FTPAddressVO getDeliveryFtpAddress() {
        return deliveryFtpAddress;
    }

    /**
     * Sets the value of the deliveryFtpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTPAddressVO }
     *     
     */
    public void setDeliveryFtpAddress(FTPAddressVO value) {
        this.deliveryFtpAddress = value;
    }

    /**
     * Gets the value of the deliveryInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInstructionVO }
     *     
     */
    public DeliveryInstructionVO getDeliveryInstruction() {
        return deliveryInstruction;
    }

    /**
     * Sets the value of the deliveryInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInstructionVO }
     *     
     */
    public void setDeliveryInstruction(DeliveryInstructionVO value) {
        this.deliveryInstruction = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link ElsevierOrgUnitVO }
     *     
     */
    public ElsevierOrgUnitVO getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElsevierOrgUnitVO }
     *     
     */
    public void setDivision(ElsevierOrgUnitVO value) {
        this.division = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link ElsevierOrgUnitVO }
     *     
     */
    public ElsevierOrgUnitVO getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElsevierOrgUnitVO }
     *     
     */
    public void setGroup(ElsevierOrgUnitVO value) {
        this.group = value;
    }

    /**
     * Gets the value of the indexTypeOption property.
     * 
     * @return
     *     possible object is
     *     {@link OutputIndexVO }
     *     
     */
    public OutputIndexVO getIndexTypeOption() {
        return indexTypeOption;
    }

    /**
     * Sets the value of the indexTypeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputIndexVO }
     *     
     */
    public void setIndexTypeOption(OutputIndexVO value) {
        this.indexTypeOption = value;
    }

    /**
     * Gets the value of the isAllRecordSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllRecordSelected() {
        return isAllRecordSelected;
    }

    /**
     * Sets the value of the isAllRecordSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllRecordSelected(Boolean value) {
        this.isAllRecordSelected = value;
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
     * Gets the value of the isManagerApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManagerApproved() {
        return isManagerApproved;
    }

    /**
     * Sets the value of the isManagerApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManagerApproved(Boolean value) {
        this.isManagerApproved = value;
    }

    /**
     * Gets the value of the managerApprovalRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerApprovalRemarks() {
        return managerApprovalRemarks;
    }

    /**
     * Sets the value of the managerApprovalRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerApprovalRemarks(String value) {
        this.managerApprovalRemarks = value;
    }

    /**
     * Gets the value of the maxNoOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNoOfRecord() {
        return maxNoOfRecord;
    }

    /**
     * Sets the value of the maxNoOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNoOfRecord(String value) {
        this.maxNoOfRecord = value;
    }

    /**
     * Gets the value of the minNoOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinNoOfRecord() {
        return minNoOfRecord;
    }

    /**
     * Sets the value of the minNoOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinNoOfRecord(String value) {
        this.minNoOfRecord = value;
    }

    /**
     * Gets the value of the orderCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderCreationDate() {
        return orderCreationDate;
    }

    /**
     * Sets the value of the orderCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderCreationDate(Long value) {
        this.orderCreationDate = value;
    }

    /**
     * Gets the value of the originalRequesterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalRequesterName() {
        return originalRequesterName;
    }

    /**
     * Sets the value of the originalRequesterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalRequesterName(String value) {
        this.originalRequesterName = value;
    }

    /**
     * Gets the value of the outputDataScopeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableDataScopeVO }
     *     
     */
    public ArrayOfTns2NillableDataScopeVO getOutputDataScopeOptions() {
        return outputDataScopeOptions;
    }

    /**
     * Sets the value of the outputDataScopeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableDataScopeVO }
     *     
     */
    public void setOutputDataScopeOptions(ArrayOfTns2NillableDataScopeVO value) {
        this.outputDataScopeOptions = value;
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
     * Gets the value of the outputOrderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderName() {
        return outputOrderName;
    }

    /**
     * Sets the value of the outputOrderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderName(String value) {
        this.outputOrderName = value;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeVO }
     *     
     */
    public DateRangeVO getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeVO }
     *     
     */
    public void setProductionDate(DateRangeVO value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeVO }
     *     
     */
    public DateRangeVO getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeVO }
     *     
     */
    public void setPublicationDate(DateRangeVO value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTypeVO }
     *     
     */
    public RecordTypeVO getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypeVO }
     *     
     */
    public void setRecordType(RecordTypeVO value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the requesterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterName() {
        return requesterName;
    }

    /**
     * Sets the value of the requesterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterName(String value) {
        this.requesterName = value;
    }

    /**
     * Gets the value of the toDoListHtmlText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDoListHtmlText() {
        return toDoListHtmlText;
    }

    /**
     * Sets the value of the toDoListHtmlText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDoListHtmlText(String value) {
        this.toDoListHtmlText = value;
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
     * Gets the value of the fullTxtPdfAttchmntsReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullTxtPdfAttchmntsReqd() {
        return fullTxtPdfAttchmntsReqd;
    }

    /**
     * Sets the value of the fullTxtPdfAttchmntsReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullTxtPdfAttchmntsReqd(Boolean value) {
        this.fullTxtPdfAttchmntsReqd = value;
    }

    /**
     * Gets the value of the outputOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public CodeListItemDetailsVO getOutputOrderStatus() {
        return outputOrderStatus;
    }

    /**
     * Sets the value of the outputOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public void setOutputOrderStatus(CodeListItemDetailsVO value) {
        this.outputOrderStatus = value;
    }

    /**
     * Gets the value of the attachmentTypeVOs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableAttachmentTypeVO }
     *     
     */
    public ArrayOfTns2NillableAttachmentTypeVO getAttachmentTypeVOs() {
        return attachmentTypeVOs;
    }

    /**
     * Sets the value of the attachmentTypeVOs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableAttachmentTypeVO }
     *     
     */
    public void setAttachmentTypeVOs(ArrayOfTns2NillableAttachmentTypeVO value) {
        this.attachmentTypeVOs = value;
    }

    /**
     * Gets the value of the isChunkDelvryReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsChunkDelvryReqd() {
        return isChunkDelvryReqd;
    }

    /**
     * Sets the value of the isChunkDelvryReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsChunkDelvryReqd(Boolean value) {
        this.isChunkDelvryReqd = value;
    }

}
