
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchPatentFamilyOutputInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchPatentFamilyOutputInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unMatchedCarIds" type="{http://www.elsevier.com/opsbank2/input/v1}ArrayOf_tns2_nillable_CarPatentInfo" minOccurs="0"/&gt;
 *         &lt;element name="fullMatched" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="partialMatched" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchPatentFamilyOutputInfo", propOrder = {
    "unMatchedCarIds",
    "fullMatched",
    "partialMatched"
})
public class MatchPatentFamilyOutputInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ArrayOfTns2NillableCarPatentInfo unMatchedCarIds;
    protected Boolean fullMatched;
    protected Boolean partialMatched;

    /**
     * Gets the value of the unMatchedCarIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableCarPatentInfo }
     *     
     */
    public ArrayOfTns2NillableCarPatentInfo getUnMatchedCarIds() {
        return unMatchedCarIds;
    }

    /**
     * Sets the value of the unMatchedCarIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableCarPatentInfo }
     *     
     */
    public void setUnMatchedCarIds(ArrayOfTns2NillableCarPatentInfo value) {
        this.unMatchedCarIds = value;
    }

    /**
     * Gets the value of the fullMatched property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullMatched() {
        return fullMatched;
    }

    /**
     * Sets the value of the fullMatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullMatched(Boolean value) {
        this.fullMatched = value;
    }

    /**
     * Gets the value of the partialMatched property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialMatched() {
        return partialMatched;
    }

    /**
     * Sets the value of the partialMatched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialMatched(Boolean value) {
        this.partialMatched = value;
    }

}
