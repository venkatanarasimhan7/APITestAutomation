
package com.elsevier.obii.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="alertType" type="{http://vo.obii.elsevier.com}alertType"/&gt;
 *         &lt;element name="alertCategory" type="{http://vo.obii.elsevier.com}alertCategory"/&gt;
 *         &lt;element name="alertFaultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alertDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alertMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alertArgs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alertSourceClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alertReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alert", propOrder = {
    "alertCode",
    "alertType",
    "alertCategory",
    "alertFaultType",
    "alertDescription",
    "alertMessage",
    "alertArgs",
    "alertSourceClass",
    "alertReason"
})
public class Alert
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String alertCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AlertType alertType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AlertCategory alertCategory;
    protected String alertFaultType;
    protected String alertDescription;
    protected String alertMessage;
    protected List<String> alertArgs;
    protected String alertSourceClass;
    protected String alertReason;

    /**
     * Gets the value of the alertCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCode() {
        return alertCode;
    }

    /**
     * Sets the value of the alertCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCode(String value) {
        this.alertCode = value;
    }

    /**
     * Gets the value of the alertType property.
     * 
     * @return
     *     possible object is
     *     {@link AlertType }
     *     
     */
    public AlertType getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertType }
     *     
     */
    public void setAlertType(AlertType value) {
        this.alertType = value;
    }

    /**
     * Gets the value of the alertCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCategory }
     *     
     */
    public AlertCategory getAlertCategory() {
        return alertCategory;
    }

    /**
     * Sets the value of the alertCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCategory }
     *     
     */
    public void setAlertCategory(AlertCategory value) {
        this.alertCategory = value;
    }

    /**
     * Gets the value of the alertFaultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertFaultType() {
        return alertFaultType;
    }

    /**
     * Sets the value of the alertFaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertFaultType(String value) {
        this.alertFaultType = value;
    }

    /**
     * Gets the value of the alertDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertDescription() {
        return alertDescription;
    }

    /**
     * Sets the value of the alertDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertDescription(String value) {
        this.alertDescription = value;
    }

    /**
     * Gets the value of the alertMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertMessage() {
        return alertMessage;
    }

    /**
     * Sets the value of the alertMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertMessage(String value) {
        this.alertMessage = value;
    }

    /**
     * Gets the value of the alertArgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertArgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertArgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlertArgs() {
        if (alertArgs == null) {
            alertArgs = new ArrayList<String>();
        }
        return this.alertArgs;
    }

    /**
     * Gets the value of the alertSourceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertSourceClass() {
        return alertSourceClass;
    }

    /**
     * Sets the value of the alertSourceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertSourceClass(String value) {
        this.alertSourceClass = value;
    }

    /**
     * Gets the value of the alertReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertReason() {
        return alertReason;
    }

    /**
     * Sets the value of the alertReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertReason(String value) {
        this.alertReason = value;
    }

}
