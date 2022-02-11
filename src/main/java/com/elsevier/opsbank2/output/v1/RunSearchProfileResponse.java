
package com.elsevier.opsbank2.output.v1;

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
 *         &lt;element name="runSearchProfileResponseReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "runSearchProfileResponseReturn"
})
@XmlRootElement(name = "runSearchProfileResponse")
public class RunSearchProfileResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean runSearchProfileResponseReturn;

    /**
     * Gets the value of the runSearchProfileResponseReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunSearchProfileResponseReturn() {
        return runSearchProfileResponseReturn;
    }

    /**
     * Sets the value of the runSearchProfileResponseReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunSearchProfileResponseReturn(Boolean value) {
        this.runSearchProfileResponseReturn = value;
    }

}
