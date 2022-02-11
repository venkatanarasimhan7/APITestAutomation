
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InputOrder" type="{http://www.elsevier.com/opsbank2/input/v1}InputOrder" minOccurs="0"/&gt;
 *         &lt;element name="InputDelivery" type="{http://www.elsevier.com/opsbank2/input/v1}InputDelivery" minOccurs="0"/&gt;
 *         &lt;element name="InputPatent" type="{http://www.elsevier.com/opsbank2/input/v1}InputPatent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputActivity", propOrder = {
    "inputOrder",
    "inputDelivery",
    "inputPatent"
})
public class InputActivity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InputOrder")
    protected InputOrder inputOrder;
    @XmlElement(name = "InputDelivery")
    protected InputDelivery inputDelivery;
    @XmlElement(name = "InputPatent")
    protected InputPatent inputPatent;

    /**
     * Gets the value of the inputOrder property.
     * 
     * @return
     *     possible object is
     *     {@link InputOrder }
     *     
     */
    public InputOrder getInputOrder() {
        return inputOrder;
    }

    /**
     * Sets the value of the inputOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputOrder }
     *     
     */
    public void setInputOrder(InputOrder value) {
        this.inputOrder = value;
    }

    /**
     * Gets the value of the inputDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link InputDelivery }
     *     
     */
    public InputDelivery getInputDelivery() {
        return inputDelivery;
    }

    /**
     * Sets the value of the inputDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputDelivery }
     *     
     */
    public void setInputDelivery(InputDelivery value) {
        this.inputDelivery = value;
    }

    /**
     * Gets the value of the inputPatent property.
     * 
     * @return
     *     possible object is
     *     {@link InputPatent }
     *     
     */
    public InputPatent getInputPatent() {
        return inputPatent;
    }

    /**
     * Sets the value of the inputPatent property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputPatent }
     *     
     */
    public void setInputPatent(InputPatent value) {
        this.inputPatent = value;
    }

}
