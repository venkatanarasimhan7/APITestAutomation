
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatentDetailsRetrievalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatentDetailsRetrievalRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bibRecId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatentDetailsRetrievalRequest", propOrder = {
    "bibRecId"
})
public class PatentDetailsRetrievalRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String bibRecId;

    /**
     * Gets the value of the bibRecId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBibRecId() {
        return bibRecId;
    }

    /**
     * Sets the value of the bibRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBibRecId(String value) {
        this.bibRecId = value;
    }

}
