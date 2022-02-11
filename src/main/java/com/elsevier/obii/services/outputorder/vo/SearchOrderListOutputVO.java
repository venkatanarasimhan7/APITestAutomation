
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.common.vo.CodeListItemDetailsVO;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for SearchOrderListOutputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOrderListOutputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdByUser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderStatus" type="{http://vo.common.services.obii.elsevier.com}CodeListItemDetailsVO"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderType" type="{http://vo.common.services.obii.elsevier.com}CodeListItemDetailsVO"/&gt;
 *         &lt;element name="parentOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOrderListOutputVO", propOrder = {
    "createdByUser",
    "creationDate",
    "orderStatus",
    "outputOrderId",
    "outputOrderType",
    "parentOrderId",
    "requestName"
})
public class SearchOrderListOutputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String createdByUser;
    @XmlElement(required = true, nillable = true)
    protected String creationDate;
    @XmlElement(required = true, nillable = true)
    protected CodeListItemDetailsVO orderStatus;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected CodeListItemDetailsVO outputOrderType;
    @XmlElement(required = true, nillable = true)
    protected String parentOrderId;
    @XmlElement(required = true, nillable = true)
    protected String requestName;

    /**
     * Gets the value of the createdByUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByUser() {
        return createdByUser;
    }

    /**
     * Sets the value of the createdByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByUser(String value) {
        this.createdByUser = value;
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
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public CodeListItemDetailsVO getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public void setOrderStatus(CodeListItemDetailsVO value) {
        this.orderStatus = value;
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
     * Gets the value of the outputOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public CodeListItemDetailsVO getOutputOrderType() {
        return outputOrderType;
    }

    /**
     * Sets the value of the outputOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public void setOutputOrderType(CodeListItemDetailsVO value) {
        this.outputOrderType = value;
    }

    /**
     * Gets the value of the parentOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrderId() {
        return parentOrderId;
    }

    /**
     * Sets the value of the parentOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrderId(String value) {
        this.parentOrderId = value;
    }

    /**
     * Gets the value of the requestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestName() {
        return requestName;
    }

    /**
     * Sets the value of the requestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestName(String value) {
        this.requestName = value;
    }

}
