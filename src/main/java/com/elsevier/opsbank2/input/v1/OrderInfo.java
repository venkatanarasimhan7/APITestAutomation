
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderState" type="{http://www.elsevier.com/opsbank2/input/v1}OrderState" minOccurs="0"/&gt;
 *         &lt;element name="ParcelInfo" type="{http://www.elsevier.com/opsbank2/input/v1}ParcelInfo" minOccurs="0"/&gt;
 *         &lt;element name="activityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="problemDueDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="partySupplierOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interfaceRunSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastActivityStateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isOriginalContentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="supplierOrderReasonTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfo", propOrder = {
    "orderId",
    "orderState",
    "parcelInfo",
    "activityName",
    "orderType",
    "problemDueDate",
    "orderDate",
    "partySupplierOrderId",
    "interfaceRunSequenceNumber",
    "interfaceId",
    "userId",
    "userName",
    "lastActivityStateId",
    "isOriginalContentRequired",
    "supplierOrderReasonTxt"
})
public class OrderInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String orderId;
    @XmlElement(name = "OrderState")
    protected OrderState orderState;
    @XmlElement(name = "ParcelInfo")
    protected ParcelInfo parcelInfo;
    protected String activityName;
    protected String orderType;
    protected Long problemDueDate;
    protected Long orderDate;
    protected String partySupplierOrderId;
    protected Long interfaceRunSequenceNumber;
    protected Long interfaceId;
    protected Long userId;
    protected String userName;
    protected String lastActivityStateId;
    protected Boolean isOriginalContentRequired;
    protected String supplierOrderReasonTxt;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the orderState property.
     * 
     * @return
     *     possible object is
     *     {@link OrderState }
     *     
     */
    public OrderState getOrderState() {
        return orderState;
    }

    /**
     * Sets the value of the orderState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderState }
     *     
     */
    public void setOrderState(OrderState value) {
        this.orderState = value;
    }

    /**
     * Gets the value of the parcelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParcelInfo }
     *     
     */
    public ParcelInfo getParcelInfo() {
        return parcelInfo;
    }

    /**
     * Sets the value of the parcelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParcelInfo }
     *     
     */
    public void setParcelInfo(ParcelInfo value) {
        this.parcelInfo = value;
    }

    /**
     * Gets the value of the activityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the problemDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProblemDueDate() {
        return problemDueDate;
    }

    /**
     * Sets the value of the problemDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProblemDueDate(Long value) {
        this.problemDueDate = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderDate(Long value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the partySupplierOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartySupplierOrderId() {
        return partySupplierOrderId;
    }

    /**
     * Sets the value of the partySupplierOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartySupplierOrderId(String value) {
        this.partySupplierOrderId = value;
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
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the lastActivityStateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastActivityStateId() {
        return lastActivityStateId;
    }

    /**
     * Sets the value of the lastActivityStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastActivityStateId(String value) {
        this.lastActivityStateId = value;
    }

    /**
     * Gets the value of the isOriginalContentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOriginalContentRequired() {
        return isOriginalContentRequired;
    }

    /**
     * Sets the value of the isOriginalContentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOriginalContentRequired(Boolean value) {
        this.isOriginalContentRequired = value;
    }

    /**
     * Gets the value of the supplierOrderReasonTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierOrderReasonTxt() {
        return supplierOrderReasonTxt;
    }

    /**
     * Sets the value of the supplierOrderReasonTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierOrderReasonTxt(String value) {
        this.supplierOrderReasonTxt = value;
    }

}
