
package com.elsevier.obii.eis.service.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.FileInfoVO;


/**
 * <p>Java class for CreatedFileDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatedFileDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carAttachmentFileIds" type="{http://vo.service.eis.obii.elsevier.com}ArrayOf_438060916_nillable_long" minOccurs="0"/&gt;
 *         &lt;element name="exceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceptionMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="standardOutputXMLFile" type="{http://vo.obii.elsevier.com}FileInfoVO" minOccurs="0"/&gt;
 *         &lt;element name="carPresentInXML" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="isErrorXMLCreated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatedFileDetailsVO", propOrder = {
    "carAttachmentFileIds",
    "exceptionCode",
    "exceptionMsg",
    "isException",
    "standardOutputXMLFile",
    "carPresentInXML",
    "isErrorXMLCreated"
})
public class CreatedFileDetailsVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ArrayOf438060916NillableLong carAttachmentFileIds;
    protected String exceptionCode;
    protected String exceptionMsg;
    protected Boolean isException;
    protected FileInfoVO standardOutputXMLFile;
    protected Long carPresentInXML;
    protected Boolean isErrorXMLCreated;

    /**
     * Gets the value of the carAttachmentFileIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOf438060916NillableLong }
     *     
     */
    public ArrayOf438060916NillableLong getCarAttachmentFileIds() {
        return carAttachmentFileIds;
    }

    /**
     * Sets the value of the carAttachmentFileIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOf438060916NillableLong }
     *     
     */
    public void setCarAttachmentFileIds(ArrayOf438060916NillableLong value) {
        this.carAttachmentFileIds = value;
    }

    /**
     * Gets the value of the exceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Sets the value of the exceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionCode(String value) {
        this.exceptionCode = value;
    }

    /**
     * Gets the value of the exceptionMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMsg() {
        return exceptionMsg;
    }

    /**
     * Sets the value of the exceptionMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMsg(String value) {
        this.exceptionMsg = value;
    }

    /**
     * Gets the value of the isException property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsException() {
        return isException;
    }

    /**
     * Sets the value of the isException property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsException(Boolean value) {
        this.isException = value;
    }

    /**
     * Gets the value of the standardOutputXMLFile property.
     * 
     * @return
     *     possible object is
     *     {@link FileInfoVO }
     *     
     */
    public FileInfoVO getStandardOutputXMLFile() {
        return standardOutputXMLFile;
    }

    /**
     * Sets the value of the standardOutputXMLFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileInfoVO }
     *     
     */
    public void setStandardOutputXMLFile(FileInfoVO value) {
        this.standardOutputXMLFile = value;
    }

    /**
     * Gets the value of the carPresentInXML property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCarPresentInXML() {
        return carPresentInXML;
    }

    /**
     * Sets the value of the carPresentInXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCarPresentInXML(Long value) {
        this.carPresentInXML = value;
    }

    /**
     * Gets the value of the isErrorXMLCreated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsErrorXMLCreated() {
        return isErrorXMLCreated;
    }

    /**
     * Sets the value of the isErrorXMLCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsErrorXMLCreated(Boolean value) {
        this.isErrorXMLCreated = value;
    }

}
