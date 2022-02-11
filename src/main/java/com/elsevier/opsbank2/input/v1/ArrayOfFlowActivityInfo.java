
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFlowActivityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFlowActivityInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlowActivityInfo" type="{http://www.elsevier.com/opsbank2/input/v1}FlowActivityInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFlowActivityInfo", propOrder = {
    "flowActivityInfo"
})
public class ArrayOfFlowActivityInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FlowActivityInfo")
    protected List<FlowActivityInfo> flowActivityInfo;

    /**
     * Gets the value of the flowActivityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowActivityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowActivityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowActivityInfo }
     * 
     * 
     */
    public List<FlowActivityInfo> getFlowActivityInfo() {
        if (flowActivityInfo == null) {
            flowActivityInfo = new ArrayList<FlowActivityInfo>();
        }
        return this.flowActivityInfo;
    }

}
