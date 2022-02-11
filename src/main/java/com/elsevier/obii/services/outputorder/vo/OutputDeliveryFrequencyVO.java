
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for OutputDeliveryFrequencyVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputDeliveryFrequencyVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incrementalDeliveryReqdInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="outputDeliveryReqdFrequency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderTypeClId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productionEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productionStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputDeliveryFrequencyVO", propOrder = {
    "incrementalDeliveryReqdInd",
    "outputDeliveryReqdFrequency",
    "outputOrderId",
    "outputOrderTypeClId",
    "productionEndDate",
    "productionStartDate",
    "user"
})
public class OutputDeliveryFrequencyVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean incrementalDeliveryReqdInd;
    @XmlElement(required = true, nillable = true)
    protected String outputDeliveryReqdFrequency;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderTypeClId;
    @XmlElement(required = true, nillable = true)
    protected String productionEndDate;
    @XmlElement(required = true, nillable = true)
    protected String productionStartDate;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;

    /**
     * Gets the value of the incrementalDeliveryReqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncrementalDeliveryReqdInd() {
        return incrementalDeliveryReqdInd;
    }

    /**
     * Sets the value of the incrementalDeliveryReqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncrementalDeliveryReqdInd(Boolean value) {
        this.incrementalDeliveryReqdInd = value;
    }

    /**
     * Gets the value of the outputDeliveryReqdFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDeliveryReqdFrequency() {
        return outputDeliveryReqdFrequency;
    }

    /**
     * Sets the value of the outputDeliveryReqdFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDeliveryReqdFrequency(String value) {
        this.outputDeliveryReqdFrequency = value;
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
     * Gets the value of the outputOrderTypeClId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderTypeClId() {
        return outputOrderTypeClId;
    }

    /**
     * Sets the value of the outputOrderTypeClId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderTypeClId(String value) {
        this.outputOrderTypeClId = value;
    }

    /**
     * Gets the value of the productionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionEndDate() {
        return productionEndDate;
    }

    /**
     * Sets the value of the productionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionEndDate(String value) {
        this.productionEndDate = value;
    }

    /**
     * Gets the value of the productionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionStartDate() {
        return productionStartDate;
    }

    /**
     * Sets the value of the productionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionStartDate(String value) {
        this.productionStartDate = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setUser(UserVO value) {
        this.user = value;
    }

}
