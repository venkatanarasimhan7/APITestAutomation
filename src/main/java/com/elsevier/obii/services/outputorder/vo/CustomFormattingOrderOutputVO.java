
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for CustomFormattingOrderOutputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFormattingOrderOutputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customFormattingOrderCreationDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="customFormattingOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parentCustFmtOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFormattingOrderOutputVO", propOrder = {
    "customFormattingOrderCreationDate",
    "customFormattingOrderId",
    "outputOrderId",
    "parentCustFmtOrderId"
})
public class CustomFormattingOrderOutputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long customFormattingOrderCreationDate;
    @XmlElement(required = true, nillable = true)
    protected String customFormattingOrderId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String parentCustFmtOrderId;

    /**
     * Gets the value of the customFormattingOrderCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomFormattingOrderCreationDate() {
        return customFormattingOrderCreationDate;
    }

    /**
     * Sets the value of the customFormattingOrderCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomFormattingOrderCreationDate(Long value) {
        this.customFormattingOrderCreationDate = value;
    }

    /**
     * Gets the value of the customFormattingOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomFormattingOrderId() {
        return customFormattingOrderId;
    }

    /**
     * Sets the value of the customFormattingOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomFormattingOrderId(String value) {
        this.customFormattingOrderId = value;
    }

    /**
     * Gets the value of the outputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderId() {
        return outputOrderId;
    }

    /**
     * Sets the value of the outputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderId(String value) {
        this.outputOrderId = value;
    }

    /**
     * Gets the value of the parentCustFmtOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCustFmtOrderId() {
        return parentCustFmtOrderId;
    }

    /**
     * Sets the value of the parentCustFmtOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCustFmtOrderId(String value) {
        this.parentCustFmtOrderId = value;
    }

}
