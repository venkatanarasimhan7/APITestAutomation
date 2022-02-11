
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatentCarOutputInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatentCarOutputInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carPatentInfo" type="{http://www.elsevier.com/opsbank2/input/v1}ArrayOf_tns2_nillable_CarPatentInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatentCarOutputInfo", propOrder = {
    "carPatentInfo"
})
public class PatentCarOutputInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ArrayOfTns2NillableCarPatentInfo carPatentInfo;

    /**
     * Gets the value of the carPatentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableCarPatentInfo }
     *     
     */
    public ArrayOfTns2NillableCarPatentInfo getCarPatentInfo() {
        return carPatentInfo;
    }

    /**
     * Sets the value of the carPatentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableCarPatentInfo }
     *     
     */
    public void setCarPatentInfo(ArrayOfTns2NillableCarPatentInfo value) {
        this.carPatentInfo = value;
    }

}
