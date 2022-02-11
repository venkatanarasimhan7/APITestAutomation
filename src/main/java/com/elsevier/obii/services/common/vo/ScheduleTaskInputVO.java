
package com.elsevier.obii.services.common.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for ScheduleTaskInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleTaskInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createByUserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="efctvFromDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="efctvToDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="frequencyStringtxt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oneoff" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="schedulePriorityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scheduleTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scheduleTypeIdList" type="{http://vo.common.services.obii.elsevier.com}ArrayOfXSDAnyType"/&gt;
 *         &lt;element name="scheduleStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wsTaskId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="creationFromDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creationToDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleTaskInputVO", propOrder = {
    "createByUserName",
    "efctvFromDate",
    "efctvToDate",
    "frequencyStringtxt",
    "oneoff",
    "scheduleId",
    "schedulePriorityCode",
    "scheduleTypeCode",
    "scheduleTypeIdList",
    "scheduleStatusCode",
    "wsTaskId",
    "creationFromDate",
    "creationToDate"
})
public class ScheduleTaskInputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String createByUserName;
    @XmlElement(required = true, nillable = true)
    protected String efctvFromDate;
    @XmlElement(required = true, nillable = true)
    protected String efctvToDate;
    @XmlElement(required = true, nillable = true)
    protected String frequencyStringtxt;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean oneoff;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long scheduleId;
    @XmlElement(required = true, nillable = true)
    protected String schedulePriorityCode;
    @XmlElement(required = true, nillable = true)
    protected String scheduleTypeCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXSDAnyType scheduleTypeIdList;
    @XmlElement(required = true, nillable = true)
    protected String scheduleStatusCode;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long wsTaskId;
    @XmlElement(required = true, nillable = true)
    protected String creationFromDate;
    @XmlElement(required = true, nillable = true)
    protected String creationToDate;

    /**
     * Gets the value of the createByUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateByUserName() {
        return createByUserName;
    }

    /**
     * Sets the value of the createByUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateByUserName(String value) {
        this.createByUserName = value;
    }

    /**
     * Gets the value of the efctvFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfctvFromDate() {
        return efctvFromDate;
    }

    /**
     * Sets the value of the efctvFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfctvFromDate(String value) {
        this.efctvFromDate = value;
    }

    /**
     * Gets the value of the efctvToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfctvToDate() {
        return efctvToDate;
    }

    /**
     * Sets the value of the efctvToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfctvToDate(String value) {
        this.efctvToDate = value;
    }

    /**
     * Gets the value of the frequencyStringtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyStringtxt() {
        return frequencyStringtxt;
    }

    /**
     * Sets the value of the frequencyStringtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyStringtxt(String value) {
        this.frequencyStringtxt = value;
    }

    /**
     * Gets the value of the oneoff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneoff() {
        return oneoff;
    }

    /**
     * Sets the value of the oneoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneoff(Boolean value) {
        this.oneoff = value;
    }

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScheduleId(Long value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the schedulePriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulePriorityCode() {
        return schedulePriorityCode;
    }

    /**
     * Sets the value of the schedulePriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulePriorityCode(String value) {
        this.schedulePriorityCode = value;
    }

    /**
     * Gets the value of the scheduleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleTypeCode() {
        return scheduleTypeCode;
    }

    /**
     * Sets the value of the scheduleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleTypeCode(String value) {
        this.scheduleTypeCode = value;
    }

    /**
     * Gets the value of the scheduleTypeIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public ArrayOfXSDAnyType getScheduleTypeIdList() {
        return scheduleTypeIdList;
    }

    /**
     * Sets the value of the scheduleTypeIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXSDAnyType }
     *     
     */
    public void setScheduleTypeIdList(ArrayOfXSDAnyType value) {
        this.scheduleTypeIdList = value;
    }

    /**
     * Gets the value of the scheduleStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleStatusCode() {
        return scheduleStatusCode;
    }

    /**
     * Sets the value of the scheduleStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleStatusCode(String value) {
        this.scheduleStatusCode = value;
    }

    /**
     * Gets the value of the wsTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWsTaskId() {
        return wsTaskId;
    }

    /**
     * Sets the value of the wsTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWsTaskId(Long value) {
        this.wsTaskId = value;
    }

    /**
     * Gets the value of the creationFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationFromDate() {
        return creationFromDate;
    }

    /**
     * Sets the value of the creationFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationFromDate(String value) {
        this.creationFromDate = value;
    }

    /**
     * Gets the value of the creationToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationToDate() {
        return creationToDate;
    }

    /**
     * Sets the value of the creationToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationToDate(String value) {
        this.creationToDate = value;
    }

}
