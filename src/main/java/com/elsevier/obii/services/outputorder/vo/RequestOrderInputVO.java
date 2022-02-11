
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for RequestOrderInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestOrderInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abstractChangeTypeIds" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="abstractUseTypeIds" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="contactPersonIdList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="customerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customFormattingInstruction" type="{http://vo.outputorder.services.obii.elsevier.com}CustomFormattingInstructionVO"/&gt;
 *         &lt;element name="databaseRequestName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataElement" type="{http://vo.outputorder.services.obii.elsevier.com}DataElementsVO"/&gt;
 *         &lt;element name="deliveryInstruction" type="{http://vo.outputorder.services.obii.elsevier.com}DeliveryInstructionVO"/&gt;
 *         &lt;element name="emailDeliveryAddressIds" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="ftpDeliveryAddressId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputIndexDeliveryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isDeliveryNotificationMailReqd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxNoOfRecord" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="minNoOfRecord" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="physicalAddressId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productionDate" type="{http://vo.outputorder.services.obii.elsevier.com}DateRangeVO"/&gt;
 *         &lt;element name="publicationDate" type="{http://vo.outputorder.services.obii.elsevier.com}DateRangeVO"/&gt;
 *         &lt;element name="recordType" type="{http://vo.outputorder.services.obii.elsevier.com}RecordTypeVO"/&gt;
 *         &lt;element name="requestDataScopeIds" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="user" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *         &lt;element name="fullTxtPdfAttchmntsReqd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="selectedAttachmentTypes" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_long"/&gt;
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
@XmlType(name = "RequestOrderInputVO", propOrder = {
    "abstractChangeTypeIds",
    "abstractUseTypeIds",
    "contactPersonIdList",
    "customerDescription",
    "customerId",
    "customFormattingInstruction",
    "databaseRequestName",
    "dataElement",
    "deliveryInstruction",
    "emailDeliveryAddressIds",
    "ftpDeliveryAddressId",
    "groupId",
    "outputIndexDeliveryId",
    "isDeliveryNotificationMailReqd",
    "maxNoOfRecord",
    "minNoOfRecord",
    "physicalAddressId",
    "productionDate",
    "publicationDate",
    "recordType",
    "requestDataScopeIds",
    "user",
    "fullTxtPdfAttchmntsReqd",
    "selectedAttachmentTypes",
    "isChunkDelvryReqd"
})
public class RequestOrderInputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString abstractChangeTypeIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString abstractUseTypeIds;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString contactPersonIdList;
    @XmlElement(required = true, nillable = true)
    protected String customerDescription;
    @XmlElement(required = true, nillable = true)
    protected String customerId;
    @XmlElement(required = true, nillable = true)
    protected CustomFormattingInstructionVO customFormattingInstruction;
    @XmlElement(required = true, nillable = true)
    protected String databaseRequestName;
    @XmlElement(required = true, nillable = true)
    protected DataElementsVO dataElement;
    @XmlElement(required = true, nillable = true)
    protected DeliveryInstructionVO deliveryInstruction;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString emailDeliveryAddressIds;
    @XmlElement(required = true, nillable = true)
    protected String ftpDeliveryAddressId;
    @XmlElement(required = true, nillable = true)
    protected String groupId;
    @XmlElement(required = true, nillable = true)
    protected String outputIndexDeliveryId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isDeliveryNotificationMailReqd;
    @XmlElement(required = true, nillable = true)
    protected String maxNoOfRecord;
    @XmlElement(required = true, nillable = true)
    protected String minNoOfRecord;
    @XmlElement(required = true, nillable = true)
    protected String physicalAddressId;
    @XmlElement(required = true, nillable = true)
    protected DateRangeVO productionDate;
    @XmlElement(required = true, nillable = true)
    protected DateRangeVO publicationDate;
    @XmlElement(required = true, nillable = true)
    protected RecordTypeVO recordType;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString requestDataScopeIds;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean fullTxtPdfAttchmntsReqd;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableLong selectedAttachmentTypes;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isChunkDelvryReqd;

    /**
     * Gets the value of the abstractChangeTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getAbstractChangeTypeIds() {
        return abstractChangeTypeIds;
    }

    /**
     * Sets the value of the abstractChangeTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setAbstractChangeTypeIds(ArrayOfXsdNillableString value) {
        this.abstractChangeTypeIds = value;
    }

    /**
     * Gets the value of the abstractUseTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getAbstractUseTypeIds() {
        return abstractUseTypeIds;
    }

    /**
     * Sets the value of the abstractUseTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setAbstractUseTypeIds(ArrayOfXsdNillableString value) {
        this.abstractUseTypeIds = value;
    }

    /**
     * Gets the value of the contactPersonIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getContactPersonIdList() {
        return contactPersonIdList;
    }

    /**
     * Sets the value of the contactPersonIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setContactPersonIdList(ArrayOfXsdNillableString value) {
        this.contactPersonIdList = value;
    }

    /**
     * Gets the value of the customerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDescription() {
        return customerDescription;
    }

    /**
     * Sets the value of the customerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDescription(String value) {
        this.customerDescription = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
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
     * Gets the value of the databaseRequestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseRequestName() {
        return databaseRequestName;
    }

    /**
     * Sets the value of the databaseRequestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseRequestName(String value) {
        this.databaseRequestName = value;
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
     * Gets the value of the emailDeliveryAddressIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getEmailDeliveryAddressIds() {
        return emailDeliveryAddressIds;
    }

    /**
     * Sets the value of the emailDeliveryAddressIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setEmailDeliveryAddressIds(ArrayOfXsdNillableString value) {
        this.emailDeliveryAddressIds = value;
    }

    /**
     * Gets the value of the ftpDeliveryAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpDeliveryAddressId() {
        return ftpDeliveryAddressId;
    }

    /**
     * Sets the value of the ftpDeliveryAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpDeliveryAddressId(String value) {
        this.ftpDeliveryAddressId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the outputIndexDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputIndexDeliveryId() {
        return outputIndexDeliveryId;
    }

    /**
     * Sets the value of the outputIndexDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputIndexDeliveryId(String value) {
        this.outputIndexDeliveryId = value;
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
     * Gets the value of the physicalAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddressId() {
        return physicalAddressId;
    }

    /**
     * Sets the value of the physicalAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddressId(String value) {
        this.physicalAddressId = value;
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
     * Gets the value of the requestDataScopeIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getRequestDataScopeIds() {
        return requestDataScopeIds;
    }

    /**
     * Sets the value of the requestDataScopeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setRequestDataScopeIds(ArrayOfXsdNillableString value) {
        this.requestDataScopeIds = value;
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
     * Gets the value of the selectedAttachmentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableLong }
     *     
     */
    public ArrayOfXsdNillableLong getSelectedAttachmentTypes() {
        return selectedAttachmentTypes;
    }

    /**
     * Sets the value of the selectedAttachmentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableLong }
     *     
     */
    public void setSelectedAttachmentTypes(ArrayOfXsdNillableLong value) {
        this.selectedAttachmentTypes = value;
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
