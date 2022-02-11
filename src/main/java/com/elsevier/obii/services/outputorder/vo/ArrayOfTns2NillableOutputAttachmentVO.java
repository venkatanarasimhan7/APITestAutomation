
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_tns2_nillable_OutputAttachmentVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns2_nillable_OutputAttachmentVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutputAttachmentVO" type="{http://vo.outputorder.services.obii.elsevier.com}OutputAttachmentVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns2_nillable_OutputAttachmentVO", propOrder = {
    "outputAttachmentVO"
})
public class ArrayOfTns2NillableOutputAttachmentVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OutputAttachmentVO", nillable = true)
    protected List<OutputAttachmentVO> outputAttachmentVO;

    /**
     * Gets the value of the outputAttachmentVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputAttachmentVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputAttachmentVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputAttachmentVO }
     * 
     * 
     */
    public List<OutputAttachmentVO> getOutputAttachmentVO() {
        if (outputAttachmentVO == null) {
            outputAttachmentVO = new ArrayList<OutputAttachmentVO>();
        }
        return this.outputAttachmentVO;
    }

}
