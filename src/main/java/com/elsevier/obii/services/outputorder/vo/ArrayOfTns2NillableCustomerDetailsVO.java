
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_tns2_nillable_CustomerDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns2_nillable_CustomerDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerDetailsVO" type="{http://vo.outputorder.services.obii.elsevier.com}CustomerDetailsVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns2_nillable_CustomerDetailsVO", propOrder = {
    "customerDetailsVO"
})
public class ArrayOfTns2NillableCustomerDetailsVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CustomerDetailsVO", nillable = true)
    protected List<CustomerDetailsVO> customerDetailsVO;

    /**
     * Gets the value of the customerDetailsVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerDetailsVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerDetailsVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerDetailsVO }
     * 
     * 
     */
    public List<CustomerDetailsVO> getCustomerDetailsVO() {
        if (customerDetailsVO == null) {
            customerDetailsVO = new ArrayList<CustomerDetailsVO>();
        }
        return this.customerDetailsVO;
    }

}
