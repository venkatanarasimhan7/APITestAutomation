
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for CreateExternalDeliveryOrderInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateExternalDeliveryOrderInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extDelOrderDueDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="extDelOrderRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "CreateExternalDeliveryOrderInputVO", propOrder = {
    "extDelOrderDueDate",
    "extDelOrderRef",
    "originalSupplierProcessingOrderId",
    "outputDeliveryId",
    "outputOrderId",
    "supplierId",
    "user"
})
public class CreateExternalDeliveryOrderInputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long extDelOrderDueDate;
    @XmlElement(required = true, nillable = true)
    protected String extDelOrderRef;
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
     * Gets the value of the extDelOrderDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtDelOrderDueDate() {
        return extDelOrderDueDate;
    }

    /**
     * Sets the value of the extDelOrderDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtDelOrderDueDate(Long value) {
        this.extDelOrderDueDate = value;
    }

    /**
     * Gets the value of the extDelOrderRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtDelOrderRef() {
        return extDelOrderRef;
    }

    /**
     * Sets the value of the extDelOrderRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtDelOrderRef(String value) {
        this.extDelOrderRef = value;
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
