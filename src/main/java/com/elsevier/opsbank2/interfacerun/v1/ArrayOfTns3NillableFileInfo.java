
package com.elsevier.opsbank2.interfacerun.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_tns3_nillable_FileInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns3_nillable_FileInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileInfo" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}FileInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns3_nillable_FileInfo", propOrder = {
    "fileInfo"
})
public class ArrayOfTns3NillableFileInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FileInfo")
    protected List<FileInfo> fileInfo;

    /**
     * Gets the value of the fileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileInfo }
     * 
     * 
     */
    public List<FileInfo> getFileInfo() {
        if (fileInfo == null) {
            fileInfo = new ArrayList<FileInfo>();
        }
        return this.fileInfo;
    }

}
