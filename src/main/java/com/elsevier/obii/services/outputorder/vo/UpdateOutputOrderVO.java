
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for UpdateOutputOrderVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOutputOrderVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactPersonIdList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="customerDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isDeliveryNotificationMailReqd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="physicalAddressId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *         &lt;element name="deliveryInstruction" type="{http://vo.outputorder.services.obii.elsevier.com}DeliveryInstructionVO"/&gt;
 *         &lt;element name="emailDeliveryAddressIds" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="ftpDeliveryAddressId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="removeAttachmentFileList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOutputOrderVO", propOrder = {
    "contactPersonIdList",
    "customerDescription",
    "groupId",
    "isDeliveryNotificationMailReqd",
    "outputOrderId",
    "physicalAddressId",
    "user",
    "deliveryInstruction",
    "emailDeliveryAddressIds",
    "ftpDeliveryAddressId",
    "outputOrderName",
    "removeAttachmentFileList"
})
public class UpdateOutputOrderVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString contactPersonIdList;
    @XmlElement(required = true, nillable = true)
    protected String customerDescription;
    @XmlElement(required = true, nillable = true)
    protected String groupId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isDeliveryNotificationMailReqd;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String physicalAddressId;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;
    @XmlElement(required = true, nillable = true)
    protected DeliveryInstructionVO deliveryInstruction;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString emailDeliveryAddressIds;
    @XmlElement(required = true, nillable = true)
    protected String ftpDeliveryAddressId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString removeAttachmentFileList;

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
     * Gets the value of the removeAttachmentFileList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getRemoveAttachmentFileList() {
        return removeAttachmentFileList;
    }

    /**
     * Sets the value of the removeAttachmentFileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setRemoveAttachmentFileList(ArrayOfXsdNillableString value) {
        this.removeAttachmentFileList = value;
    }

}
