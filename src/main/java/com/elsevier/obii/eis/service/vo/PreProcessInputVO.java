
package com.elsevier.obii.eis.service.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.eis.service.ArrayOfXsdNillableLong;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for PreProcessInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreProcessInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carIds" type="{http://service.eis.obii.elsevier.com}ArrayOf_xsd_nillable_long" minOccurs="0"/&gt;
 *         &lt;element name="outputDeliveryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="outputResultSetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="supplierOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://vo.obii.elsevier.com}UserVO" minOccurs="0"/&gt;
 *         &lt;element name="runSequncNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreProcessInputVO", propOrder = {
    "carIds",
    "outputDeliveryId",
    "outputOrderId",
    "outputResultSetId",
    "parentOrderId",
    "supplierOrderId",
    "user",
    "runSequncNumber",
    "interfaceId"
})
public class PreProcessInputVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ArrayOfXsdNillableLong carIds;
    protected Long outputDeliveryId;
    protected Long outputOrderId;
    protected String outputResultSetId;
    protected Long parentOrderId;
    protected Long supplierOrderId;
    protected UserVO user;
    protected Long runSequncNumber;
    protected Long interfaceId;

    /**
     * Gets the value of the carIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableLong }
     *     
     */
    public ArrayOfXsdNillableLong getCarIds() {
        return carIds;
    }

    /**
     * Sets the value of the carIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableLong }
     *     
     */
    public void setCarIds(ArrayOfXsdNillableLong value) {
        this.carIds = value;
    }

    /**
     * Gets the value of the outputDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutputDeliveryId() {
        return outputDeliveryId;
    }

    /**
     * Sets the value of the outputDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutputDeliveryId(Long value) {
        this.outputDeliveryId = value;
    }

    /**
     * Gets the value of the outputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutputOrderId() {
        return outputOrderId;
    }

    /**
     * Sets the value of the outputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutputOrderId(Long value) {
        this.outputOrderId = value;
    }

    /**
     * Gets the value of the outputResultSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputResultSetId() {
        return outputResultSetId;
    }

    /**
     * Sets the value of the outputResultSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputResultSetId(String value) {
        this.outputResultSetId = value;
    }

    /**
     * Gets the value of the parentOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentOrderId() {
        return parentOrderId;
    }

    /**
     * Sets the value of the parentOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentOrderId(Long value) {
        this.parentOrderId = value;
    }

    /**
     * Gets the value of the supplierOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplierOrderId() {
        return supplierOrderId;
    }

    /**
     * Sets the value of the supplierOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplierOrderId(Long value) {
        this.supplierOrderId = value;
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

    /**
     * Gets the value of the runSequncNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRunSequncNumber() {
        return runSequncNumber;
    }

    /**
     * Sets the value of the runSequncNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRunSequncNumber(Long value) {
        this.runSequncNumber = value;
    }

    /**
     * Gets the value of the interfaceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceId() {
        return interfaceId;
    }

    /**
     * Sets the value of the interfaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceId(Long value) {
        this.interfaceId = value;
    }

}
