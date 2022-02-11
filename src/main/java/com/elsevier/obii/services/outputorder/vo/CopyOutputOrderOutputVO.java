
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for CopyOutputOrderOutputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopyOutputOrderOutputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerDetails" type="{http://vo.outputorder.services.obii.elsevier.com}CustomerDetailsVO"/&gt;
 *         &lt;element name="divisionList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_ElsevierOrgUnitVO"/&gt;
 *         &lt;element name="groupList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_ElsevierOrgUnitVO"/&gt;
 *         &lt;element name="parentOutputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestDetails" type="{http://vo.outputorder.services.obii.elsevier.com}OutputRequestDetailsVO"/&gt;
 *         &lt;element name="requestForm" type="{http://vo.outputorder.services.obii.elsevier.com}RequestFormVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyOutputOrderOutputVO", propOrder = {
    "customerDetails",
    "divisionList",
    "groupList",
    "parentOutputOrderId",
    "requestDetails",
    "requestForm"
})
public class CopyOutputOrderOutputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected CustomerDetailsVO customerDetails;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableElsevierOrgUnitVO divisionList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableElsevierOrgUnitVO groupList;
    @XmlElement(required = true, nillable = true)
    protected String parentOutputOrderId;
    @XmlElement(required = true, nillable = true)
    protected OutputRequestDetailsVO requestDetails;
    @XmlElement(required = true, nillable = true)
    protected RequestFormVO requestForm;

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
     * Gets the value of the parentOutputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOutputOrderId() {
        return parentOutputOrderId;
    }

    /**
     * Sets the value of the parentOutputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOutputOrderId(String value) {
        this.parentOutputOrderId = value;
    }

    /**
     * Gets the value of the requestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OutputRequestDetailsVO }
     *     
     */
    public OutputRequestDetailsVO getRequestDetails() {
        return requestDetails;
    }

    /**
     * Sets the value of the requestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputRequestDetailsVO }
     *     
     */
    public void setRequestDetails(OutputRequestDetailsVO value) {
        this.requestDetails = value;
    }

    /**
     * Gets the value of the requestForm property.
     * 
     * @return
     *     possible object is
     *     {@link RequestFormVO }
     *     
     */
    public RequestFormVO getRequestForm() {
        return requestForm;
    }

    /**
     * Sets the value of the requestForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestFormVO }
     *     
     */
    public void setRequestForm(RequestFormVO value) {
        this.requestForm = value;
    }

}
