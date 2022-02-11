
package com.elsevier.opsbank2.inputservice.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.IntegrationServiceResponse;
import com.elsevier.opsbank2.input.v1.PatentDetailsRetrievalOutputInfo;


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
 *         &lt;element name="patentDetailsRetrievalResponseReturn" type="{http://www.elsevier.com/opsbank2/input/v1}PatentDetailsRetrievalOutputInfo" minOccurs="0"/&gt;
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
    "patentDetailsRetrievalResponseReturn"
})
@XmlRootElement(name = "patentDetailsRetrievalResponse")
public class PatentDetailsRetrievalResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PatentDetailsRetrievalOutputInfo patentDetailsRetrievalResponseReturn;

    /**
     * Gets the value of the patentDetailsRetrievalResponseReturn property.
     * 
     * @return
     *     possible object is
     *     {@link PatentDetailsRetrievalOutputInfo }
     *     
     */
    public PatentDetailsRetrievalOutputInfo getPatentDetailsRetrievalResponseReturn() {
        return patentDetailsRetrievalResponseReturn;
    }

    /**
     * Sets the value of the patentDetailsRetrievalResponseReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatentDetailsRetrievalOutputInfo }
     *     
     */
    public void setPatentDetailsRetrievalResponseReturn(PatentDetailsRetrievalOutputInfo value) {
        this.patentDetailsRetrievalResponseReturn = value;
    }

}
