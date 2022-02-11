
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.admin.vo.FTPAddressVO;


/**
 * <p>Java class for ArrayOf_tns9_nillable_FTPAddressVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns9_nillable_FTPAddressVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FTPAddressVO" type="{http://vo.admin.services.obii.elsevier.com}FTPAddressVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns9_nillable_FTPAddressVO", propOrder = {
    "ftpAddressVO"
})
public class ArrayOfTns9NillableFTPAddressVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FTPAddressVO", nillable = true)
    protected List<FTPAddressVO> ftpAddressVO;

    /**
     * Gets the value of the ftpAddressVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ftpAddressVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFTPAddressVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTPAddressVO }
     * 
     * 
     */
    public List<FTPAddressVO> getFTPAddressVO() {
        if (ftpAddressVO == null) {
            ftpAddressVO = new ArrayList<FTPAddressVO>();
        }
        return this.ftpAddressVO;
    }

}
