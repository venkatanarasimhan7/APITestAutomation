
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for OutputChangeRequestDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputChangeRequestDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outputRequestDetails" type="{http://vo.outputorder.services.obii.elsevier.com}OutputRequestDetailsVO"/&gt;
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
@XmlType(name = "OutputChangeRequestDetailsVO", propOrder = {
    "outputRequestDetails",
    "parentOutputOrderId"
})
public class OutputChangeRequestDetailsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected OutputRequestDetailsVO outputRequestDetails;
    @XmlElement(required = true, nillable = true)
    protected String parentOutputOrderId;

    /**
     * Gets the value of the outputRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OutputRequestDetailsVO }
     *     
     */
    public OutputRequestDetailsVO getOutputRequestDetails() {
        return outputRequestDetails;
    }

    /**
     * Sets the value of the outputRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputRequestDetailsVO }
     *     
     */
    public void setOutputRequestDetails(OutputRequestDetailsVO value) {
        this.outputRequestDetails = value;
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
