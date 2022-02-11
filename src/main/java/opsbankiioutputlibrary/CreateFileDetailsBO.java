
package opsbankiioutputlibrary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateFileDetailsBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateFileDetailsBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carAttachmentFileIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exceptionMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isErrorXMLCreated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="standardOutputXMLFile" type="{http://OPSBankIIOutputLibrary}FileInfo" minOccurs="0"/&gt;
 *         &lt;element name="carPresentInXML" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFileDetailsBO", propOrder = {
    "carAttachmentFileIds",
    "exceptionCode",
    "exceptionMsg",
    "isException",
    "isErrorXMLCreated",
    "standardOutputXMLFile",
    "carPresentInXML"
})
public class CreateFileDetailsBO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(type = Long.class)
    protected List<Long> carAttachmentFileIds;
    protected String exceptionCode;
    protected String exceptionMsg;
    protected Boolean isException;
    protected Boolean isErrorXMLCreated;
    protected FileInfo standardOutputXMLFile;
    protected Long carPresentInXML;

    /**
     * Gets the value of the carAttachmentFileIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carAttachmentFileIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarAttachmentFileIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCarAttachmentFileIds() {
        if (carAttachmentFileIds == null) {
            carAttachmentFileIds = new ArrayList<Long>();
        }
        return this.carAttachmentFileIds;
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

    /**
     * Gets the value of the standardOutputXMLFile property.
     * 
     * @return
     *     possible object is
     *     {@link FileInfo }
     *     
     */
    public FileInfo getStandardOutputXMLFile() {
        return standardOutputXMLFile;
    }

    /**
     * Sets the value of the standardOutputXMLFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileInfo }
     *     
     */
    public void setStandardOutputXMLFile(FileInfo value) {
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

}
