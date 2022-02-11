
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for OutputOrderFinalizationInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputOrderFinalizationInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderStartdate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputRequestorApprovalInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="outputRequestorRemarks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rejctnReasnRequstDetChngeReqd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rejctnReasnStartDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rejectionReasonDataMismatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "OutputOrderFinalizationInputVO", propOrder = {
    "orderStartdate",
    "outputOrderId",
    "outputRequestorApprovalInd",
    "outputRequestorRemarks",
    "rejctnReasnRequstDetChngeReqd",
    "rejctnReasnStartDate",
    "rejectionReasonDataMismatch",
    "user"
})
public class OutputOrderFinalizationInputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String orderStartdate;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean outputRequestorApprovalInd;
    @XmlElement(required = true, nillable = true)
    protected String outputRequestorRemarks;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean rejctnReasnRequstDetChngeReqd;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean rejctnReasnStartDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean rejectionReasonDataMismatch;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;

    /**
     * Gets the value of the orderStartdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStartdate() {
        return orderStartdate;
    }

    /**
     * Sets the value of the orderStartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStartdate(String value) {
        this.orderStartdate = value;
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
     * Gets the value of the outputRequestorApprovalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutputRequestorApprovalInd() {
        return outputRequestorApprovalInd;
    }

    /**
     * Sets the value of the outputRequestorApprovalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutputRequestorApprovalInd(Boolean value) {
        this.outputRequestorApprovalInd = value;
    }

    /**
     * Gets the value of the outputRequestorRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputRequestorRemarks() {
        return outputRequestorRemarks;
    }

    /**
     * Sets the value of the outputRequestorRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputRequestorRemarks(String value) {
        this.outputRequestorRemarks = value;
    }

    /**
     * Gets the value of the rejctnReasnRequstDetChngeReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejctnReasnRequstDetChngeReqd() {
        return rejctnReasnRequstDetChngeReqd;
    }

    /**
     * Sets the value of the rejctnReasnRequstDetChngeReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRejctnReasnRequstDetChngeReqd(Boolean value) {
        this.rejctnReasnRequstDetChngeReqd = value;
    }

    /**
     * Gets the value of the rejctnReasnStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejctnReasnStartDate() {
        return rejctnReasnStartDate;
    }

    /**
     * Sets the value of the rejctnReasnStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRejctnReasnStartDate(Boolean value) {
        this.rejctnReasnStartDate = value;
    }

    /**
     * Gets the value of the rejectionReasonDataMismatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRejectionReasonDataMismatch() {
        return rejectionReasonDataMismatch;
    }

    /**
     * Sets the value of the rejectionReasonDataMismatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRejectionReasonDataMismatch(Boolean value) {
        this.rejectionReasonDataMismatch = value;
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
