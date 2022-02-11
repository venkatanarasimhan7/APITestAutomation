
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatentDeterminationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatentDeterminationStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="patentBR" type="{http://www.elsevier.com/opsbank2/input/v1}patentFamilyInfo" minOccurs="0"/&gt;
 *         &lt;element name="retryIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="waitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isFamiliesFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="patentFamilyInfoList" type="{http://www.elsevier.com/opsbank2/input/v1}patentFamilyInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatentDeterminationStatus", propOrder = {
    "patentBR",
    "retryIndex",
    "waitType",
    "isFamiliesFound",
    "patentFamilyInfoList"
})
public class PatentDeterminationStatus
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PatentFamilyInfo patentBR;
    protected Integer retryIndex;
    @XmlElement(defaultValue = "NO_WAIT")
    protected String waitType;
    @XmlElement(defaultValue = "false")
    protected Boolean isFamiliesFound;
    protected List<PatentFamilyInfo> patentFamilyInfoList;

    /**
     * Gets the value of the patentBR property.
     * 
     * @return
     *     possible object is
     *     {@link PatentFamilyInfo }
     *     
     */
    public PatentFamilyInfo getPatentBR() {
        return patentBR;
    }

    /**
     * Sets the value of the patentBR property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatentFamilyInfo }
     *     
     */
    public void setPatentBR(PatentFamilyInfo value) {
        this.patentBR = value;
    }

    /**
     * Gets the value of the retryIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetryIndex() {
        return retryIndex;
    }

    /**
     * Sets the value of the retryIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetryIndex(Integer value) {
        this.retryIndex = value;
    }

    /**
     * Gets the value of the waitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitType() {
        return waitType;
    }

    /**
     * Sets the value of the waitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitType(String value) {
        this.waitType = value;
    }

    /**
     * Gets the value of the isFamiliesFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFamiliesFound() {
        return isFamiliesFound;
    }

    /**
     * Sets the value of the isFamiliesFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFamiliesFound(Boolean value) {
        this.isFamiliesFound = value;
    }

    /**
     * Gets the value of the patentFamilyInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patentFamilyInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatentFamilyInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatentFamilyInfo }
     * 
     * 
     */
    public List<PatentFamilyInfo> getPatentFamilyInfoList() {
        if (patentFamilyInfoList == null) {
            patentFamilyInfoList = new ArrayList<PatentFamilyInfo>();
        }
        return this.patentFamilyInfoList;
    }

}
