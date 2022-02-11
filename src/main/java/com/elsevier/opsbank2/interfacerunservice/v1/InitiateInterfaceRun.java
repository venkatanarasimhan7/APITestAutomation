
package com.elsevier.opsbank2.interfacerunservice.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="initiateInterfaceRun" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}InitiateInterfaceRun"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "initiateInterfaceRun"
})
@XmlRootElement(name = "initiateInterfaceRun")
public class InitiateInterfaceRun
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected com.elsevier.opsbank2.interfacerun.v1.InitiateInterfaceRun initiateInterfaceRun;

    /**
     * Gets the value of the initiateInterfaceRun property.
     * 
     * @return
     *     possible object is
     *     {@link com.elsevier.opsbank2.interfacerun.v1.InitiateInterfaceRun }
     *     
     */
    public com.elsevier.opsbank2.interfacerun.v1.InitiateInterfaceRun getInitiateInterfaceRun() {
        return initiateInterfaceRun;
    }

    /**
     * Sets the value of the initiateInterfaceRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.elsevier.opsbank2.interfacerun.v1.InitiateInterfaceRun }
     *     
     */
    public void setInitiateInterfaceRun(com.elsevier.opsbank2.interfacerun.v1.InitiateInterfaceRun value) {
        this.initiateInterfaceRun = value;
    }

}
