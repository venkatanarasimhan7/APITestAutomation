
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for OutputIndexVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputIndexVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outputIndexDeliveryDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputIndexDeliveryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputIndexDeliveryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputIndexVO", propOrder = {
    "outputIndexDeliveryDesc",
    "outputIndexDeliveryId",
    "outputIndexDeliveryName"
})
public class OutputIndexVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String outputIndexDeliveryDesc;
    @XmlElement(required = true, nillable = true)
    protected String outputIndexDeliveryId;
    @XmlElement(required = true, nillable = true)
    protected String outputIndexDeliveryName;

    /**
     * Gets the value of the outputIndexDeliveryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputIndexDeliveryDesc() {
        return outputIndexDeliveryDesc;
    }

    /**
     * Sets the value of the outputIndexDeliveryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputIndexDeliveryDesc(String value) {
        this.outputIndexDeliveryDesc = value;
    }

    /**
     * Gets the value of the outputIndexDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputIndexDeliveryId() {
        return outputIndexDeliveryId;
    }

    /**
     * Sets the value of the outputIndexDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputIndexDeliveryId(String value) {
        this.outputIndexDeliveryId = value;
    }

    /**
     * Gets the value of the outputIndexDeliveryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputIndexDeliveryName() {
        return outputIndexDeliveryName;
    }

    /**
     * Sets the value of the outputIndexDeliveryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputIndexDeliveryName(String value) {
        this.outputIndexDeliveryName = value;
    }

}
