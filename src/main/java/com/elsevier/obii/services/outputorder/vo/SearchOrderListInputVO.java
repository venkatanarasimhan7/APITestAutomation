
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for SearchOrderListInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOrderListInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creationDateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creationDateTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderStatusClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderTypeClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOrderListInputVO", propOrder = {
    "creationDateFrom",
    "creationDateTo",
    "orderStatusClId",
    "orderTypeClId",
    "outputOrderId",
    "outputOrderName"
})
public class SearchOrderListInputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String creationDateFrom;
    @XmlElement(required = true, nillable = true)
    protected String creationDateTo;
    @XmlElement(required = true, nillable = true)
    protected String orderStatusClId;
    @XmlElement(required = true, nillable = true)
    protected String orderTypeClId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderName;

    /**
     * Gets the value of the creationDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateFrom() {
        return creationDateFrom;
    }

    /**
     * Sets the value of the creationDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateFrom(String value) {
        this.creationDateFrom = value;
    }

    /**
     * Gets the value of the creationDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateTo() {
        return creationDateTo;
    }

    /**
     * Sets the value of the creationDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTo(String value) {
        this.creationDateTo = value;
    }

    /**
     * Gets the value of the orderStatusClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatusClId() {
        return orderStatusClId;
    }

    /**
     * Sets the value of the orderStatusClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatusClId(String value) {
        this.orderStatusClId = value;
    }

    /**
     * Gets the value of the orderTypeClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTypeClId() {
        return orderTypeClId;
    }

    /**
     * Sets the value of the orderTypeClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTypeClId(String value) {
        this.orderTypeClId = value;
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

}
