
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invokeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationFault" type="{http://www.elsevier.com/opsbank2/input/v1}ProcessServiceFault" minOccurs="0"/&gt;
 *         &lt;element name="CorrelationInfo" type="{http://www.elsevier.com/opsbank2/input/v1}CorrelationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationInfo", propOrder = {
    "invokeStatus",
    "operationFault",
    "correlationInfo"
})
public class OperationInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String invokeStatus;
    @XmlElement(name = "OperationFault")
    protected ProcessServiceFault operationFault;
    @XmlElement(name = "CorrelationInfo")
    protected CorrelationInfo correlationInfo;

    /**
     * Gets the value of the invokeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvokeStatus() {
        return invokeStatus;
    }

    /**
     * Sets the value of the invokeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvokeStatus(String value) {
        this.invokeStatus = value;
    }

    /**
     * Gets the value of the operationFault property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessServiceFault }
     *     
     */
    public ProcessServiceFault getOperationFault() {
        return operationFault;
    }

    /**
     * Sets the value of the operationFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessServiceFault }
     *     
     */
    public void setOperationFault(ProcessServiceFault value) {
        this.operationFault = value;
    }

    /**
     * Gets the value of the correlationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationInfo }
     *     
     */
    public CorrelationInfo getCorrelationInfo() {
        return correlationInfo;
    }

    /**
     * Sets the value of the correlationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationInfo }
     *     
     */
    public void setCorrelationInfo(CorrelationInfo value) {
        this.correlationInfo = value;
    }

}
