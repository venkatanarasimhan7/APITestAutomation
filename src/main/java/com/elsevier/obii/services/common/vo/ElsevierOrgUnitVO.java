
package com.elsevier.obii.services.common.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for ElsevierOrgUnitVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElsevierOrgUnitVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elsevierOrgUnitDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="elsevierOrgUnitId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="elsevierOrgUnitName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElsevierOrgUnitVO", propOrder = {
    "elsevierOrgUnitDesc",
    "elsevierOrgUnitId",
    "elsevierOrgUnitName"
})
public class ElsevierOrgUnitVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String elsevierOrgUnitDesc;
    @XmlElement(required = true, nillable = true)
    protected String elsevierOrgUnitId;
    @XmlElement(required = true, nillable = true)
    protected String elsevierOrgUnitName;

    /**
     * Gets the value of the elsevierOrgUnitDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElsevierOrgUnitDesc() {
        return elsevierOrgUnitDesc;
    }

    /**
     * Sets the value of the elsevierOrgUnitDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElsevierOrgUnitDesc(String value) {
        this.elsevierOrgUnitDesc = value;
    }

    /**
     * Gets the value of the elsevierOrgUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElsevierOrgUnitId() {
        return elsevierOrgUnitId;
    }

    /**
     * Sets the value of the elsevierOrgUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElsevierOrgUnitId(String value) {
        this.elsevierOrgUnitId = value;
    }

    /**
     * Gets the value of the elsevierOrgUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElsevierOrgUnitName() {
        return elsevierOrgUnitName;
    }

    /**
     * Sets the value of the elsevierOrgUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElsevierOrgUnitName(String value) {
        this.elsevierOrgUnitName = value;
    }

}
