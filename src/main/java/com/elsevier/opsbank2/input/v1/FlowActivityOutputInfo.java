
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowActivityOutputInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowActivityOutputInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flowActivities" type="{http://www.elsevier.com/opsbank2/input/v1}ArrayOfFlowActivityInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowActivityOutputInfo", propOrder = {
    "flowActivities"
})
public class FlowActivityOutputInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfFlowActivityInfo flowActivities;

    /**
     * Gets the value of the flowActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlowActivityInfo }
     *     
     */
    public ArrayOfFlowActivityInfo getFlowActivities() {
        return flowActivities;
    }

    /**
     * Sets the value of the flowActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlowActivityInfo }
     *     
     */
    public void setFlowActivities(ArrayOfFlowActivityInfo value) {
        this.flowActivities = value;
    }

}
