
package com.elsevier.opsbank2.interfacerun.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterfaceParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interfaceParameterDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interfaceParameterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interfaceParameterSeqno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceParameterTypeCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="partyInRoleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="paramValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interfaceParameterValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceParams", propOrder = {
    "interfaceParameterDesc",
    "interfaceParameterName",
    "interfaceParameterSeqno",
    "interfaceParameterTypeCode",
    "partyInRoleId",
    "paramValueType",
    "interfaceParameterValue"
})
public class InterfaceParams
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String interfaceParameterDesc;
    protected String interfaceParameterName;
    protected Long interfaceParameterSeqno;
    protected Long interfaceParameterTypeCode;
    protected Long partyInRoleId;
    protected String paramValueType;
    protected String interfaceParameterValue;

    /**
     * Gets the value of the interfaceParameterDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceParameterDesc() {
        return interfaceParameterDesc;
    }

    /**
     * Sets the value of the interfaceParameterDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceParameterDesc(String value) {
        this.interfaceParameterDesc = value;
    }

    /**
     * Gets the value of the interfaceParameterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceParameterName() {
        return interfaceParameterName;
    }

    /**
     * Sets the value of the interfaceParameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceParameterName(String value) {
        this.interfaceParameterName = value;
    }

    /**
     * Gets the value of the interfaceParameterSeqno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceParameterSeqno() {
        return interfaceParameterSeqno;
    }

    /**
     * Sets the value of the interfaceParameterSeqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceParameterSeqno(Long value) {
        this.interfaceParameterSeqno = value;
    }

    /**
     * Gets the value of the interfaceParameterTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceParameterTypeCode() {
        return interfaceParameterTypeCode;
    }

    /**
     * Sets the value of the interfaceParameterTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceParameterTypeCode(Long value) {
        this.interfaceParameterTypeCode = value;
    }

    /**
     * Gets the value of the partyInRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyInRoleId() {
        return partyInRoleId;
    }

    /**
     * Sets the value of the partyInRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyInRoleId(Long value) {
        this.partyInRoleId = value;
    }

    /**
     * Gets the value of the paramValueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamValueType() {
        return paramValueType;
    }

    /**
     * Sets the value of the paramValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamValueType(String value) {
        this.paramValueType = value;
    }

    /**
     * Gets the value of the interfaceParameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceParameterValue() {
        return interfaceParameterValue;
    }

    /**
     * Sets the value of the interfaceParameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceParameterValue(String value) {
        this.interfaceParameterValue = value;
    }

}
