
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchPatentFamily complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchPatentFamily"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="patentFamilyResponse" type="{http://www.elsevier.com/opsbank2/input/v1}patentFamilyResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchPatentFamily", propOrder = {
    "patentFamilyResponse"
})
public class MatchPatentFamily
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected PatentFamilyResponse patentFamilyResponse;

    /**
     * Gets the value of the patentFamilyResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PatentFamilyResponse }
     *     
     */
    public PatentFamilyResponse getPatentFamilyResponse() {
        return patentFamilyResponse;
    }

    /**
     * Sets the value of the patentFamilyResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatentFamilyResponse }
     *     
     */
    public void setPatentFamilyResponse(PatentFamilyResponse value) {
        this.patentFamilyResponse = value;
    }

}
