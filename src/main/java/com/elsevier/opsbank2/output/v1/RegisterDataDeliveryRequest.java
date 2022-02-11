
package com.elsevier.opsbank2.output.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.outputorder.vo.RegisterDataDeliveryInputVO;


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
 *         &lt;element name="registerDataDeliveryInput" type="{http://vo.outputorder.services.obii.elsevier.com}RegisterDataDeliveryInputVO"/&gt;
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
    "registerDataDeliveryInput"
})
@XmlRootElement(name = "registerDataDeliveryRequest")
public class RegisterDataDeliveryRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected RegisterDataDeliveryInputVO registerDataDeliveryInput;

    /**
     * Gets the value of the registerDataDeliveryInput property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterDataDeliveryInputVO }
     *     
     */
    public RegisterDataDeliveryInputVO getRegisterDataDeliveryInput() {
        return registerDataDeliveryInput;
    }

    /**
     * Sets the value of the registerDataDeliveryInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterDataDeliveryInputVO }
     *     
     */
    public void setRegisterDataDeliveryInput(RegisterDataDeliveryInputVO value) {
        this.registerDataDeliveryInput = value;
    }

}
