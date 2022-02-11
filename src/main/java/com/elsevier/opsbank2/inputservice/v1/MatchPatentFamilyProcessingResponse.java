
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
 *         &lt;element name="matchPatentFamilyProcessingReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "matchPatentFamilyProcessingReturn"
})
@XmlRootElement(name = "matchPatentFamilyProcessingResponse")
public class MatchPatentFamilyProcessingResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean matchPatentFamilyProcessingReturn;

    /**
     * Gets the value of the matchPatentFamilyProcessingReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchPatentFamilyProcessingReturn() {
        return matchPatentFamilyProcessingReturn;
    }

    /**
     * Sets the value of the matchPatentFamilyProcessingReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchPatentFamilyProcessingReturn(Boolean value) {
        this.matchPatentFamilyProcessingReturn = value;
    }

}
