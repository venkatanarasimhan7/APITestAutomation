
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityInstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputActivityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="inputActivityInsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityInstruction", propOrder = {
    "inputActivityId",
    "inputActivityInsName"
})
public class ActivityInstruction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Long inputActivityId;
    protected String inputActivityInsName;

    /**
     * Gets the value of the inputActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInputActivityId() {
        return inputActivityId;
    }

    /**
     * Sets the value of the inputActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInputActivityId(Long value) {
        this.inputActivityId = value;
    }

    /**
     * Gets the value of the inputActivityInsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputActivityInsName() {
        return inputActivityInsName;
    }

    /**
     * Sets the value of the inputActivityInsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputActivityInsName(String value) {
        this.inputActivityInsName = value;
    }

}
