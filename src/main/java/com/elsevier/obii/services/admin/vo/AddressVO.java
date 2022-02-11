
package com.elsevier.obii.services.admin.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for AddressVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addressTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addressTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emailAddressList" type="{http://vo.admin.services.obii.elsevier.com}ArrayOfXSDAnyType"/&gt;
 *         &lt;element name="faxNumberList" type="{http://vo.admin.services.obii.elsevier.com}ArrayOfXSDAnyType"/&gt;
 *         &lt;element name="fileTransferAddressList" type="{http://vo.admin.services.obii.elsevier.com}ArrayOfXSDAnyType"/&gt;
 *         &lt;element name="physicalAddressList" type="{http://vo.admin.services.obii.elsevier.com}ArrayOfXSDAnyType"/&gt;
 *         &lt;element name="telephoneNumberList" type="{http://vo.admin.services.obii.elsevier.com}ArrayOfXSDAnyType"/&gt;
 *         &lt;element name="websiteList" type="{http://vo.admin.services.obii.elsevier.com}ArrayOfXSDAnyType"/&gt;
 *         &lt;element name="createdByUserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="efctvFromDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="efctvToDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastUpdateByUserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addressTypeClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressVO", propOrder = {
    "addressId",
    "addressTypeCode",
    "addressTypeName",
    "creationDate",
    "emailAddressList",
    "faxNumberList",
    "fileTransferAddressList",
    "physicalAddressList",
    "telephoneNumberList",
    "websiteList",
    "createdByUserId",
    "efctvFromDate",
    "efctvToDate",
    "lastUpdateByUserId",
    "lastUpdateDate",
    "partyId",
    "addressTypeClId"
})
public class AddressVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String addressId;
    @XmlElement(required = true, nillable = true)
    protected String addressTypeCode;
    @XmlElement(required = true, nillable = true)
    protected String addressTypeName;
    @XmlElement(required = true, nillable = true)
    protected String creationDate;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXSDAnyType emailAddressList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXSDAnyType faxNumberList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXSDAnyType fileTransferAddressList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXSDAnyType physicalAddressList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXSDAnyType telephoneNumberList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXSDAnyType websiteList;
    @XmlElement(required = true, nillable = true)
    protected String createdByUserId;
    @XmlElement(required = true, nillable = true)
    protected String efctvFromDate;
    @XmlElement(required = true, nillable = true)
    protected String efctvToDate;
    @XmlElement(required = true, nillable = true)
    protected String lastUpdateByUserId;
    @XmlElement(required = true, nillable = true)
    protected String lastUpdateDate;
    @XmlElement(required = true, nillable = true)
    protected String partyId;
    @XmlElement(required = true, nillable = true)
    protected String addressTypeClId;

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the addressTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Sets the value of the addressTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeCode(String value) {
        this.addressTypeCode = value;
    }

    /**
     * Gets the value of the addressTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeName() {
        return addressTypeName;
    }

    /**
     * Sets the value of the addressTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeName(String value) {
        this.addressTypeName = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the emailAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public ArrayOfXSDAnyType getEmailAddressList() {
        return emailAddressList;
    }

    /**
     * Sets the value of the emailAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public void setEmailAddressList(ArrayOfXSDAnyType value) {
        this.emailAddressList = value;
    }

    /**
     * Gets the value of the faxNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public ArrayOfXSDAnyType getFaxNumberList() {
        return faxNumberList;
    }

    /**
     * Sets the value of the faxNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public void setFaxNumberList(ArrayOfXSDAnyType value) {
        this.faxNumberList = value;
    }

    /**
     * Gets the value of the fileTransferAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public ArrayOfXSDAnyType getFileTransferAddressList() {
        return fileTransferAddressList;
    }

    /**
     * Sets the value of the fileTransferAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public void setFileTransferAddressList(ArrayOfXSDAnyType value) {
        this.fileTransferAddressList = value;
    }

    /**
     * Gets the value of the physicalAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public ArrayOfXSDAnyType getPhysicalAddressList() {
        return physicalAddressList;
    }

    /**
     * Sets the value of the physicalAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public void setPhysicalAddressList(ArrayOfXSDAnyType value) {
        this.physicalAddressList = value;
    }

    /**
     * Gets the value of the telephoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public ArrayOfXSDAnyType getTelephoneNumberList() {
        return telephoneNumberList;
    }

    /**
     * Sets the value of the telephoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public void setTelephoneNumberList(ArrayOfXSDAnyType value) {
        this.telephoneNumberList = value;
    }

    /**
     * Gets the value of the websiteList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public ArrayOfXSDAnyType getWebsiteList() {
        return websiteList;
    }

    /**
     * Sets the value of the websiteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public void setWebsiteList(ArrayOfXSDAnyType value) {
        this.websiteList = value;
    }

    /**
     * Gets the value of the createdByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByUserId() {
        return createdByUserId;
    }

    /**
     * Sets the value of the createdByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByUserId(String value) {
        this.createdByUserId = value;
    }

    /**
     * Gets the value of the efctvFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfctvFromDate() {
        return efctvFromDate;
    }

    /**
     * Sets the value of the efctvFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfctvFromDate(String value) {
        this.efctvFromDate = value;
    }

    /**
     * Gets the value of the efctvToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfctvToDate() {
        return efctvToDate;
    }

    /**
     * Sets the value of the efctvToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfctvToDate(String value) {
        this.efctvToDate = value;
    }

    /**
     * Gets the value of the lastUpdateByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateByUserId() {
        return lastUpdateByUserId;
    }

    /**
     * Sets the value of the lastUpdateByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateByUserId(String value) {
        this.lastUpdateByUserId = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDate(String value) {
        this.lastUpdateDate = value;
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
     * Gets the value of the addressTypeClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeClId() {
        return addressTypeClId;
    }

    /**
     * Sets the value of the addressTypeClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeClId(String value) {
        this.addressTypeClId = value;
    }

}
