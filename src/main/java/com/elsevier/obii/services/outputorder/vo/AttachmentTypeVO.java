
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for AttachmentTypeVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentTypeVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachmentCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="attachmentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isUserSelected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentTypeVO", propOrder = {
    "attachmentCode",
    "attachmentName",
    "isUserSelected"
})
public class AttachmentTypeVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long attachmentCode;
    @XmlElement(required = true, nillable = true)
    protected String attachmentName;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isUserSelected;

    /**
     * Gets the value of the attachmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttachmentCode() {
        return attachmentCode;
    }

    /**
     * Sets the value of the attachmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttachmentCode(Long value) {
        this.attachmentCode = value;
    }

    /**
     * Gets the value of the attachmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * Sets the value of the attachmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentName(String value) {
        this.attachmentName = value;
    }

    /**
     * Gets the value of the isUserSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUserSelected() {
        return isUserSelected;
    }

    /**
     * Sets the value of the isUserSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUserSelected(Boolean value) {
        this.isUserSelected = value;
    }

}
