
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileDownLoadProbInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDownLoadProbInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contentProviderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="contentProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FTPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FTPAddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startingDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pollingStategyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="downloadProblem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDownLoadProbInput", propOrder = {
    "contentProviderId",
    "contentProviderName",
    "ftpAddress",
    "ftpAddressId",
    "directory",
    "fileName",
    "startingDirectory",
    "pollingStategyId",
    "downloadProblem"
})
public class FileDownLoadProbInput
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Long contentProviderId;
    protected String contentProviderName;
    @XmlElement(name = "FTPAddress")
    protected String ftpAddress;
    @XmlElement(name = "FTPAddressId")
    protected Long ftpAddressId;
    protected String directory;
    protected String fileName;
    protected String startingDirectory;
    protected Long pollingStategyId;
    protected List<String> downloadProblem;

    /**
     * Gets the value of the contentProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContentProviderId() {
        return contentProviderId;
    }

    /**
     * Sets the value of the contentProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContentProviderId(Long value) {
        this.contentProviderId = value;
    }

    /**
     * Gets the value of the contentProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentProviderName() {
        return contentProviderName;
    }

    /**
     * Sets the value of the contentProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentProviderName(String value) {
        this.contentProviderName = value;
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
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
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
     * Gets the value of the pollingStategyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPollingStategyId() {
        return pollingStategyId;
    }

    /**
     * Sets the value of the pollingStategyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPollingStategyId(Long value) {
        this.pollingStategyId = value;
    }

    /**
     * Gets the value of the downloadProblem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the downloadProblem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDownloadProblem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDownloadProblem() {
        if (downloadProblem == null) {
            downloadProblem = new ArrayList<String>();
        }
        return this.downloadProblem;
    }

}
