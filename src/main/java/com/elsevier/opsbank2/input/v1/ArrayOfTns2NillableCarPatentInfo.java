
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_tns2_nillable_CarPatentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_tns2_nillable_CarPatentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarPatentInfo" type="{http://www.elsevier.com/opsbank2/input/v1}CarPatentInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_tns2_nillable_CarPatentInfo", propOrder = {
    "carPatentInfo"
})
public class ArrayOfTns2NillableCarPatentInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CarPatentInfo", nillable = true)
    protected List<CarPatentInfo> carPatentInfo;

    /**
     * Gets the value of the carPatentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carPatentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarPatentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarPatentInfo }
     * 
     * 
     */
    public List<CarPatentInfo> getCarPatentInfo() {
        if (carPatentInfo == null) {
            carPatentInfo = new ArrayList<CarPatentInfo>();
        }
        return this.carPatentInfo;
    }

}
