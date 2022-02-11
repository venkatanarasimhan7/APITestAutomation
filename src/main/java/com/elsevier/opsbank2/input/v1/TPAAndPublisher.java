
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPAAndPublisher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPAAndPublisher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="retrieveTpaAndPublisherOutputInfo" type="{http://www.elsevier.com/opsbank2/input/v1}retrieveTpaAndPublisherOutputInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPAAndPublisher", propOrder = {
    "retrieveTpaAndPublisherOutputInfo"
})
public class TPAAndPublisher
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected RetrieveTpaAndPublisherOutputInfo retrieveTpaAndPublisherOutputInfo;

    /**
     * Gets the value of the retrieveTpaAndPublisherOutputInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveTpaAndPublisherOutputInfo }
     *     
     */
    public RetrieveTpaAndPublisherOutputInfo getRetrieveTpaAndPublisherOutputInfo() {
        return retrieveTpaAndPublisherOutputInfo;
    }

    /**
     * Sets the value of the retrieveTpaAndPublisherOutputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveTpaAndPublisherOutputInfo }
     *     
     */
    public void setRetrieveTpaAndPublisherOutputInfo(RetrieveTpaAndPublisherOutputInfo value) {
        this.retrieveTpaAndPublisherOutputInfo = value;
    }

}
