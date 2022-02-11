
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveTpaAndPublisherInputInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveTpaAndPublisherInputInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parcelUnitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveTpaAndPublisherInputInfo", propOrder = {
    "parcelUnitId",
    "sourceId"
})
public class RetrieveTpaAndPublisherInputInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Long parcelUnitId;
    protected Long sourceId;

    /**
     * Gets the value of the parcelUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParcelUnitId() {
        return parcelUnitId;
    }

    /**
     * Sets the value of the parcelUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParcelUnitId(Long value) {
        this.parcelUnitId = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceId(Long value) {
        this.sourceId = value;
    }

}
