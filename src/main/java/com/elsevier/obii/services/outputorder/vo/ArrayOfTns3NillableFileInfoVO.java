
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.FileInfoVO;


/**
 * <p>Java class for ArrayOf_tns3_nillable_FileInfoVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns3_nillable_FileInfoVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileInfoVO" type="{http://vo.obii.elsevier.com}FileInfoVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns3_nillable_FileInfoVO", propOrder = {
    "fileInfoVO"
})
public class ArrayOfTns3NillableFileInfoVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FileInfoVO", nillable = true)
    protected List<FileInfoVO> fileInfoVO;

    /**
     * Gets the value of the fileInfoVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileInfoVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileInfoVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileInfoVO }
     * 
     * 
     */
    public List<FileInfoVO> getFileInfoVO() {
        if (fileInfoVO == null) {
            fileInfoVO = new ArrayList<FileInfoVO>();
        }
        return this.fileInfoVO;
    }

}
