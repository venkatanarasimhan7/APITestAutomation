
package com.elsevier.obii.services.admin.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for PersonVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personFamilyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personFunctionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personHonoursName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personInitialsName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personPrefixName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personSaltnName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="personTitleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonVO", propOrder = {
    "partyId",
    "personFamilyName",
    "personFirstName",
    "personFunctionName",
    "personHonoursName",
    "personInitialsName",
    "personPrefixName",
    "personSaltnName",
    "personTitleName"
})
public class PersonVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String partyId;
    @XmlElement(required = true, nillable = true)
    protected String personFamilyName;
    @XmlElement(required = true, nillable = true)
    protected String personFirstName;
    @XmlElement(required = true, nillable = true)
    protected String personFunctionName;
    @XmlElement(required = true, nillable = true)
    protected String personHonoursName;
    @XmlElement(required = true, nillable = true)
    protected String personInitialsName;
    @XmlElement(required = true, nillable = true)
    protected String personPrefixName;
    @XmlElement(required = true, nillable = true)
    protected String personSaltnName;
    @XmlElement(required = true, nillable = true)
    protected String personTitleName;

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the personFamilyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFamilyName() {
        return personFamilyName;
    }

    /**
     * Sets the value of the personFamilyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFamilyName(String value) {
        this.personFamilyName = value;
    }

    /**
     * Gets the value of the personFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFirstName() {
        return personFirstName;
    }

    /**
     * Sets the value of the personFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFirstName(String value) {
        this.personFirstName = value;
    }

    /**
     * Gets the value of the personFunctionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFunctionName() {
        return personFunctionName;
    }

    /**
     * Sets the value of the personFunctionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFunctionName(String value) {
        this.personFunctionName = value;
    }

    /**
     * Gets the value of the personHonoursName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonHonoursName() {
        return personHonoursName;
    }

    /**
     * Sets the value of the personHonoursName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonHonoursName(String value) {
        this.personHonoursName = value;
    }

    /**
     * Gets the value of the personInitialsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonInitialsName() {
        return personInitialsName;
    }

    /**
     * Sets the value of the personInitialsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonInitialsName(String value) {
        this.personInitialsName = value;
    }

    /**
     * Gets the value of the personPrefixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonPrefixName() {
        return personPrefixName;
    }

    /**
     * Sets the value of the personPrefixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonPrefixName(String value) {
        this.personPrefixName = value;
    }

    /**
     * Gets the value of the personSaltnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonSaltnName() {
        return personSaltnName;
    }

    /**
     * Sets the value of the personSaltnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonSaltnName(String value) {
        this.personSaltnName = value;
    }

    /**
     * Gets the value of the personTitleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonTitleName() {
        return personTitleName;
    }

    /**
     * Sets the value of the personTitleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonTitleName(String value) {
        this.personTitleName = value;
    }

}
