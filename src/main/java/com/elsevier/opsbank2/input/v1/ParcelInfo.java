
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParcelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParcelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelTypeClId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParcelFTPAddrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParcelFTPAddrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classificationInfo" type="{http://www.elsevier.com/opsbank2/input/v1}classificationInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParcelInfo", propOrder = {
    "parcelId",
    "parcelUnitId",
    "parcelTypeClId",
    "parcelFTPAddrId",
    "parcelFTPAddrName",
    "sourceId",
    "sourceName",
    "classificationInfo"
})
public class ParcelInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String parcelId;
    protected String parcelUnitId;
    protected String parcelTypeClId;
    @XmlElement(name = "ParcelFTPAddrId")
    protected String parcelFTPAddrId;
    @XmlElement(name = "ParcelFTPAddrName")
    protected String parcelFTPAddrName;
    @XmlElement(name = "SourceId")
    protected String sourceId;
    @XmlElement(name = "SourceName")
    protected String sourceName;
    protected List<ClassificationInfo> classificationInfo;

    /**
     * Gets the value of the parcelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelId() {
        return parcelId;
    }

    /**
     * Sets the value of the parcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelId(String value) {
        this.parcelId = value;
    }

    /**
     * Gets the value of the parcelUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelUnitId() {
        return parcelUnitId;
    }

    /**
     * Sets the value of the parcelUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelUnitId(String value) {
        this.parcelUnitId = value;
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
     * Gets the value of the parcelFTPAddrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelFTPAddrId() {
        return parcelFTPAddrId;
    }

    /**
     * Sets the value of the parcelFTPAddrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelFTPAddrId(String value) {
        this.parcelFTPAddrId = value;
    }

    /**
     * Gets the value of the parcelFTPAddrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelFTPAddrName() {
        return parcelFTPAddrName;
    }

    /**
     * Sets the value of the parcelFTPAddrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelFTPAddrName(String value) {
        this.parcelFTPAddrName = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the classificationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationInfo }
     * 
     * 
     */
    public List<ClassificationInfo> getClassificationInfo() {
        if (classificationInfo == null) {
            classificationInfo = new ArrayList<ClassificationInfo>();
        }
        return this.classificationInfo;
    }

}
