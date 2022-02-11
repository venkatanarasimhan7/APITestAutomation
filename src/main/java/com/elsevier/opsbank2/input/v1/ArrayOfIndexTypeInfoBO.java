
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIndexTypeInfoBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIndexTypeInfoBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IndexInfoDetails" type="{http://www.elsevier.com/opsbank2/input/v1}IndexTypeInfoBO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIndexTypeInfoBO", propOrder = {
    "indexInfoDetails"
})
public class ArrayOfIndexTypeInfoBO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IndexInfoDetails")
    protected List<IndexTypeInfoBO> indexInfoDetails;

    /**
     * Gets the value of the indexInfoDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexInfoDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexInfoDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexTypeInfoBO }
     * 
     * 
     */
    public List<IndexTypeInfoBO> getIndexInfoDetails() {
        if (indexInfoDetails == null) {
            indexInfoDetails = new ArrayList<IndexTypeInfoBO>();
        }
        return this.indexInfoDetails;
    }

}
