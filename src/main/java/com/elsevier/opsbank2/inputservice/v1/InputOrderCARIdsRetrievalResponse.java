
package com.elsevier.opsbank2.inputservice.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.IntegrationServiceResponse;
import com.elsevier.opsbank2.input.v1.InputOrderCARIdsRetrievalOutputInfo;


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
 *         &lt;element name="inputOrderCARIdsRetrievalResponseReturn" type="{http://www.elsevier.com/opsbank2/input/v1}InputOrderCARIdsRetrievalOutputInfo" minOccurs="0"/&gt;
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
    "inputOrderCARIdsRetrievalResponseReturn"
})
@XmlRootElement(name = "inputOrderCARIdsRetrievalResponse")
public class InputOrderCARIdsRetrievalResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected InputOrderCARIdsRetrievalOutputInfo inputOrderCARIdsRetrievalResponseReturn;

    /**
     * Gets the value of the inputOrderCARIdsRetrievalResponseReturn property.
     * 
     * @return
     *     possible object is
     *     {@link InputOrderCARIdsRetrievalOutputInfo }
     *     
     */
    public InputOrderCARIdsRetrievalOutputInfo getInputOrderCARIdsRetrievalResponseReturn() {
        return inputOrderCARIdsRetrievalResponseReturn;
    }

    /**
     * Sets the value of the inputOrderCARIdsRetrievalResponseReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputOrderCARIdsRetrievalOutputInfo }
     *     
     */
    public void setInputOrderCARIdsRetrievalResponseReturn(InputOrderCARIdsRetrievalOutputInfo value) {
        this.inputOrderCARIdsRetrievalResponseReturn = value;
    }

}
