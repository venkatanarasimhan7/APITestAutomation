
package com.elsevier.opsbank2.interfacerunservice.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.opsbank2.interfacerun.v1.InterfaceRunOutput;


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
 *         &lt;element name="interfaceRunOutput" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}InterfaceRunOutput"/&gt;
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
    "interfaceRunOutput"
})
@XmlRootElement(name = "runInterfaceResponse")
public class RunInterfaceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected InterfaceRunOutput interfaceRunOutput;

    /**
     * Gets the value of the interfaceRunOutput property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceRunOutput }
     *     
     */
    public InterfaceRunOutput getInterfaceRunOutput() {
        return interfaceRunOutput;
    }

    /**
     * Sets the value of the interfaceRunOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceRunOutput }
     *     
     */
    public void setInterfaceRunOutput(InterfaceRunOutput value) {
        this.interfaceRunOutput = value;
    }

}
