
package com.elsevier.opsbank2.outputorder.v1;

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
 *         &lt;element name="createOutputOrderProcessReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "createOutputOrderProcessReturn"
})
@XmlRootElement(name = "createOutputOrderProcessResponse")
public class CreateOutputOrderProcessResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean createOutputOrderProcessReturn;

    /**
     * Gets the value of the createOutputOrderProcessReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateOutputOrderProcessReturn() {
        return createOutputOrderProcessReturn;
    }

    /**
     * Sets the value of the createOutputOrderProcessReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateOutputOrderProcessReturn(Boolean value) {
        this.createOutputOrderProcessReturn = value;
    }

}
