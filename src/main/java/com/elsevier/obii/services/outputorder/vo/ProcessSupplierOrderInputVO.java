
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for ProcessSupplierOrderInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessSupplierOrderInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="supplierOrderCompletionInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="supplierProcessingOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *         &lt;element name="supplierOrderRemarks" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessSupplierOrderInputVO", propOrder = {
    "outputOrderId",
    "supplierOrderCompletionInd",
    "supplierProcessingOrderId",
    "user",
    "supplierOrderRemarks"
})
public class ProcessSupplierOrderInputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean supplierOrderCompletionInd;
    @XmlElement(required = true, nillable = true)
    protected String supplierProcessingOrderId;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString supplierOrderRemarks;

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
     * Gets the value of the supplierOrderCompletionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplierOrderCompletionInd() {
        return supplierOrderCompletionInd;
    }

    /**
     * Sets the value of the supplierOrderCompletionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplierOrderCompletionInd(Boolean value) {
        this.supplierOrderCompletionInd = value;
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
     * Gets the value of the supplierOrderRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getSupplierOrderRemarks() {
        return supplierOrderRemarks;
    }

    /**
     * Sets the value of the supplierOrderRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setSupplierOrderRemarks(ArrayOfXsdNillableString value) {
        this.supplierOrderRemarks = value;
    }

}
