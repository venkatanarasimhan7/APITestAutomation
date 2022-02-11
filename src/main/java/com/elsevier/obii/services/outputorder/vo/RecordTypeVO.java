
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for RecordTypeVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordTypeVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasNew" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTypeVO", propOrder = {
    "hasDeleted",
    "hasNew",
    "hasUpdated"
})
public class RecordTypeVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean hasDeleted;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean hasNew;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean hasUpdated;

    /**
     * Gets the value of the hasDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDeleted() {
        return hasDeleted;
    }

    /**
     * Sets the value of the hasDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDeleted(Boolean value) {
        this.hasDeleted = value;
    }

    /**
     * Gets the value of the hasNew property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNew() {
        return hasNew;
    }

    /**
     * Sets the value of the hasNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNew(Boolean value) {
        this.hasNew = value;
    }

    /**
     * Gets the value of the hasUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasUpdated() {
        return hasUpdated;
    }

    /**
     * Sets the value of the hasUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasUpdated(Boolean value) {
        this.hasUpdated = value;
    }

}
