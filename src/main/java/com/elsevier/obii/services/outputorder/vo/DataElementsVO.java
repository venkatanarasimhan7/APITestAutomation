
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for DataElementsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataElementsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasAbstract" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasCitation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasReferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataElementsVO", propOrder = {
    "hasAbstract",
    "hasCitation",
    "hasReferences"
})
public class DataElementsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean hasAbstract;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean hasCitation;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean hasReferences;

    /**
     * Gets the value of the hasAbstract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAbstract() {
        return hasAbstract;
    }

    /**
     * Sets the value of the hasAbstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAbstract(Boolean value) {
        this.hasAbstract = value;
    }

    /**
     * Gets the value of the hasCitation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCitation() {
        return hasCitation;
    }

    /**
     * Sets the value of the hasCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCitation(Boolean value) {
        this.hasCitation = value;
    }

    /**
     * Gets the value of the hasReferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReferences() {
        return hasReferences;
    }

    /**
     * Sets the value of the hasReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReferences(Boolean value) {
        this.hasReferences = value;
    }

}
