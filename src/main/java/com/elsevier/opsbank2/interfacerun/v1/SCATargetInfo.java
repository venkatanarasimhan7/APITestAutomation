
package com.elsevier.opsbank2.interfacerun.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCATargetInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCATargetInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetComponent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetExport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCATargetInfo", propOrder = {
    "targetComponent",
    "targetModule",
    "targetExport"
})
public class SCATargetInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String targetComponent;
    protected String targetModule;
    protected String targetExport;

    /**
     * Gets the value of the targetComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetComponent() {
        return targetComponent;
    }

    /**
     * Sets the value of the targetComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetComponent(String value) {
        this.targetComponent = value;
    }

    /**
     * Gets the value of the targetModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetModule() {
        return targetModule;
    }

    /**
     * Sets the value of the targetModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetModule(String value) {
        this.targetModule = value;
    }

    /**
     * Gets the value of the targetExport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetExport() {
        return targetExport;
    }

    /**
     * Sets the value of the targetExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetExport(String value) {
        this.targetExport = value;
    }

}
