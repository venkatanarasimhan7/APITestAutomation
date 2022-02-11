
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowActivityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowActivityInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activityStateRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastInputActivityIdPerformed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextActivityFlowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowActivityInfo", propOrder = {
    "activityStateRefId",
    "lastInputActivityIdPerformed",
    "nextActivityFlowName"
})
public class FlowActivityInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String activityStateRefId;
    protected String lastInputActivityIdPerformed;
    protected String nextActivityFlowName;

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
     * Gets the value of the lastInputActivityIdPerformed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastInputActivityIdPerformed() {
        return lastInputActivityIdPerformed;
    }

    /**
     * Sets the value of the lastInputActivityIdPerformed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastInputActivityIdPerformed(String value) {
        this.lastInputActivityIdPerformed = value;
    }

    /**
     * Gets the value of the nextActivityFlowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextActivityFlowName() {
        return nextActivityFlowName;
    }

    /**
     * Sets the value of the nextActivityFlowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextActivityFlowName(String value) {
        this.nextActivityFlowName = value;
    }

}
