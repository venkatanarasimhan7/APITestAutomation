
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputDelivery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryInfo" type="{http://www.elsevier.com/opsbank2/input/v1}DeliveryInfo" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryUnitInfo" type="{http://www.elsevier.com/opsbank2/input/v1}DeliveryUnitInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItemFileInfo" type="{http://www.elsevier.com/opsbank2/input/v1}ItemFileInfo" minOccurs="0"/&gt;
 *         &lt;element name="unProcessedSupplierUnitIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProblemInfo" type="{http://www.elsevier.com/opsbank2/input/v1}ProblemInfo" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OperationInfo" type="{http://www.elsevier.com/opsbank2/input/v1}OperationInfo" minOccurs="0"/&gt;
 *         &lt;element name="PartyInfo" type="{http://www.elsevier.com/opsbank2/input/v1}PartyInfo" minOccurs="0"/&gt;
 *         &lt;element name="SupplierProblemDetails" type="{http://www.elsevier.com/opsbank2/input/v1}ProblTypeInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputDelivery", propOrder = {
    "deliveryInfo",
    "deliveryUnitInfo",
    "itemFileInfo",
    "unProcessedSupplierUnitIDs",
    "problemInfo",
    "code",
    "remarks",
    "operationInfo",
    "partyInfo",
    "supplierProblemDetails"
})
public class InputDelivery
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DeliveryInfo")
    protected DeliveryInfo deliveryInfo;
    @XmlElement(name = "DeliveryUnitInfo")
    protected List<DeliveryUnitInfo> deliveryUnitInfo;
    @XmlElement(name = "ItemFileInfo")
    protected ItemFileInfo itemFileInfo;
    protected List<String> unProcessedSupplierUnitIDs;
    @XmlElement(name = "ProblemInfo")
    protected ProblemInfo problemInfo;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Remarks")
    protected List<String> remarks;
    @XmlElement(name = "OperationInfo")
    protected OperationInfo operationInfo;
    @XmlElement(name = "PartyInfo")
    protected PartyInfo partyInfo;
    @XmlElement(name = "SupplierProblemDetails")
    protected List<ProblTypeInfo> supplierProblemDetails;

    /**
     * Gets the value of the deliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInfo }
     *     
     */
    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     * Sets the value of the deliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInfo }
     *     
     */
    public void setDeliveryInfo(DeliveryInfo value) {
        this.deliveryInfo = value;
    }

    /**
     * Gets the value of the deliveryUnitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryUnitInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryUnitInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryUnitInfo }
     * 
     * 
     */
    public List<DeliveryUnitInfo> getDeliveryUnitInfo() {
        if (deliveryUnitInfo == null) {
            deliveryUnitInfo = new ArrayList<DeliveryUnitInfo>();
        }
        return this.deliveryUnitInfo;
    }

    /**
     * Gets the value of the itemFileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFileInfo }
     *     
     */
    public ItemFileInfo getItemFileInfo() {
        return itemFileInfo;
    }

    /**
     * Sets the value of the itemFileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFileInfo }
     *     
     */
    public void setItemFileInfo(ItemFileInfo value) {
        this.itemFileInfo = value;
    }

    /**
     * Gets the value of the unProcessedSupplierUnitIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unProcessedSupplierUnitIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnProcessedSupplierUnitIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnProcessedSupplierUnitIDs() {
        if (unProcessedSupplierUnitIDs == null) {
            unProcessedSupplierUnitIDs = new ArrayList<String>();
        }
        return this.unProcessedSupplierUnitIDs;
    }

    /**
     * Gets the value of the problemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemInfo }
     *     
     */
    public ProblemInfo getProblemInfo() {
        return problemInfo;
    }

    /**
     * Sets the value of the problemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemInfo }
     *     
     */
    public void setProblemInfo(ProblemInfo value) {
        this.problemInfo = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<String>();
        }
        return this.remarks;
    }

    /**
     * Gets the value of the operationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperationInfo }
     *     
     */
    public OperationInfo getOperationInfo() {
        return operationInfo;
    }

    /**
     * Sets the value of the operationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationInfo }
     *     
     */
    public void setOperationInfo(OperationInfo value) {
        this.operationInfo = value;
    }

    /**
     * Gets the value of the partyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInfo }
     *     
     */
    public PartyInfo getPartyInfo() {
        return partyInfo;
    }

    /**
     * Sets the value of the partyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInfo }
     *     
     */
    public void setPartyInfo(PartyInfo value) {
        this.partyInfo = value;
    }

    /**
     * Gets the value of the supplierProblemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierProblemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierProblemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProblTypeInfo }
     * 
     * 
     */
    public List<ProblTypeInfo> getSupplierProblemDetails() {
        if (supplierProblemDetails == null) {
            supplierProblemDetails = new ArrayList<ProblTypeInfo>();
        }
        return this.supplierProblemDetails;
    }

}
