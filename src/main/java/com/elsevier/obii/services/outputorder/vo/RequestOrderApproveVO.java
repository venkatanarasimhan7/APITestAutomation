
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for RequestOrderApproveVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestOrderApproveVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="approvalInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="requestOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="remarksOnApproval" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "RequestOrderApproveVO", propOrder = {
    "approvalInd",
    "requestOrderId",
    "remarksOnApproval",
    "user"
})
public class RequestOrderApproveVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean approvalInd;
    @XmlElement(required = true, nillable = true)
    protected String requestOrderId;
    @XmlElement(required = true, nillable = true)
    protected String remarksOnApproval;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;

    /**
     * Gets the value of the approvalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApprovalInd() {
        return approvalInd;
    }

    /**
     * Sets the value of the approvalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApprovalInd(Boolean value) {
        this.approvalInd = value;
    }

    /**
     * Gets the value of the requestOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestOrderId() {
        return requestOrderId;
    }

    /**
     * Sets the value of the requestOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestOrderId(String value) {
        this.requestOrderId = value;
    }

    /**
     * Gets the value of the remarksOnApproval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksOnApproval() {
        return remarksOnApproval;
    }

    /**
     * Sets the value of the remarksOnApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksOnApproval(String value) {
        this.remarksOnApproval = value;
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
