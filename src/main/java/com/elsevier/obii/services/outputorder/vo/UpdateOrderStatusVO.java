
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for UpdateOrderStatusVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderStatusVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="statusInProduction" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="statusManagerApproved" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="statusManagerRejected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="statusOpRequesterRejected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="statusOrderCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="statusSubmtdForMgrApproval" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="statusSubmtdForOpReqsterApprvl" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "UpdateOrderStatusVO", propOrder = {
    "outputOrderId",
    "statusInProduction",
    "statusManagerApproved",
    "statusManagerRejected",
    "statusOpRequesterRejected",
    "statusOrderCancelled",
    "statusSubmtdForMgrApproval",
    "statusSubmtdForOpReqsterApprvl",
    "user"
})
public class UpdateOrderStatusVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean statusInProduction;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean statusManagerApproved;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean statusManagerRejected;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean statusOpRequesterRejected;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean statusOrderCancelled;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean statusSubmtdForMgrApproval;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean statusSubmtdForOpReqsterApprvl;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;

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
     * Gets the value of the statusInProduction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusInProduction() {
        return statusInProduction;
    }

    /**
     * Sets the value of the statusInProduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusInProduction(Boolean value) {
        this.statusInProduction = value;
    }

    /**
     * Gets the value of the statusManagerApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusManagerApproved() {
        return statusManagerApproved;
    }

    /**
     * Sets the value of the statusManagerApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusManagerApproved(Boolean value) {
        this.statusManagerApproved = value;
    }

    /**
     * Gets the value of the statusManagerRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusManagerRejected() {
        return statusManagerRejected;
    }

    /**
     * Sets the value of the statusManagerRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusManagerRejected(Boolean value) {
        this.statusManagerRejected = value;
    }

    /**
     * Gets the value of the statusOpRequesterRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusOpRequesterRejected() {
        return statusOpRequesterRejected;
    }

    /**
     * Sets the value of the statusOpRequesterRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusOpRequesterRejected(Boolean value) {
        this.statusOpRequesterRejected = value;
    }

    /**
     * Gets the value of the statusOrderCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusOrderCancelled() {
        return statusOrderCancelled;
    }

    /**
     * Sets the value of the statusOrderCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusOrderCancelled(Boolean value) {
        this.statusOrderCancelled = value;
    }

    /**
     * Gets the value of the statusSubmtdForMgrApproval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusSubmtdForMgrApproval() {
        return statusSubmtdForMgrApproval;
    }

    /**
     * Sets the value of the statusSubmtdForMgrApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusSubmtdForMgrApproval(Boolean value) {
        this.statusSubmtdForMgrApproval = value;
    }

    /**
     * Gets the value of the statusSubmtdForOpReqsterApprvl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatusSubmtdForOpReqsterApprvl() {
        return statusSubmtdForOpReqsterApprvl;
    }

    /**
     * Sets the value of the statusSubmtdForOpReqsterApprvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatusSubmtdForOpReqsterApprvl(Boolean value) {
        this.statusSubmtdForOpReqsterApprvl = value;
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
