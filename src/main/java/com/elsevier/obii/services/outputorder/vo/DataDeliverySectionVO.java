
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for DataDeliverySectionVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataDeliverySectionVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataDeliveryDetails" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_OutputDeliveryDetailsVO"/&gt;
 *         &lt;element name="parentOrderDeliveryDetails" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_OutputDeliveryDetailsVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataDeliverySectionVO", propOrder = {
    "dataDeliveryDetails",
    "parentOrderDeliveryDetails"
})
public class DataDeliverySectionVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableOutputDeliveryDetailsVO dataDeliveryDetails;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableOutputDeliveryDetailsVO parentOrderDeliveryDetails;

    /**
     * Gets the value of the dataDeliveryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableOutputDeliveryDetailsVO }
     *     
     */
    public ArrayOfTns2NillableOutputDeliveryDetailsVO getDataDeliveryDetails() {
        return dataDeliveryDetails;
    }

    /**
     * Sets the value of the dataDeliveryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableOutputDeliveryDetailsVO }
     *     
     */
    public void setDataDeliveryDetails(ArrayOfTns2NillableOutputDeliveryDetailsVO value) {
        this.dataDeliveryDetails = value;
    }

    /**
     * Gets the value of the parentOrderDeliveryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableOutputDeliveryDetailsVO }
     *     
     */
    public ArrayOfTns2NillableOutputDeliveryDetailsVO getParentOrderDeliveryDetails() {
        return parentOrderDeliveryDetails;
    }

    /**
     * Sets the value of the parentOrderDeliveryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableOutputDeliveryDetailsVO }
     *     
     */
    public void setParentOrderDeliveryDetails(ArrayOfTns2NillableOutputDeliveryDetailsVO value) {
        this.parentOrderDeliveryDetails = value;
    }

}
