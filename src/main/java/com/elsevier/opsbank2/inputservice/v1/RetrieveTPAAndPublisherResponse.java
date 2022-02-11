
package com.elsevier.opsbank2.inputservice.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.IntegrationServiceResponse;
import com.elsevier.opsbank2.input.v1.TPAAndPublisher;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}integrationServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="retrieveTpaAndPublisherResponseReturn" type="{http://www.elsevier.com/opsbank2/input/v1}TPAAndPublisher" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retrieveTpaAndPublisherResponseReturn"
})
@XmlRootElement(name = "retrieveTPAAndPublisherResponse")
public class RetrieveTPAAndPublisherResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected TPAAndPublisher retrieveTpaAndPublisherResponseReturn;

    /**
     * Gets the value of the retrieveTpaAndPublisherResponseReturn property.
     * 
     * @return
     *     possible object is
     *     {@link TPAAndPublisher }
     *     
     */
    public TPAAndPublisher getRetrieveTpaAndPublisherResponseReturn() {
        return retrieveTpaAndPublisherResponseReturn;
    }

    /**
     * Sets the value of the retrieveTpaAndPublisherResponseReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAAndPublisher }
     *     
     */
    public void setRetrieveTpaAndPublisherResponseReturn(TPAAndPublisher value) {
        this.retrieveTpaAndPublisherResponseReturn = value;
    }

}
