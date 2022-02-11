
package com.elsevier.obii.eis.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.eis.service.vo.OutputFileDetailsVO;


/**
 * <p>Java class for ArrayOf_tns2_nillable_OutputFileDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns2_nillable_OutputFileDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutputFileDetailsVO" type="{http://vo.service.eis.obii.elsevier.com}OutputFileDetailsVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns2_nillable_OutputFileDetailsVO", propOrder = {
    "outputFileDetailsVO"
})
public class ArrayOfTns2NillableOutputFileDetailsVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OutputFileDetailsVO", nillable = true)
    protected List<OutputFileDetailsVO> outputFileDetailsVO;

    /**
     * Gets the value of the outputFileDetailsVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputFileDetailsVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputFileDetailsVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputFileDetailsVO }
     * 
     * 
     */
    public List<OutputFileDetailsVO> getOutputFileDetailsVO() {
        if (outputFileDetailsVO == null) {
            outputFileDetailsVO = new ArrayList<OutputFileDetailsVO>();
        }
        return this.outputFileDetailsVO;
    }

}
