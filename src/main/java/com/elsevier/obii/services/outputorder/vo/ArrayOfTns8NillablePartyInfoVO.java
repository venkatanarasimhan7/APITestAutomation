
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.common.vo.PartyInfoVO;


/**
 * <p>Java class for ArrayOf_tns8_nillable_PartyInfoVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns8_nillable_PartyInfoVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyInfoVO" type="{http://vo.common.services.obii.elsevier.com}PartyInfoVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns8_nillable_PartyInfoVO", propOrder = {
    "partyInfoVO"
})
public class ArrayOfTns8NillablePartyInfoVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PartyInfoVO", nillable = true)
    protected List<PartyInfoVO> partyInfoVO;

    /**
     * Gets the value of the partyInfoVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyInfoVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyInfoVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyInfoVO }
     * 
     * 
     */
    public List<PartyInfoVO> getPartyInfoVO() {
        if (partyInfoVO == null) {
            partyInfoVO = new ArrayList<PartyInfoVO>();
        }
        return this.partyInfoVO;
    }

}
