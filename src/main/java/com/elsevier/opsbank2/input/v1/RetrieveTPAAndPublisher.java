
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveTPAAndPublisher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveTPAAndPublisher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="retrieveTpaAndPublisherInputInfo" type="{http://www.elsevier.com/opsbank2/input/v1}retrieveTpaAndPublisherInputInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveTPAAndPublisher", propOrder = {
    "retrieveTpaAndPublisherInputInfo"
})
public class RetrieveTPAAndPublisher
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected RetrieveTpaAndPublisherInputInfo retrieveTpaAndPublisherInputInfo;

    /**
     * Gets the value of the retrieveTpaAndPublisherInputInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveTpaAndPublisherInputInfo }
     *     
     */
    public RetrieveTpaAndPublisherInputInfo getRetrieveTpaAndPublisherInputInfo() {
        return retrieveTpaAndPublisherInputInfo;
    }

    /**
     * Sets the value of the retrieveTpaAndPublisherInputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveTpaAndPublisherInputInfo }
     *     
     */
    public void setRetrieveTpaAndPublisherInputInfo(RetrieveTpaAndPublisherInputInfo value) {
        this.retrieveTpaAndPublisherInputInfo = value;
    }

}
