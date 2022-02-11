
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for CustomerDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactPersonList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns2_nillable_ContactPersonVO"/&gt;
 *         &lt;element name="customerDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="emailAddressList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns9_nillable_EmailAddressVO"/&gt;
 *         &lt;element name="ftpAddressList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns9_nillable_FTPAddressVO"/&gt;
 *         &lt;element name="physicalAddressList" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns9_nillable_PhysicalAddressVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDetailsVO", propOrder = {
    "contactPersonList",
    "customerDesc",
    "customerId",
    "customerName",
    "emailAddressList",
    "ftpAddressList",
    "physicalAddressList"
})
public class CustomerDetailsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns2NillableContactPersonVO contactPersonList;
    @XmlElement(required = true, nillable = true)
    protected String customerDesc;
    @XmlElement(required = true, nillable = true)
    protected String customerId;
    @XmlElement(required = true, nillable = true)
    protected String customerName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns9NillableEmailAddressVO emailAddressList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns9NillableFTPAddressVO ftpAddressList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns9NillablePhysicalAddressVO physicalAddressList;

    /**
     * Gets the value of the contactPersonList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableContactPersonVO }
     *     
     */
    public ArrayOfTns2NillableContactPersonVO getContactPersonList() {
        return contactPersonList;
    }

    /**
     * Sets the value of the contactPersonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableContactPersonVO }
     *     
     */
    public void setContactPersonList(ArrayOfTns2NillableContactPersonVO value) {
        this.contactPersonList = value;
    }

    /**
     * Gets the value of the customerDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDesc() {
        return customerDesc;
    }

    /**
     * Sets the value of the customerDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDesc(String value) {
        this.customerDesc = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the emailAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns9NillableEmailAddressVO }
     *     
     */
    public ArrayOfTns9NillableEmailAddressVO getEmailAddressList() {
        return emailAddressList;
    }

    /**
     * Sets the value of the emailAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns9NillableEmailAddressVO }
     *     
     */
    public void setEmailAddressList(ArrayOfTns9NillableEmailAddressVO value) {
        this.emailAddressList = value;
    }

    /**
     * Gets the value of the ftpAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns9NillableFTPAddressVO }
     *     
     */
    public ArrayOfTns9NillableFTPAddressVO getFtpAddressList() {
        return ftpAddressList;
    }

    /**
     * Sets the value of the ftpAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns9NillableFTPAddressVO }
     *     
     */
    public void setFtpAddressList(ArrayOfTns9NillableFTPAddressVO value) {
        this.ftpAddressList = value;
    }

    /**
     * Gets the value of the physicalAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns9NillablePhysicalAddressVO }
     *     
     */
    public ArrayOfTns9NillablePhysicalAddressVO getPhysicalAddressList() {
        return physicalAddressList;
    }

    /**
     * Sets the value of the physicalAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns9NillablePhysicalAddressVO }
     *     
     */
    public void setPhysicalAddressList(ArrayOfTns9NillablePhysicalAddressVO value) {
        this.physicalAddressList = value;
    }

}
