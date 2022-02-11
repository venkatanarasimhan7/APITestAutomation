
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProblemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProblemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CloseTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CloseDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorLogFileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProblemInfo", propOrder = {
    "closeTypeID",
    "closeDesc",
    "fileId",
    "errorLogFileId"
})
public class ProblemInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CloseTypeID")
    protected String closeTypeID;
    @XmlElement(name = "CloseDesc")
    protected String closeDesc;
    protected String fileId;
    protected String errorLogFileId;

    /**
     * Gets the value of the closeTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseTypeID() {
        return closeTypeID;
    }

    /**
     * Sets the value of the closeTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseTypeID(String value) {
        this.closeTypeID = value;
    }

    /**
     * Gets the value of the closeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseDesc() {
        return closeDesc;
    }

    /**
     * Sets the value of the closeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseDesc(String value) {
        this.closeDesc = value;
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileId(String value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the errorLogFileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorLogFileId() {
        return errorLogFileId;
    }

    /**
     * Sets the value of the errorLogFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorLogFileId(String value) {
        this.errorLogFileId = value;
    }

}
