
package opsbankiioutputlibrary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostProcessOutputBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostProcessOutputBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allFileDetails" type="{http://OPSBankIIOutputLibrary}CreateFileDetailsBO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="correlationId" type="{http://OPSBankIIOutputLibrary}NameValuePair" minOccurs="0"/&gt;
 *         &lt;element name="exceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceptionMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="outputDeliveryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="parentOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="errorLogInfoVO" type="{http://OPSBankIIOutputLibrary}FileInfo" minOccurs="0"/&gt;
 *         &lt;element name="errorXMLInfoVO" type="{http://OPSBankIIOutputLibrary}FileInfo" minOccurs="0"/&gt;
 *         &lt;element name="exceptionStackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostProcessOutputBO", propOrder = {
    "allFileDetails",
    "correlationId",
    "exceptionCode",
    "exceptionMsg",
    "isException",
    "outputDeliveryId",
    "outputOrderId",
    "parentOrderId",
    "errorLogInfoVO",
    "errorXMLInfoVO",
    "exceptionStackTrace"
})
public class PostProcessOutputBO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<CreateFileDetailsBO> allFileDetails;
    protected NameValuePair correlationId;
    protected String exceptionCode;
    protected String exceptionMsg;
    protected Boolean isException;
    protected Long outputDeliveryId;
    protected Long outputOrderId;
    protected Long parentOrderId;
    protected FileInfo errorLogInfoVO;
    protected FileInfo errorXMLInfoVO;
    protected String exceptionStackTrace;

    /**
     * Gets the value of the allFileDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allFileDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllFileDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateFileDetailsBO }
     * 
     * 
     */
    public List<CreateFileDetailsBO> getAllFileDetails() {
        if (allFileDetails == null) {
            allFileDetails = new ArrayList<CreateFileDetailsBO>();
        }
        return this.allFileDetails;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link NameValuePair }
     *     
     */
    public NameValuePair getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValuePair }
     *     
     */
    public void setCorrelationId(NameValuePair value) {
        this.correlationId = value;
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
     * Gets the value of the outputDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutputDeliveryId() {
        return outputDeliveryId;
    }

    /**
     * Sets the value of the outputDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutputDeliveryId(Long value) {
        this.outputDeliveryId = value;
    }

    /**
     * Gets the value of the outputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutputOrderId() {
        return outputOrderId;
    }

    /**
     * Sets the value of the outputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutputOrderId(Long value) {
        this.outputOrderId = value;
    }

    /**
     * Gets the value of the parentOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentOrderId() {
        return parentOrderId;
    }

    /**
     * Sets the value of the parentOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentOrderId(Long value) {
        this.parentOrderId = value;
    }

    /**
     * Gets the value of the errorLogInfoVO property.
     * 
     * @return
     *     possible object is
     *     {@link FileInfo }
     *     
     */
    public FileInfo getErrorLogInfoVO() {
        return errorLogInfoVO;
    }

    /**
     * Sets the value of the errorLogInfoVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileInfo }
     *     
     */
    public void setErrorLogInfoVO(FileInfo value) {
        this.errorLogInfoVO = value;
    }

    /**
     * Gets the value of the errorXMLInfoVO property.
     * 
     * @return
     *     possible object is
     *     {@link FileInfo }
     *     
     */
    public FileInfo getErrorXMLInfoVO() {
        return errorXMLInfoVO;
    }

    /**
     * Sets the value of the errorXMLInfoVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileInfo }
     *     
     */
    public void setErrorXMLInfoVO(FileInfo value) {
        this.errorXMLInfoVO = value;
    }

    /**
     * Gets the value of the exceptionStackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionStackTrace() {
        return exceptionStackTrace;
    }

    /**
     * Sets the value of the exceptionStackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionStackTrace(String value) {
        this.exceptionStackTrace = value;
    }

}
