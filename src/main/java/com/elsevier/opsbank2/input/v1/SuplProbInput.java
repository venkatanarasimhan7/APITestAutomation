
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuplProbInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuplProbInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supplierId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="supplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FTPAddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FTPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startingDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="readyFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suplProblem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuplProbInput", propOrder = {
    "supplierId",
    "supplierName",
    "ftpAddressId",
    "ftpAddress",
    "startingDirectory",
    "readyFileName",
    "suplProblem"
})
public class SuplProbInput
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Long supplierId;
    protected String supplierName;
    @XmlElement(name = "FTPAddressId")
    protected Long ftpAddressId;
    @XmlElement(name = "FTPAddress")
    protected String ftpAddress;
    protected String startingDirectory;
    protected String readyFileName;
    protected String suplProblem;

    /**
     * Gets the value of the supplierId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplierId(Long value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the supplierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

    /**
     * Gets the value of the ftpAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFTPAddressId() {
        return ftpAddressId;
    }

    /**
     * Sets the value of the ftpAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFTPAddressId(Long value) {
        this.ftpAddressId = value;
    }

    /**
     * Gets the value of the ftpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTPAddress() {
        return ftpAddress;
    }

    /**
     * Sets the value of the ftpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTPAddress(String value) {
        this.ftpAddress = value;
    }

    /**
     * Gets the value of the startingDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingDirectory() {
        return startingDirectory;
    }

    /**
     * Sets the value of the startingDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingDirectory(String value) {
        this.startingDirectory = value;
    }

    /**
     * Gets the value of the readyFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadyFileName() {
        return readyFileName;
    }

    /**
     * Sets the value of the readyFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadyFileName(String value) {
        this.readyFileName = value;
    }

    /**
     * Gets the value of the suplProblem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuplProblem() {
        return suplProblem;
    }

    /**
     * Sets the value of the suplProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuplProblem(String value) {
        this.suplProblem = value;
    }

}
