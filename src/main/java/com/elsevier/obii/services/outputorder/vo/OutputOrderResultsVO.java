
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for OutputOrderResultsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputOrderResultsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outputDeliveryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputResultSetId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rowsAffected" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="searchProfileId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timeRequired" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputOrderResultsVO", propOrder = {
    "outputDeliveryId",
    "outputOrderId",
    "outputResultSetId",
    "rowsAffected",
    "searchProfileId",
    "timeRequired"
})
public class OutputOrderResultsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String outputDeliveryId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String outputResultSetId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long rowsAffected;
    @XmlElement(required = true, nillable = true)
    protected String searchProfileId;
    @XmlElement(required = true, nillable = true)
    protected String timeRequired;

    /**
     * Gets the value of the outputDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDeliveryId() {
        return outputDeliveryId;
    }

    /**
     * Sets the value of the outputDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDeliveryId(String value) {
        this.outputDeliveryId = value;
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
     * Gets the value of the outputResultSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputResultSetId() {
        return outputResultSetId;
    }

    /**
     * Sets the value of the outputResultSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputResultSetId(String value) {
        this.outputResultSetId = value;
    }

    /**
     * Gets the value of the rowsAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    /**
     * Sets the value of the rowsAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRowsAffected(Long value) {
        this.rowsAffected = value;
    }

    /**
     * Gets the value of the searchProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchProfileId() {
        return searchProfileId;
    }

    /**
     * Sets the value of the searchProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchProfileId(String value) {
        this.searchProfileId = value;
    }

    /**
     * Gets the value of the timeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeRequired() {
        return timeRequired;
    }

    /**
     * Sets the value of the timeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeRequired(String value) {
        this.timeRequired = value;
    }

}
