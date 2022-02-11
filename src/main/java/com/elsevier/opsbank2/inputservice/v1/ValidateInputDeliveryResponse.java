
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
 *         &lt;element name="validateInputDeliveryResponseReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "validateInputDeliveryResponseReturn"
})
@XmlRootElement(name = "validateInputDeliveryResponse")
public class ValidateInputDeliveryResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean validateInputDeliveryResponseReturn;

    /**
     * Gets the value of the validateInputDeliveryResponseReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateInputDeliveryResponseReturn() {
        return validateInputDeliveryResponseReturn;
    }

    /**
     * Sets the value of the validateInputDeliveryResponseReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateInputDeliveryResponseReturn(Boolean value) {
        this.validateInputDeliveryResponseReturn = value;
    }

}
