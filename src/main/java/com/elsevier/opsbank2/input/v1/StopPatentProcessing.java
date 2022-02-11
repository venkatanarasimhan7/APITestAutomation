
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopPatentProcessing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPatentProcessing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stopPatentFamilyInfo" type="{http://www.elsevier.com/opsbank2/input/v1}stopPatentFamilyInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPatentProcessing", propOrder = {
    "stopPatentFamilyInfo"
})
public class StopPatentProcessing
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected StopPatentFamilyInfo stopPatentFamilyInfo;

    /**
     * Gets the value of the stopPatentFamilyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StopPatentFamilyInfo }
     *     
     */
    public StopPatentFamilyInfo getStopPatentFamilyInfo() {
        return stopPatentFamilyInfo;
    }

    /**
     * Sets the value of the stopPatentFamilyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPatentFamilyInfo }
     *     
     */
    public void setStopPatentFamilyInfo(StopPatentFamilyInfo value) {
        this.stopPatentFamilyInfo = value;
    }

}
