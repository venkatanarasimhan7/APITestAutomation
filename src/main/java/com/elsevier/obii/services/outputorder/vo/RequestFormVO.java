
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for RequestFormVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestFormVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abstractChangeTypeList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *         &lt;element name="customerList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_CustomerDetailsVO"/&gt;
 *         &lt;element name="customFmtSupplierInfo" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_PartyInfoVO"/&gt;
 *         &lt;element name="dataScopeOptions" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_DataScopeVO"/&gt;
 *         &lt;element name="externalDelvryMediums" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *         &lt;element name="externalDelvrySupplierInfo" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_PartyInfoVO"/&gt;
 *         &lt;element name="indexTypeOptions" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_OutputIndexVO"/&gt;
 *         &lt;element name="internalDelvryMethods" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *         &lt;element name="businessUnitList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_ElsevierOrgUnitVO"/&gt;
 *         &lt;element name="originalRequester" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *         &lt;element name="abstarctUseTypeList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *         &lt;element name="requester" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *         &lt;element name="attachmentTypeVOs" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_AttachmentTypeVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestFormVO", propOrder = {
    "abstractChangeTypeList",
    "customerList",
    "customFmtSupplierInfo",
    "dataScopeOptions",
    "externalDelvryMediums",
    "externalDelvrySupplierInfo",
    "indexTypeOptions",
    "internalDelvryMethods",
    "businessUnitList",
    "originalRequester",
    "abstarctUseTypeList",
    "requester",
    "attachmentTypeVOs"
})
public class RequestFormVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO abstractChangeTypeList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableCustomerDetailsVO customerList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillablePartyInfoVO customFmtSupplierInfo;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableDataScopeVO dataScopeOptions;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO externalDelvryMediums;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillablePartyInfoVO externalDelvrySupplierInfo;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableOutputIndexVO indexTypeOptions;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO internalDelvryMethods;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableElsevierOrgUnitVO businessUnitList;
    @XmlElement(required = true, nillable = true)
    protected UserVO originalRequester;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO abstarctUseTypeList;
    @XmlElement(required = true, nillable = true)
    protected UserVO requester;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableAttachmentTypeVO attachmentTypeVOs;

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
     * Gets the value of the customerList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableCustomerDetailsVO }
     *     
     */
    public ArrayOfTns2NillableCustomerDetailsVO getCustomerList() {
        return customerList;
    }

    /**
     * Sets the value of the customerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableCustomerDetailsVO }
     *     
     */
    public void setCustomerList(ArrayOfTns2NillableCustomerDetailsVO value) {
        this.customerList = value;
    }

    /**
     * Gets the value of the customFmtSupplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillablePartyInfoVO }
     *     
     */
    public ArrayOfTns8NillablePartyInfoVO getCustomFmtSupplierInfo() {
        return customFmtSupplierInfo;
    }

    /**
     * Sets the value of the customFmtSupplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillablePartyInfoVO }
     *     
     */
    public void setCustomFmtSupplierInfo(ArrayOfTns8NillablePartyInfoVO value) {
        this.customFmtSupplierInfo = value;
    }

    /**
     * Gets the value of the dataScopeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableDataScopeVO }
     *     
     */
    public ArrayOfTns2NillableDataScopeVO getDataScopeOptions() {
        return dataScopeOptions;
    }

    /**
     * Sets the value of the dataScopeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableDataScopeVO }
     *     
     */
    public void setDataScopeOptions(ArrayOfTns2NillableDataScopeVO value) {
        this.dataScopeOptions = value;
    }

    /**
     * Gets the value of the externalDelvryMediums property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public ArrayOfTns8NillableCodeListItemDetailsVO getExternalDelvryMediums() {
        return externalDelvryMediums;
    }

    /**
     * Sets the value of the externalDelvryMediums property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public void setExternalDelvryMediums(ArrayOfTns8NillableCodeListItemDetailsVO value) {
        this.externalDelvryMediums = value;
    }

    /**
     * Gets the value of the externalDelvrySupplierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillablePartyInfoVO }
     *     
     */
    public ArrayOfTns8NillablePartyInfoVO getExternalDelvrySupplierInfo() {
        return externalDelvrySupplierInfo;
    }

    /**
     * Sets the value of the externalDelvrySupplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillablePartyInfoVO }
     *     
     */
    public void setExternalDelvrySupplierInfo(ArrayOfTns8NillablePartyInfoVO value) {
        this.externalDelvrySupplierInfo = value;
    }

    /**
     * Gets the value of the indexTypeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableOutputIndexVO }
     *     
     */
    public ArrayOfTns2NillableOutputIndexVO getIndexTypeOptions() {
        return indexTypeOptions;
    }

    /**
     * Sets the value of the indexTypeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableOutputIndexVO }
     *     
     */
    public void setIndexTypeOptions(ArrayOfTns2NillableOutputIndexVO value) {
        this.indexTypeOptions = value;
    }

    /**
     * Gets the value of the internalDelvryMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public ArrayOfTns8NillableCodeListItemDetailsVO getInternalDelvryMethods() {
        return internalDelvryMethods;
    }

    /**
     * Sets the value of the internalDelvryMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public void setInternalDelvryMethods(ArrayOfTns8NillableCodeListItemDetailsVO value) {
        this.internalDelvryMethods = value;
    }

    /**
     * Gets the value of the businessUnitList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillableElsevierOrgUnitVO }
     *     
     */
    public ArrayOfTns8NillableElsevierOrgUnitVO getBusinessUnitList() {
        return businessUnitList;
    }

    /**
     * Sets the value of the businessUnitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillableElsevierOrgUnitVO }
     *     
     */
    public void setBusinessUnitList(ArrayOfTns8NillableElsevierOrgUnitVO value) {
        this.businessUnitList = value;
    }

    /**
     * Gets the value of the originalRequester property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getOriginalRequester() {
        return originalRequester;
    }

    /**
     * Sets the value of the originalRequester property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setOriginalRequester(UserVO value) {
        this.originalRequester = value;
    }

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
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setRequester(UserVO value) {
        this.requester = value;
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

}
