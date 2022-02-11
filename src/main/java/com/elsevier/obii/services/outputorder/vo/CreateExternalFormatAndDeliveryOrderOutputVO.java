
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for CreateExternalFormatAndDeliveryOrderOutputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateExternalFormatAndDeliveryOrderOutputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalFormatAndDeliveryOrderCreationDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="originalSupplierProcessingOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="supplierProcessingOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateExternalFormatAndDeliveryOrderOutputVO", propOrder = {
    "externalFormatAndDeliveryOrderCreationDate",
    "originalSupplierProcessingOrderId",
    "outputOrderId",
    "supplierProcessingOrderId"
})
public class CreateExternalFormatAndDeliveryOrderOutputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long externalFormatAndDeliveryOrderCreationDate;
    @XmlElement(required = true, nillable = true)
    protected String originalSupplierProcessingOrderId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String supplierProcessingOrderId;

    /**
     * Gets the value of the externalFormatAndDeliveryOrderCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExternalFormatAndDeliveryOrderCreationDate() {
        return externalFormatAndDeliveryOrderCreationDate;
    }

    /**
     * Sets the value of the externalFormatAndDeliveryOrderCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExternalFormatAndDeliveryOrderCreationDate(Long value) {
        this.externalFormatAndDeliveryOrderCreationDate = value;
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
     * Gets the value of the supplierProcessingOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierProcessingOrderId() {
        return supplierProcessingOrderId;
    }

    /**
     * Sets the value of the supplierProcessingOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierProcessingOrderId(String value) {
        this.supplierProcessingOrderId = value;
    }

}
