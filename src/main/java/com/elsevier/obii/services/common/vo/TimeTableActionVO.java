
package com.elsevier.obii.services.common.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for TimeTableActionVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableActionVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputActivityIds" type="{http://vo.common.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="normalDurationDayQty" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="normalDurationHourQty" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="parcelTypeClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="supplierOrderTypeClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timeTableActionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timeTableClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableActionVO", propOrder = {
    "inputActivityIds",
    "normalDurationDayQty",
    "normalDurationHourQty",
    "parcelTypeClId",
    "supplierOrderTypeClId",
    "timeTableActionId",
    "timeTableClId"
})
public class TimeTableActionVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString inputActivityIds;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long normalDurationDayQty;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long normalDurationHourQty;
    @XmlElement(required = true, nillable = true)
    protected String parcelTypeClId;
    @XmlElement(required = true, nillable = true)
    protected String supplierOrderTypeClId;
    @XmlElement(required = true, nillable = true)
    protected String timeTableActionId;
    @XmlElement(required = true, nillable = true)
    protected String timeTableClId;

    /**
     * Gets the value of the inputActivityIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getInputActivityIds() {
        return inputActivityIds;
    }

    /**
     * Sets the value of the inputActivityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setInputActivityIds(ArrayOfXsdNillableString value) {
        this.inputActivityIds = value;
    }

    /**
     * Gets the value of the normalDurationDayQty property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNormalDurationDayQty() {
        return normalDurationDayQty;
    }

    /**
     * Sets the value of the normalDurationDayQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNormalDurationDayQty(Long value) {
        this.normalDurationDayQty = value;
    }

    /**
     * Gets the value of the normalDurationHourQty property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNormalDurationHourQty() {
        return normalDurationHourQty;
    }

    /**
     * Sets the value of the normalDurationHourQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNormalDurationHourQty(Long value) {
        this.normalDurationHourQty = value;
    }

    /**
     * Gets the value of the parcelTypeClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelTypeClId() {
        return parcelTypeClId;
    }

    /**
     * Sets the value of the parcelTypeClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelTypeClId(String value) {
        this.parcelTypeClId = value;
    }

    /**
     * Gets the value of the supplierOrderTypeClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierOrderTypeClId() {
        return supplierOrderTypeClId;
    }

    /**
     * Sets the value of the supplierOrderTypeClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierOrderTypeClId(String value) {
        this.supplierOrderTypeClId = value;
    }

    /**
     * Gets the value of the timeTableActionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTableActionId() {
        return timeTableActionId;
    }

    /**
     * Sets the value of the timeTableActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTableActionId(String value) {
        this.timeTableActionId = value;
    }

    /**
     * Gets the value of the timeTableClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTableClId() {
        return timeTableClId;
    }

    /**
     * Sets the value of the timeTableClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTableClId(String value) {
        this.timeTableClId = value;
    }

}
