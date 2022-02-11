
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for ExtractDeliveryDataOutputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtractDeliveryDataOutputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callFromExportProcess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="carAttachmentFileIds" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isExceptionOccurred" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="outputDeliveryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="standardOutputXMLFiles" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns3_nillable_FileInfoVO"/&gt;
 *         &lt;element name="user" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractDeliveryDataOutputVO", propOrder = {
    "callFromExportProcess",
    "carAttachmentFileIds",
    "errorCode",
    "errorMessage",
    "isExceptionOccurred",
    "outputDeliveryId",
    "outputOrderId",
    "recordCount",
    "standardOutputXMLFiles",
    "user"
})
public class ExtractDeliveryDataOutputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean callFromExportProcess;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString carAttachmentFileIds;
    @XmlElement(required = true, nillable = true)
    protected String errorCode;
    @XmlElement(required = true, nillable = true)
    protected String errorMessage;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isExceptionOccurred;
    @XmlElement(required = true, nillable = true)
    protected String outputDeliveryId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String recordCount;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3NillableFileInfoVO standardOutputXMLFiles;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;

    /**
     * Gets the value of the callFromExportProcess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallFromExportProcess() {
        return callFromExportProcess;
    }

    /**
     * Sets the value of the callFromExportProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallFromExportProcess(Boolean value) {
        this.callFromExportProcess = value;
    }

    /**
     * Gets the value of the carAttachmentFileIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getCarAttachmentFileIds() {
        return carAttachmentFileIds;
    }

    /**
     * Sets the value of the carAttachmentFileIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setCarAttachmentFileIds(ArrayOfXsdNillableString value) {
        this.carAttachmentFileIds = value;
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
     * Gets the value of the isExceptionOccurred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExceptionOccurred() {
        return isExceptionOccurred;
    }

    /**
     * Sets the value of the isExceptionOccurred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExceptionOccurred(Boolean value) {
        this.isExceptionOccurred = value;
    }

    /**
     * Gets the value of the outputDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDeliveryId() {
        return outputDeliveryId;
    }

    /**
     * Sets the value of the outputDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDeliveryId(String value) {
        this.outputDeliveryId = value;
    }

    /**
     * Gets the value of the outputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderId() {
        return outputOrderId;
    }

    /**
     * Sets the value of the outputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderId(String value) {
        this.outputOrderId = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCount(String value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the standardOutputXMLFiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3NillableFileInfoVO }
     *     
     */
    public ArrayOfTns3NillableFileInfoVO getStandardOutputXMLFiles() {
        return standardOutputXMLFiles;
    }

    /**
     * Sets the value of the standardOutputXMLFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3NillableFileInfoVO }
     *     
     */
    public void setStandardOutputXMLFiles(ArrayOfTns3NillableFileInfoVO value) {
        this.standardOutputXMLFiles = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setUser(UserVO value) {
        this.user = value;
    }

}
