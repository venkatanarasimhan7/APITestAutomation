
package com.elsevier.obii.services.common.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for SupplierInfoVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierInfoVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyInfo" type="{http://vo.common.services.obii.elsevier.com}PartyInfoVO"/&gt;
 *         &lt;element name="supplierProcessingOrderType" type="{http://vo.common.services.obii.elsevier.com}CodeListItemDetailsVO"/&gt;
 *         &lt;element name="partySupplPrcsgOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierInfoVO", propOrder = {
    "partyInfo",
    "supplierProcessingOrderType",
    "partySupplPrcsgOrderId"
})
public class SupplierInfoVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected PartyInfoVO partyInfo;
    @XmlElement(required = true, nillable = true)
    protected CodeListItemDetailsVO supplierProcessingOrderType;
    @XmlElement(required = true, nillable = true)
    protected String partySupplPrcsgOrderId;

    /**
     * Gets the value of the partyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInfoVO }
     *     
     */
    public PartyInfoVO getPartyInfo() {
        return partyInfo;
    }

    /**
     * Sets the value of the partyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInfoVO }
     *     
     */
    public void setPartyInfo(PartyInfoVO value) {
        this.partyInfo = value;
    }

    /**
     * Gets the value of the supplierProcessingOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public CodeListItemDetailsVO getSupplierProcessingOrderType() {
        return supplierProcessingOrderType;
    }

    /**
     * Sets the value of the supplierProcessingOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public void setSupplierProcessingOrderType(CodeListItemDetailsVO value) {
        this.supplierProcessingOrderType = value;
    }

    /**
     * Gets the value of the partySupplPrcsgOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartySupplPrcsgOrderId() {
        return partySupplPrcsgOrderId;
    }

    /**
     * Sets the value of the partySupplPrcsgOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartySupplPrcsgOrderId(String value) {
        this.partySupplPrcsgOrderId = value;
    }

}
