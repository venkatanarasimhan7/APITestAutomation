
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputActivityGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputActivityGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CARListRef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="previousActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActivityStateRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputActivity" type="{http://www.elsevier.com/opsbank2/input/v1}InputActivity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputActivityGroup", propOrder = {
    "carListRef",
    "previousActivityType",
    "nextActivityType",
    "activityStateRefId",
    "inputActivity"
})
public class InputActivityGroup
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CARListRef")
    protected Long carListRef;
    protected String previousActivityType;
    protected String nextActivityType;
    @XmlElement(name = "ActivityStateRefId")
    protected String activityStateRefId;
    @XmlElement(name = "InputActivity")
    protected InputActivity inputActivity;

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
     * Gets the value of the previousActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousActivityType() {
        return previousActivityType;
    }

    /**
     * Sets the value of the previousActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousActivityType(String value) {
        this.previousActivityType = value;
    }

    /**
     * Gets the value of the nextActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextActivityType() {
        return nextActivityType;
    }

    /**
     * Sets the value of the nextActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextActivityType(String value) {
        this.nextActivityType = value;
    }

    /**
     * Gets the value of the activityStateRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityStateRefId() {
        return activityStateRefId;
    }

    /**
     * Sets the value of the activityStateRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityStateRefId(String value) {
        this.activityStateRefId = value;
    }

    /**
     * Gets the value of the inputActivity property.
     * 
     * @return
     *     possible object is
     *     {@link InputActivity }
     *     
     */
    public InputActivity getInputActivity() {
        return inputActivity;
    }

    /**
     * Sets the value of the inputActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputActivity }
     *     
     */
    public void setInputActivity(InputActivity value) {
        this.inputActivity = value;
    }

}
