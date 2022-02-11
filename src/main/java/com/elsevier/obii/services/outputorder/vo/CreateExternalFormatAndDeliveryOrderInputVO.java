
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for CreateExternalFormatAndDeliveryOrderInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateExternalFormatAndDeliveryOrderInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custFormatAndExtDelOrderDueDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="custFormatAndExtDelOrderRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originalSupplierProcessingOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputDeliveryId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="supplierId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "CreateExternalFormatAndDeliveryOrderInputVO", propOrder = {
    "custFormatAndExtDelOrderDueDate",
    "custFormatAndExtDelOrderRef",
    "originalSupplierProcessingOrderId",
    "outputDeliveryId",
    "outputOrderId",
    "supplierId",
    "user"
})
public class CreateExternalFormatAndDeliveryOrderInputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long custFormatAndExtDelOrderDueDate;
    @XmlElement(required = true, nillable = true)
    protected String custFormatAndExtDelOrderRef;
    @XmlElement(required = true, nillable = true)
    protected String originalSupplierProcessingOrderId;
    @XmlElement(required = true, nillable = true)
    protected String outputDeliveryId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String supplierId;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;

    /**
     * Gets the value of the custFormatAndExtDelOrderDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustFormatAndExtDelOrderDueDate() {
        return custFormatAndExtDelOrderDueDate;
    }

    /**
     * Sets the value of the custFormatAndExtDelOrderDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustFormatAndExtDelOrderDueDate(Long value) {
        this.custFormatAndExtDelOrderDueDate = value;
    }

    /**
     * Gets the value of the custFormatAndExtDelOrderRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustFormatAndExtDelOrderRef() {
        return custFormatAndExtDelOrderRef;
    }

    /**
     * Sets the value of the custFormatAndExtDelOrderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustFormatAndExtDelOrderRef(String value) {
        this.custFormatAndExtDelOrderRef = value;
    }

    /**
     * Gets the value of the originalSupplierProcessingOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalSupplierProcessingOrderId() {
        return originalSupplierProcessingOrderId;
    }

    /**
     * Sets the value of the originalSupplierProcessingOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalSupplierProcessingOrderId(String value) {
        this.originalSupplierProcessingOrderId = value;
    }

    /**
     * Gets the value of the outputDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDeliveryId() {
        return outputDeliveryId;
    }

    /**
     * Sets the value of the outputDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDeliveryId(String value) {
        this.outputDeliveryId = value;
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
     * Gets the value of the supplierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierId(String value) {
        this.supplierId = value;
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
