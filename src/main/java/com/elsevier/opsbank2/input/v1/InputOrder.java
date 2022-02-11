
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderInfo" type="{http://www.elsevier.com/opsbank2/input/v1}OrderInfo" minOccurs="0"/&gt;
 *         &lt;element name="PartyInfo" type="{http://www.elsevier.com/opsbank2/input/v1}PartyInfo" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryInfo" type="{http://www.elsevier.com/opsbank2/input/v1}OrderDeliveryInfo" minOccurs="0"/&gt;
 *         &lt;element name="ProblemInfo" type="{http://www.elsevier.com/opsbank2/input/v1}ProblemInfo" minOccurs="0"/&gt;
 *         &lt;element name="OperationInfo" type="{http://www.elsevier.com/opsbank2/input/v1}OperationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputOrder", propOrder = {
    "orderInfo",
    "partyInfo",
    "deliveryInfo",
    "problemInfo",
    "operationInfo"
})
public class InputOrder
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OrderInfo")
    protected OrderInfo orderInfo;
    @XmlElement(name = "PartyInfo")
    protected PartyInfo partyInfo;
    @XmlElement(name = "DeliveryInfo")
    protected OrderDeliveryInfo deliveryInfo;
    @XmlElement(name = "ProblemInfo")
    protected ProblemInfo problemInfo;
    @XmlElement(name = "OperationInfo")
    protected OperationInfo operationInfo;

    /**
     * Gets the value of the orderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInfo }
     *     
     */
    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    /**
     * Sets the value of the orderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfo }
     *     
     */
    public void setOrderInfo(OrderInfo value) {
        this.orderInfo = value;
    }

    /**
     * Gets the value of the partyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInfo }
     *     
     */
    public PartyInfo getPartyInfo() {
        return partyInfo;
    }

    /**
     * Sets the value of the partyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInfo }
     *     
     */
    public void setPartyInfo(PartyInfo value) {
        this.partyInfo = value;
    }

    /**
     * Gets the value of the deliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDeliveryInfo }
     *     
     */
    public OrderDeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     * Sets the value of the deliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDeliveryInfo }
     *     
     */
    public void setDeliveryInfo(OrderDeliveryInfo value) {
        this.deliveryInfo = value;
    }

    /**
     * Gets the value of the problemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemInfo }
     *     
     */
    public ProblemInfo getProblemInfo() {
        return problemInfo;
    }

    /**
     * Sets the value of the problemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemInfo }
     *     
     */
    public void setProblemInfo(ProblemInfo value) {
        this.problemInfo = value;
    }

    /**
     * Gets the value of the operationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperationInfo }
     *     
     */
    public OperationInfo getOperationInfo() {
        return operationInfo;
    }

    /**
     * Sets the value of the operationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationInfo }
     *     
     */
    public void setOperationInfo(OperationInfo value) {
        this.operationInfo = value;
    }

}
