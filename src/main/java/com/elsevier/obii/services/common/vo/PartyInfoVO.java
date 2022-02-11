
package com.elsevier.obii.services.common.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for PartyInfoVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyInfoVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyInRoleId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partyRole" type="{http://vo.common.services.obii.elsevier.com}CodeListItemDetailsVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyInfoVO", propOrder = {
    "partyInRoleId",
    "partyDesc",
    "partyId",
    "partyName",
    "partyRole"
})
public class PartyInfoVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String partyInRoleId;
    @XmlElement(required = true, nillable = true)
    protected String partyDesc;
    @XmlElement(required = true, nillable = true)
    protected String partyId;
    @XmlElement(required = true, nillable = true)
    protected String partyName;
    @XmlElement(required = true, nillable = true)
    protected CodeListItemDetailsVO partyRole;

    /**
     * Gets the value of the partyInRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyInRoleId() {
        return partyInRoleId;
    }

    /**
     * Sets the value of the partyInRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyInRoleId(String value) {
        this.partyInRoleId = value;
    }

    /**
     * Gets the value of the partyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyDesc() {
        return partyDesc;
    }

    /**
     * Sets the value of the partyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyDesc(String value) {
        this.partyDesc = value;
    }

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
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public CodeListItemDetailsVO getPartyRole() {
        return partyRole;
    }

    /**
     * Sets the value of the partyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public void setPartyRole(CodeListItemDetailsVO value) {
        this.partyRole = value;
    }

}
