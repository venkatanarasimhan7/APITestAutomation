
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatentDetailsRetrievalOutputInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatentDetailsRetrievalOutputInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OpsbankInput" type="{http://www.elsevier.com/opsbank2/input/v1}OPSBankInput" minOccurs="0"/&gt;
 *         &lt;element name="PatentFamilyInfo" type="{http://www.elsevier.com/opsbank2/input/v1}patentFamilyInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatentDetailsRetrievalOutputInfo", propOrder = {
    "opsbankInput",
    "patentFamilyInfo"
})
public class PatentDetailsRetrievalOutputInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OpsbankInput")
    protected OPSBankInput opsbankInput;
    @XmlElement(name = "PatentFamilyInfo")
    protected PatentFamilyInfo patentFamilyInfo;

    /**
     * Gets the value of the opsbankInput property.
     * 
     * @return
     *     possible object is
     *     {@link OPSBankInput }
     *     
     */
    public OPSBankInput getOpsbankInput() {
        return opsbankInput;
    }

    /**
     * Sets the value of the opsbankInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPSBankInput }
     *     
     */
    public void setOpsbankInput(OPSBankInput value) {
        this.opsbankInput = value;
    }

    /**
     * Gets the value of the patentFamilyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PatentFamilyInfo }
     *     
     */
    public PatentFamilyInfo getPatentFamilyInfo() {
        return patentFamilyInfo;
    }

    /**
     * Sets the value of the patentFamilyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatentFamilyInfo }
     *     
     */
    public void setPatentFamilyInfo(PatentFamilyInfo value) {
        this.patentFamilyInfo = value;
    }

}
