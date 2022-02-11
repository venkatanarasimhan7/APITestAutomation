
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitFileInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitFileInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitFileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="unitFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitFileInfo", propOrder = {
    "unitFileId",
    "unitFileName"
})
public class UnitFileInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Long unitFileId;
    protected String unitFileName;

    /**
     * Gets the value of the unitFileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitFileId() {
        return unitFileId;
    }

    /**
     * Sets the value of the unitFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitFileId(Long value) {
        this.unitFileId = value;
    }

    /**
     * Gets the value of the unitFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitFileName() {
        return unitFileName;
    }

    /**
     * Sets the value of the unitFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitFileName(String value) {
        this.unitFileName = value;
    }

}
