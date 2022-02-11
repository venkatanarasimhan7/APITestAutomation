
package com.elsevier.obii.services.query.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchProfileSQLText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="searchProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderDeliveryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputResultSetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentOutputOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="compositeQueryInd" type="{http://xml.apache.org/xml-soap}char" minOccurs="0"/&gt;
 *         &lt;element name="correlationinfo" type="{http://vo.query.services.obii.elsevier.com}NameValuePairVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInputVO", propOrder = {
    "searchProfileSQLText",
    "searchProfileId",
    "outputOrderDeliveryId",
    "outputOrderId",
    "outputResultSetId",
    "outputOrderTypeCode",
    "parentOutputOrderId",
    "compositeQueryInd",
    "correlationinfo"
})
public class QueryInputVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String searchProfileSQLText;
    protected String searchProfileId;
    protected String outputOrderDeliveryId;
    protected String outputOrderId;
    protected String outputResultSetId;
    protected String outputOrderTypeCode;
    protected String parentOutputOrderId;
    protected String compositeQueryInd;
    protected NameValuePairVO correlationinfo;

    /**
     * Gets the value of the searchProfileSQLText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchProfileSQLText() {
        return searchProfileSQLText;
    }

    /**
     * Sets the value of the searchProfileSQLText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchProfileSQLText(String value) {
        this.searchProfileSQLText = value;
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
     * Gets the value of the outputOrderDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderDeliveryId() {
        return outputOrderDeliveryId;
    }

    /**
     * Sets the value of the outputOrderDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderDeliveryId(String value) {
        this.outputOrderDeliveryId = value;
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
     * Gets the value of the outputOrderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderTypeCode() {
        return outputOrderTypeCode;
    }

    /**
     * Sets the value of the outputOrderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderTypeCode(String value) {
        this.outputOrderTypeCode = value;
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
     * Gets the value of the compositeQueryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeQueryInd() {
        return compositeQueryInd;
    }

    /**
     * Sets the value of the compositeQueryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeQueryInd(String value) {
        this.compositeQueryInd = value;
    }

    /**
     * Gets the value of the correlationinfo property.
     * 
     * @return
     *     possible object is
     *     {@link NameValuePairVO }
     *     
     */
    public NameValuePairVO getCorrelationinfo() {
        return correlationinfo;
    }

    /**
     * Sets the value of the correlationinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValuePairVO }
     *     
     */
    public void setCorrelationinfo(NameValuePairVO value) {
        this.correlationinfo = value;
    }

}
