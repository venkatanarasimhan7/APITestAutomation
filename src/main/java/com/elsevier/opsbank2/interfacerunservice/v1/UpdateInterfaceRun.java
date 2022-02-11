
package com.elsevier.opsbank2.interfacerunservice.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.opsbank2.interfacerun.v1.InterfaceRuns;


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
 *         &lt;element name="interfaceRun" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}InterfaceRuns"/&gt;
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
    "interfaceRun"
})
@XmlRootElement(name = "updateInterfaceRun")
public class UpdateInterfaceRun
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected InterfaceRuns interfaceRun;

    /**
     * Gets the value of the interfaceRun property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceRuns }
     *     
     */
    public InterfaceRuns getInterfaceRun() {
        return interfaceRun;
    }

    /**
     * Sets the value of the interfaceRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceRuns }
     *     
     */
    public void setInterfaceRun(InterfaceRuns value) {
        this.interfaceRun = value;
    }

}
