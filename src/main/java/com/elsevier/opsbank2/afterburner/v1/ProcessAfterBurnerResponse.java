
package com.elsevier.opsbank2.afterburner.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.opsbank2.integration.common.IntegrationServiceResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.integration.opsbank2.elsevier.com}integrationServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processAfterBurnerResponseReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "processAfterBurnerResponseReturn"
})
@XmlRootElement(name = "processAfterBurnerResponse")
public class ProcessAfterBurnerResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean processAfterBurnerResponseReturn;

    /**
     * Gets the value of the processAfterBurnerResponseReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessAfterBurnerResponseReturn() {
        return processAfterBurnerResponseReturn;
    }

    /**
     * Sets the value of the processAfterBurnerResponseReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessAfterBurnerResponseReturn(Boolean value) {
        this.processAfterBurnerResponseReturn = value;
    }

}
