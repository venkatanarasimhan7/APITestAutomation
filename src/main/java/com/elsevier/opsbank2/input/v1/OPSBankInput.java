
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPSBankInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPSBankInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentActivity" type="{http://www.elsevier.com/opsbank2/input/v1}InputActivity" minOccurs="0"/&gt;
 *         &lt;element name="NextActivities" type="{http://www.elsevier.com/opsbank2/input/v1}InputActivityGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="businessProcessInfo" type="{http://www.elsevier.com/opsbank2/input/v1}BusinessProcessInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPSBankInput", propOrder = {
    "currentActivity",
    "nextActivities",
    "businessProcessInfo"
})
public class OPSBankInput
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CurrentActivity")
    protected InputActivity currentActivity;
    @XmlElement(name = "NextActivities")
    protected List<InputActivityGroup> nextActivities;
    protected BusinessProcessInfo businessProcessInfo;

    /**
     * Gets the value of the currentActivity property.
     * 
     * @return
     *     possible object is
     *     {@link InputActivity }
     *     
     */
    public InputActivity getCurrentActivity() {
        return currentActivity;
    }

    /**
     * Sets the value of the currentActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputActivity }
     *     
     */
    public void setCurrentActivity(InputActivity value) {
        this.currentActivity = value;
    }

    /**
     * Gets the value of the nextActivities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextActivities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputActivityGroup }
     * 
     * 
     */
    public List<InputActivityGroup> getNextActivities() {
        if (nextActivities == null) {
            nextActivities = new ArrayList<InputActivityGroup>();
        }
        return this.nextActivities;
    }

    /**
     * Gets the value of the businessProcessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessInfo }
     *     
     */
    public BusinessProcessInfo getBusinessProcessInfo() {
        return businessProcessInfo;
    }

    /**
     * Sets the value of the businessProcessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessInfo }
     *     
     */
    public void setBusinessProcessInfo(BusinessProcessInfo value) {
        this.businessProcessInfo = value;
    }

}
