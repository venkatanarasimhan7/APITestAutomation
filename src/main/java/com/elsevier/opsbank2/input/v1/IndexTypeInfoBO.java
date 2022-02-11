
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexTypeInfoBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexTypeInfoBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IndexTypeClId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputProcessTypeClId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexTypeInfoBO", propOrder = {
    "indexTypeClId",
    "inputProcessTypeClId"
})
public class IndexTypeInfoBO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IndexTypeClId")
    protected String indexTypeClId;
    @XmlElement(name = "InputProcessTypeClId")
    protected String inputProcessTypeClId;

    /**
     * Gets the value of the indexTypeClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexTypeClId() {
        return indexTypeClId;
    }

    /**
     * Sets the value of the indexTypeClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexTypeClId(String value) {
        this.indexTypeClId = value;
    }

    /**
     * Gets the value of the inputProcessTypeClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputProcessTypeClId() {
        return inputProcessTypeClId;
    }

    /**
     * Sets the value of the inputProcessTypeClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputProcessTypeClId(String value) {
        this.inputProcessTypeClId = value;
    }

}
