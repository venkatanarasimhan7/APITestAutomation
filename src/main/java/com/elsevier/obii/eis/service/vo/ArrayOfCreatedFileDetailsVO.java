
package com.elsevier.obii.eis.service.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCreatedFileDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCreatedFileDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedFileDetailsVO" type="{http://vo.service.eis.obii.elsevier.com}CreatedFileDetailsVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCreatedFileDetailsVO", propOrder = {
    "createdFileDetailsVO"
})
public class ArrayOfCreatedFileDetailsVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CreatedFileDetailsVO")
    protected List<CreatedFileDetailsVO> createdFileDetailsVO;

    /**
     * Gets the value of the createdFileDetailsVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createdFileDetailsVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatedFileDetailsVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreatedFileDetailsVO }
     * 
     * 
     */
    public List<CreatedFileDetailsVO> getCreatedFileDetailsVO() {
        if (createdFileDetailsVO == null) {
            createdFileDetailsVO = new ArrayList<CreatedFileDetailsVO>();
        }
        return this.createdFileDetailsVO;
    }

}
