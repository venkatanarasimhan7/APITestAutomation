
package com.elsevier.obii.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.opsbank2.output.v1.CancelDataDeliveryResponse;
import com.elsevier.opsbank2.output.v1.DeliverOutputOrderDataFilesToCustomerResponse;
import com.elsevier.opsbank2.output.v1.GetPostProcessStatusResponse;
import com.elsevier.opsbank2.output.v1.GetUserAndOrderInfoResponse;
import com.elsevier.opsbank2.output.v1.GetUserDetailsResponse;
import com.elsevier.opsbank2.output.v1.RegisterDataDeliveryResponse;
import com.elsevier.opsbank2.output.v1.RunSearchProfileResponse;
import com.elsevier.opsbank2.output.v1.SendDeliveryNotificationEmailResponse;
import com.elsevier.opsbank2.output.v1.StartOutputXMLGenerationResponse;


/**
 * <p>Java class for integrationServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="integrationServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alerts" type="{http://vo.obii.elsevier.com}alerts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "integrationServiceResponse", propOrder = {
    "alerts"
})
@XmlSeeAlso({
    SendDeliveryNotificationEmailResponse.class,
    DeliverOutputOrderDataFilesToCustomerResponse.class,
    GetPostProcessStatusResponse.class,
    StartOutputXMLGenerationResponse.class,
    RunSearchProfileResponse.class,
    RegisterDataDeliveryResponse.class,
    GetUserAndOrderInfoResponse.class,
    GetUserDetailsResponse.class,
    CancelDataDeliveryResponse.class
})
public class IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Alerts alerts;

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link Alerts }
     *     
     */
    public Alerts getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alerts }
     *     
     */
    public void setAlerts(Alerts value) {
        this.alerts = value;
    }

}
