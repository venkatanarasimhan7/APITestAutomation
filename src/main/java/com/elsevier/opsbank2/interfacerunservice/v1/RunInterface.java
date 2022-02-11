
package com.elsevier.opsbank2.interfacerunservice.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.opsbank2.interfacerun.v1.InterfaceRunInput;


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
 *         &lt;element name="interfaceRunInput" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}InterfaceRunInput"/&gt;
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
    "interfaceRunInput"
})
@XmlRootElement(name = "runInterface")
public class RunInterface
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected InterfaceRunInput interfaceRunInput;

    /**
     * Gets the value of the interfaceRunInput property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceRunInput }
     *     
     */
    public InterfaceRunInput getInterfaceRunInput() {
        return interfaceRunInput;
    }

    /**
     * Sets the value of the interfaceRunInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceRunInput }
     *     
     */
    public void setInterfaceRunInput(InterfaceRunInput value) {
        this.interfaceRunInput = value;
    }

}
