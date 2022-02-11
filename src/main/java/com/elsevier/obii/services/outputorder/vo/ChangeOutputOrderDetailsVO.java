
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for ChangeOutputOrderDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOutputOrderDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outputOrderDetails" type="{http://vo.outputorder.services.obii.elsevier.com}OutputOrderDetailsVO"/&gt;
 *         &lt;element name="parentOutputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeOutputOrderDetailsVO", propOrder = {
    "outputOrderDetails",
    "parentOutputOrderId"
})
public class ChangeOutputOrderDetailsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected OutputOrderDetailsVO outputOrderDetails;
    @XmlElement(required = true, nillable = true)
    protected String parentOutputOrderId;

    /**
     * Gets the value of the outputOrderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOrderDetailsVO }
     *     
     */
    public OutputOrderDetailsVO getOutputOrderDetails() {
        return outputOrderDetails;
    }

    /**
     * Sets the value of the outputOrderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOrderDetailsVO }
     *     
     */
    public void setOutputOrderDetails(OutputOrderDetailsVO value) {
        this.outputOrderDetails = value;
    }

    /**
     * Gets the value of the parentOutputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOutputOrderId() {
        return parentOutputOrderId;
    }

    /**
     * Sets the value of the parentOutputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOutputOrderId(String value) {
        this.parentOutputOrderId = value;
    }

}
