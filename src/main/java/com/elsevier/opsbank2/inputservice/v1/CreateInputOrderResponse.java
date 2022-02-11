
package com.elsevier.opsbank2.inputservice.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.IntegrationServiceResponse;
import com.elsevier.opsbank2.input.v1.OPSBankInput;


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
 *         &lt;element name="createInputOrderResponseReturn" type="{http://www.elsevier.com/opsbank2/input/v1}OPSBankInput" minOccurs="0"/&gt;
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
    "createInputOrderResponseReturn"
})
@XmlRootElement(name = "createInputOrderResponse")
public class CreateInputOrderResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected OPSBankInput createInputOrderResponseReturn;

    /**
     * Gets the value of the createInputOrderResponseReturn property.
     * 
     * @return
     *     possible object is
     *     {@link OPSBankInput }
     *     
     */
    public OPSBankInput getCreateInputOrderResponseReturn() {
        return createInputOrderResponseReturn;
    }

    /**
     * Sets the value of the createInputOrderResponseReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPSBankInput }
     *     
     */
    public void setCreateInputOrderResponseReturn(OPSBankInput value) {
        this.createInputOrderResponseReturn = value;
    }

}
