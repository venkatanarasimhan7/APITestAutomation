
package com.elsevier.opsbank2.interfacerun.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterfaceRunInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceRunInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterfaceID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="InterfaceRunTypeSeqNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InterfaceParameters" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}InterfaceParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceRunInput", propOrder = {
    "interfaceID",
    "interfaceRunTypeSeqNo",
    "interfaceParameters"
})
public class InterfaceRunInput
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InterfaceID")
    protected long interfaceID;
    @XmlElement(name = "InterfaceRunTypeSeqNo")
    protected Long interfaceRunTypeSeqNo;
    @XmlElement(name = "InterfaceParameters")
    protected List<InterfaceParameter> interfaceParameters;

    /**
     * Gets the value of the interfaceID property.
     * 
     */
    public long getInterfaceID() {
        return interfaceID;
    }

    /**
     * Sets the value of the interfaceID property.
     * 
     */
    public void setInterfaceID(long value) {
        this.interfaceID = value;
    }

    /**
     * Gets the value of the interfaceRunTypeSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceRunTypeSeqNo() {
        return interfaceRunTypeSeqNo;
    }

    /**
     * Sets the value of the interfaceRunTypeSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceRunTypeSeqNo(Long value) {
        this.interfaceRunTypeSeqNo = value;
    }

    /**
     * Gets the value of the interfaceParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interfaceParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterfaceParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceParameter }
     * 
     * 
     */
    public List<InterfaceParameter> getInterfaceParameters() {
        if (interfaceParameters == null) {
            interfaceParameters = new ArrayList<InterfaceParameter>();
        }
        return this.interfaceParameters;
    }

}
