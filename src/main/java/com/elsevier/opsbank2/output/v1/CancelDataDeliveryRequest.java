
package com.elsevier.opsbank2.output.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.outputorder.vo.CancelDataDeliveryInputVO;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cancelDataDeliveryInput" type="{http://vo.outputorder.services.obii.elsevier.com}CancelDataDeliveryInputVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cancelDataDeliveryInput"
})
@XmlRootElement(name = "cancelDataDeliveryRequest")
public class CancelDataDeliveryRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected CancelDataDeliveryInputVO cancelDataDeliveryInput;

    /**
     * Gets the value of the cancelDataDeliveryInput property.
     * 
     * @return
     *     possible object is
     *     {@link CancelDataDeliveryInputVO }
     *     
     */
    public CancelDataDeliveryInputVO getCancelDataDeliveryInput() {
        return cancelDataDeliveryInput;
    }

    /**
     * Sets the value of the cancelDataDeliveryInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelDataDeliveryInputVO }
     *     
     */
    public void setCancelDataDeliveryInput(CancelDataDeliveryInputVO value) {
        this.cancelDataDeliveryInput = value;
    }

}
