
package com.elsevier.opsbank2.interfacerun.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterfaceRunOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceRunOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntfcRunSeqNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ErrorDetails" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}exceptionBO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceRunOutput", propOrder = {
    "intfcRunSeqNo",
    "errorDetails"
})
public class InterfaceRunOutput
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IntfcRunSeqNo")
    protected Long intfcRunSeqNo;
    @XmlElement(name = "ErrorDetails")
    protected ExceptionBO errorDetails;

    /**
     * Gets the value of the intfcRunSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntfcRunSeqNo() {
        return intfcRunSeqNo;
    }

    /**
     * Sets the value of the intfcRunSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntfcRunSeqNo(Long value) {
        this.intfcRunSeqNo = value;
    }

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionBO }
     *     
     */
    public ExceptionBO getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionBO }
     *     
     */
    public void setErrorDetails(ExceptionBO value) {
        this.errorDetails = value;
    }

}
