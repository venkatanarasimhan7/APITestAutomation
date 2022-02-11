
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for UpdateProductionOrderRequestVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateProductionOrderRequestVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessUnitList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_ElsevierOrgUnitVO"/&gt;
 *         &lt;element name="changeOutputOrderDetails" type="{http://vo.outputorder.services.obii.elsevier.com}ChangeOutputOrderDetailsVO"/&gt;
 *         &lt;element name="customerDetails" type="{http://vo.outputorder.services.obii.elsevier.com}CustomerDetailsVO"/&gt;
 *         &lt;element name="divisionList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_ElsevierOrgUnitVO"/&gt;
 *         &lt;element name="groupList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_ElsevierOrgUnitVO"/&gt;
 *         &lt;element name="externalDelvryMediums" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *         &lt;element name="externalDelvrySupplierInfo" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_PartyInfoVO"/&gt;
 *         &lt;element name="internalDelvryMethods" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProductionOrderRequestVO", propOrder = {
    "businessUnitList",
    "changeOutputOrderDetails",
    "customerDetails",
    "divisionList",
    "groupList",
    "externalDelvryMediums",
    "externalDelvrySupplierInfo",
    "internalDelvryMethods"
})
public class UpdateProductionOrderRequestVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableElsevierOrgUnitVO businessUnitList;
    @XmlElement(required = true, nillable = true)
    protected ChangeOutputOrderDetailsVO changeOutputOrderDetails;
    @XmlElement(required = true, nillable = true)
    protected CustomerDetailsVO customerDetails;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableElsevierOrgUnitVO divisionList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableElsevierOrgUnitVO groupList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO externalDelvryMediums;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillablePartyInfoVO externalDelvrySupplierInfo;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO internalDelvryMethods;

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
     * Gets the value of the changeOutputOrderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeOutputOrderDetailsVO }
     *     
     */
    public ChangeOutputOrderDetailsVO getChangeOutputOrderDetails() {
        return changeOutputOrderDetails;
    }

    /**
     * Sets the value of the changeOutputOrderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOutputOrderDetailsVO }
     *     
     */
    public void setChangeOutputOrderDetails(ChangeOutputOrderDetailsVO value) {
        this.changeOutputOrderDetails = value;
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
     * Gets the value of the divisionList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillableElsevierOrgUnitVO }
     *     
     */
    public ArrayOfTns8NillableElsevierOrgUnitVO getDivisionList() {
        return divisionList;
    }

    /**
     * Sets the value of the divisionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillableElsevierOrgUnitVO }
     *     
     */
    public void setDivisionList(ArrayOfTns8NillableElsevierOrgUnitVO value) {
        this.divisionList = value;
    }

    /**
     * Gets the value of the groupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillableElsevierOrgUnitVO }
     *     
     */
    public ArrayOfTns8NillableElsevierOrgUnitVO getGroupList() {
        return groupList;
    }

    /**
     * Sets the value of the groupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillableElsevierOrgUnitVO }
     *     
     */
    public void setGroupList(ArrayOfTns8NillableElsevierOrgUnitVO value) {
        this.groupList = value;
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

}
