
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatentFamilyEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatentFamilyEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CARID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PatentOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PatentKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublicationKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsMatched" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatentFamilyEntry", propOrder = {
    "carid",
    "patentOffice",
    "patentKind",
    "publicationKind",
    "isMatched"
})
public class PatentFamilyEntry
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CARID")
    protected String carid;
    @XmlElement(name = "PatentOffice")
    protected String patentOffice;
    @XmlElement(name = "PatentKind")
    protected String patentKind;
    @XmlElement(name = "PublicationKind")
    protected String publicationKind;
    @XmlElement(name = "IsMatched")
    protected Boolean isMatched;

    /**
     * Gets the value of the carid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARID() {
        return carid;
    }

    /**
     * Sets the value of the carid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARID(String value) {
        this.carid = value;
    }

    /**
     * Gets the value of the patentOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatentOffice() {
        return patentOffice;
    }

    /**
     * Sets the value of the patentOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatentOffice(String value) {
        this.patentOffice = value;
    }

    /**
     * Gets the value of the patentKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatentKind() {
        return patentKind;
    }

    /**
     * Sets the value of the patentKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatentKind(String value) {
        this.patentKind = value;
    }

    /**
     * Gets the value of the publicationKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationKind() {
        return publicationKind;
    }

    /**
     * Sets the value of the publicationKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationKind(String value) {
        this.publicationKind = value;
    }

    /**
     * Gets the value of the isMatched property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMatched() {
        return isMatched;
    }

    /**
     * Sets the value of the isMatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMatched(Boolean value) {
        this.isMatched = value;
    }

}
