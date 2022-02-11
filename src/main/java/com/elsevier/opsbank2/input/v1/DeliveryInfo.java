
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="deliverySeqNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SupplierDeliveryTypeClId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo" type="{http://www.elsevier.com/opsbank2/input/v1}OrderInfo" minOccurs="0"/&gt;
 *         &lt;element name="parentOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DeliverySignalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryState" type="{http://www.elsevier.com/opsbank2/input/v1}DeliveryState" minOccurs="0"/&gt;
 *         &lt;element name="CurrentSupplierActivityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CARListRef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interfaceRunSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PollingStrategyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrayOfIndexTypeInfoBO" type="{http://www.elsevier.com/opsbank2/input/v1}ArrayOfIndexTypeInfoBO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryInfo", propOrder = {
    "deliveryId",
    "deliverySeqNumber",
    "supplierDeliveryTypeClId",
    "orderInfo",
    "parentOrderId",
    "deliverySignalType",
    "deliveryState",
    "currentSupplierActivityID",
    "carListRef",
    "sourceId",
    "interfaceRunSequenceNumber",
    "interfaceId",
    "userId",
    "pollingStrategyId",
    "arrayOfIndexTypeInfoBO"
})
public class DeliveryInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Long deliveryId;
    protected Long deliverySeqNumber;
    @XmlElement(name = "SupplierDeliveryTypeClId")
    protected String supplierDeliveryTypeClId;
    @XmlElement(name = "OrderInfo")
    protected OrderInfo orderInfo;
    protected Long parentOrderId;
    @XmlElement(name = "DeliverySignalType")
    protected String deliverySignalType;
    @XmlElement(name = "DeliveryState")
    protected DeliveryState deliveryState;
    @XmlElement(name = "CurrentSupplierActivityID")
    protected String currentSupplierActivityID;
    @XmlElement(name = "CARListRef")
    protected Long carListRef;
    protected String sourceId;
    protected Long interfaceRunSequenceNumber;
    protected Long interfaceId;
    protected Long userId;
    @XmlElement(name = "PollingStrategyId")
    protected String pollingStrategyId;
    protected ArrayOfIndexTypeInfoBO arrayOfIndexTypeInfoBO;

    /**
     * Gets the value of the deliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliveryId() {
        return deliveryId;
    }

    /**
     * Sets the value of the deliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliveryId(Long value) {
        this.deliveryId = value;
    }

    /**
     * Gets the value of the deliverySeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliverySeqNumber() {
        return deliverySeqNumber;
    }

    /**
     * Sets the value of the deliverySeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliverySeqNumber(Long value) {
        this.deliverySeqNumber = value;
    }

    /**
     * Gets the value of the supplierDeliveryTypeClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierDeliveryTypeClId() {
        return supplierDeliveryTypeClId;
    }

    /**
     * Sets the value of the supplierDeliveryTypeClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierDeliveryTypeClId(String value) {
        this.supplierDeliveryTypeClId = value;
    }

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
     * Gets the value of the deliverySignalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverySignalType() {
        return deliverySignalType;
    }

    /**
     * Sets the value of the deliverySignalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverySignalType(String value) {
        this.deliverySignalType = value;
    }

    /**
     * Gets the value of the deliveryState property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryState }
     *     
     */
    public DeliveryState getDeliveryState() {
        return deliveryState;
    }

    /**
     * Sets the value of the deliveryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryState }
     *     
     */
    public void setDeliveryState(DeliveryState value) {
        this.deliveryState = value;
    }

    /**
     * Gets the value of the currentSupplierActivityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentSupplierActivityID() {
        return currentSupplierActivityID;
    }

    /**
     * Sets the value of the currentSupplierActivityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentSupplierActivityID(String value) {
        this.currentSupplierActivityID = value;
    }

    /**
     * Gets the value of the carListRef property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCARListRef() {
        return carListRef;
    }

    /**
     * Sets the value of the carListRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCARListRef(Long value) {
        this.carListRef = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the interfaceRunSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceRunSequenceNumber() {
        return interfaceRunSequenceNumber;
    }

    /**
     * Sets the value of the interfaceRunSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceRunSequenceNumber(Long value) {
        this.interfaceRunSequenceNumber = value;
    }

    /**
     * Gets the value of the interfaceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceId() {
        return interfaceId;
    }

    /**
     * Sets the value of the interfaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceId(Long value) {
        this.interfaceId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the pollingStrategyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollingStrategyId() {
        return pollingStrategyId;
    }

    /**
     * Sets the value of the pollingStrategyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollingStrategyId(String value) {
        this.pollingStrategyId = value;
    }

    /**
     * Gets the value of the arrayOfIndexTypeInfoBO property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndexTypeInfoBO }
     *     
     */
    public ArrayOfIndexTypeInfoBO getArrayOfIndexTypeInfoBO() {
        return arrayOfIndexTypeInfoBO;
    }

    /**
     * Sets the value of the arrayOfIndexTypeInfoBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndexTypeInfoBO }
     *     
     */
    public void setArrayOfIndexTypeInfoBO(ArrayOfIndexTypeInfoBO value) {
        this.arrayOfIndexTypeInfoBO = value;
    }

}
