
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for OutputAttachmentVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputAttachmentVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachmentFileTypeClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attachmentFileExtName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attachmentFileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attachmentFilePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attachmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputAttachmentVO", propOrder = {
    "attachmentFileTypeClId",
    "attachmentFileExtName",
    "attachmentFileName",
    "attachmentFilePath",
    "attachmentId",
    "creationDate"
})
public class OutputAttachmentVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String attachmentFileTypeClId;
    @XmlElement(required = true, nillable = true)
    protected String attachmentFileExtName;
    @XmlElement(required = true, nillable = true)
    protected String attachmentFileName;
    @XmlElement(required = true, nillable = true)
    protected String attachmentFilePath;
    @XmlElement(required = true, nillable = true)
    protected String attachmentId;
    @XmlElement(required = true, nillable = true)
    protected String creationDate;

    /**
     * Gets the value of the attachmentFileTypeClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentFileTypeClId() {
        return attachmentFileTypeClId;
    }

    /**
     * Sets the value of the attachmentFileTypeClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentFileTypeClId(String value) {
        this.attachmentFileTypeClId = value;
    }

    /**
     * Gets the value of the attachmentFileExtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentFileExtName() {
        return attachmentFileExtName;
    }

    /**
     * Sets the value of the attachmentFileExtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentFileExtName(String value) {
        this.attachmentFileExtName = value;
    }

    /**
     * Gets the value of the attachmentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentFileName() {
        return attachmentFileName;
    }

    /**
     * Sets the value of the attachmentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentFileName(String value) {
        this.attachmentFileName = value;
    }

    /**
     * Gets the value of the attachmentFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentFilePath() {
        return attachmentFilePath;
    }

    /**
     * Sets the value of the attachmentFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentFilePath(String value) {
        this.attachmentFilePath = value;
    }

    /**
     * Gets the value of the attachmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * Sets the value of the attachmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentId(String value) {
        this.attachmentId = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

}
