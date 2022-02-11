
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDeliveryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDeliveryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="instructions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="timeTableClIdOfSource" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ActivityInstruction" type="{http://www.elsevier.com/opsbank2/input/v1}ActivityInstruction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryItemInfo" type="{http://www.elsevier.com/opsbank2/input/v1}DeliveryItemInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDeliveryInfo", propOrder = {
    "dueDate",
    "instructions",
    "timeTableClIdOfSource",
    "activityInstruction",
    "deliveryItemInfo"
})
public class OrderDeliveryInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Long dueDate;
    protected List<String> instructions;
    protected Long timeTableClIdOfSource;
    @XmlElement(name = "ActivityInstruction")
    protected List<ActivityInstruction> activityInstruction;
    @XmlElement(name = "DeliveryItemInfo")
    protected DeliveryItemInfo deliveryItemInfo;

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDueDate(Long value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInstructions() {
        if (instructions == null) {
            instructions = new ArrayList<String>();
        }
        return this.instructions;
    }

    /**
     * Gets the value of the timeTableClIdOfSource property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeTableClIdOfSource() {
        return timeTableClIdOfSource;
    }

    /**
     * Sets the value of the timeTableClIdOfSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeTableClIdOfSource(Long value) {
        this.timeTableClIdOfSource = value;
    }

    /**
     * Gets the value of the activityInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityInstruction }
     * 
     * 
     */
    public List<ActivityInstruction> getActivityInstruction() {
        if (activityInstruction == null) {
            activityInstruction = new ArrayList<ActivityInstruction>();
        }
        return this.activityInstruction;
    }

    /**
     * Gets the value of the deliveryItemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryItemInfo }
     *     
     */
    public DeliveryItemInfo getDeliveryItemInfo() {
        return deliveryItemInfo;
    }

    /**
     * Sets the value of the deliveryItemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryItemInfo }
     *     
     */
    public void setDeliveryItemInfo(DeliveryItemInfo value) {
        this.deliveryItemInfo = value;
    }

}
