
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportCARFileInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportCARFileInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exhibitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="successful" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CorrelationInfo" type="{http://www.elsevier.com/opsbank2/input/v1}CorrelationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportCARFileInfo", propOrder = {
    "carId",
    "activityId",
    "filePath",
    "exhibitId",
    "remarks",
    "successful",
    "correlationInfo"
})
public class ExportCARFileInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String carId;
    protected String activityId;
    protected String filePath;
    protected String exhibitId;
    protected String remarks;
    protected Boolean successful;
    @XmlElement(name = "CorrelationInfo")
    protected CorrelationInfo correlationInfo;

    /**
     * Gets the value of the carId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarId(String value) {
        this.carId = value;
    }

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityId(String value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the exhibitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExhibitId() {
        return exhibitId;
    }

    /**
     * Sets the value of the exhibitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExhibitId(String value) {
        this.exhibitId = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the successful property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccessful(Boolean value) {
        this.successful = value;
    }

    /**
     * Gets the value of the correlationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationInfo }
     *     
     */
    public CorrelationInfo getCorrelationInfo() {
        return correlationInfo;
    }

    /**
     * Sets the value of the correlationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationInfo }
     *     
     */
    public void setCorrelationInfo(CorrelationInfo value) {
        this.correlationInfo = value;
    }

}
