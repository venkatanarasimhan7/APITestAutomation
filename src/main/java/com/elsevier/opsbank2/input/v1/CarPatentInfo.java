
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarPatentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarPatentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="patentOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="patentKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicationKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarPatentInfo", propOrder = {
    "carId",
    "patentOffice",
    "patentKind",
    "publicationKind"
})
public class CarPatentInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String carId;
    protected String patentOffice;
    protected String patentKind;
    protected String publicationKind;

    /**
     * Gets the value of the carId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarId(String value) {
        this.carId = value;
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

}
