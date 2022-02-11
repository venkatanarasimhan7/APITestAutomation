
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_tns2_nillable_DataScopeVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns2_nillable_DataScopeVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataScopeVO" type="{http://vo.outputorder.services.obii.elsevier.com}DataScopeVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns2_nillable_DataScopeVO", propOrder = {
    "dataScopeVO"
})
public class ArrayOfTns2NillableDataScopeVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataScopeVO", nillable = true)
    protected List<DataScopeVO> dataScopeVO;

    /**
     * Gets the value of the dataScopeVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataScopeVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataScopeVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataScopeVO }
     * 
     * 
     */
    public List<DataScopeVO> getDataScopeVO() {
        if (dataScopeVO == null) {
            dataScopeVO = new ArrayList<DataScopeVO>();
        }
        return this.dataScopeVO;
    }

}
