
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.common.vo.ElsevierOrgUnitVO;


/**
 * <p>Java class for ArrayOf_tns8_nillable_ElsevierOrgUnitVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns8_nillable_ElsevierOrgUnitVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElsevierOrgUnitVO" type="{http://vo.common.services.obii.elsevier.com}ElsevierOrgUnitVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns8_nillable_ElsevierOrgUnitVO", propOrder = {
    "elsevierOrgUnitVO"
})
public class ArrayOfTns8NillableElsevierOrgUnitVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ElsevierOrgUnitVO", nillable = true)
    protected List<ElsevierOrgUnitVO> elsevierOrgUnitVO;

    /**
     * Gets the value of the elsevierOrgUnitVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elsevierOrgUnitVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElsevierOrgUnitVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElsevierOrgUnitVO }
     * 
     * 
     */
    public List<ElsevierOrgUnitVO> getElsevierOrgUnitVO() {
        if (elsevierOrgUnitVO == null) {
            elsevierOrgUnitVO = new ArrayList<ElsevierOrgUnitVO>();
        }
        return this.elsevierOrgUnitVO;
    }

}
