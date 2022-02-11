
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classificationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classificationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="classificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classificationInfo", propOrder = {
    "classificationType",
    "classificationName"
})
public class ClassificationInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String classificationType;
    protected String classificationName;

    /**
     * Gets the value of the classificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationType() {
        return classificationType;
    }

    /**
     * Sets the value of the classificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationType(String value) {
        this.classificationType = value;
    }

    /**
     * Gets the value of the classificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationName() {
        return classificationName;
    }

    /**
     * Sets the value of the classificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationName(String value) {
        this.classificationName = value;
    }

}
