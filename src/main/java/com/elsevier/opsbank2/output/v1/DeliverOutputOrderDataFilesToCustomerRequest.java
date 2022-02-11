
package com.elsevier.opsbank2.output.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.utility.vo.OutputOrderDeliveryDataVO;


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
 *         &lt;element name="outputOrderDeliveryDataVO" type="{http://vo.utility.services.obii.elsevier.com}OutputOrderDeliveryDataVO"/&gt;
 *         &lt;element name="isSampleDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "outputOrderDeliveryDataVO",
    "isSampleDelivery"
})
@XmlRootElement(name = "deliverOutputOrderDataFilesToCustomerRequest")
public class DeliverOutputOrderDataFilesToCustomerRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected OutputOrderDeliveryDataVO outputOrderDeliveryDataVO;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isSampleDelivery;

    /**
     * Gets the value of the outputOrderDeliveryDataVO property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOrderDeliveryDataVO }
     *     
     */
    public OutputOrderDeliveryDataVO getOutputOrderDeliveryDataVO() {
        return outputOrderDeliveryDataVO;
    }

    /**
     * Sets the value of the outputOrderDeliveryDataVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOrderDeliveryDataVO }
     *     
     */
    public void setOutputOrderDeliveryDataVO(OutputOrderDeliveryDataVO value) {
        this.outputOrderDeliveryDataVO = value;
    }

    /**
     * Gets the value of the isSampleDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSampleDelivery() {
        return isSampleDelivery;
    }

    /**
     * Sets the value of the isSampleDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSampleDelivery(Boolean value) {
        this.isSampleDelivery = value;
    }

}
