
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InpadocServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InpadocServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="waitDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inpadocStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "InpadocServiceResponse", propOrder = {
    "waitDuration",
    "inpadocStatus",
    "isError",
    "errorCode",
    "errorMessage",
    "stackTrace",
    "patentFamilyInfoList"
})
public class InpadocServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String waitDuration;
    protected String inpadocStatus;
    protected Boolean isError;
    protected String errorCode;
    protected String errorMessage;
    protected String stackTrace;
    protected List<PatentFamilyInfo> patentFamilyInfoList;

    /**
     * Gets the value of the waitDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaitDuration() {
        return waitDuration;
    }

    /**
     * Sets the value of the waitDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitDuration(String value) {
        this.waitDuration = value;
    }

    /**
     * Gets the value of the inpadocStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInpadocStatus() {
        return inpadocStatus;
    }

    /**
     * Sets the value of the inpadocStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInpadocStatus(String value) {
        this.inpadocStatus = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsError(Boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the stackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets the value of the stackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
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
