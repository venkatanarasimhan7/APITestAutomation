
package com.elsevier.opsbank2.inputservice.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.IntegrationServiceResponse;


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
 *         &lt;element name="simulateCARDeliveryReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "simulateCARDeliveryReturn"
})
@XmlRootElement(name = "simulateCARDeliveryResponse")
public class SimulateCARDeliveryResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String simulateCARDeliveryReturn;

    /**
     * Gets the value of the simulateCARDeliveryReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimulateCARDeliveryReturn() {
        return simulateCARDeliveryReturn;
    }

    /**
     * Sets the value of the simulateCARDeliveryReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimulateCARDeliveryReturn(String value) {
        this.simulateCARDeliveryReturn = value;
    }

}
