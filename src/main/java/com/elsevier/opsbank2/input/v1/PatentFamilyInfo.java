
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patentFamilyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patentFamilyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bibRecId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="patentCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pubKindNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patentFamilyInfo", propOrder = {
    "bibRecId",
    "docNumber",
    "patentCountry",
    "pubKindNumber"
})
public class PatentFamilyInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String bibRecId;
    protected String docNumber;
    protected String patentCountry;
    protected String pubKindNumber;

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

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the patentCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatentCountry() {
        return patentCountry;
    }

    /**
     * Sets the value of the patentCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatentCountry(String value) {
        this.patentCountry = value;
    }

    /**
     * Gets the value of the pubKindNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubKindNumber() {
        return pubKindNumber;
    }

    /**
     * Sets the value of the pubKindNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubKindNumber(String value) {
        this.pubKindNumber = value;
    }

}
