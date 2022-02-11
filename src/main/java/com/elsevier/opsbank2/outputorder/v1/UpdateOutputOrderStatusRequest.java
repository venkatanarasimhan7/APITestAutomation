
package com.elsevier.opsbank2.outputorder.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.opsbank2.common.User;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusInProduction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="statusManagerApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="statusManagerRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="statusOpRequesterRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="statusOrderCancelled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="statusSubmtdForMgrApproval" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="statusSubmtdForOpReqsterApprvl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://common.opsbank2.elsevier.com}user" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
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
@XmlRootElement(name = "updateOutputOrderStatusRequest")
public class UpdateOutputOrderStatusRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String outputOrderId;
    protected Boolean statusInProduction;
    protected Boolean statusManagerApproved;
    protected Boolean statusManagerRejected;
    protected Boolean statusOpRequesterRejected;
    protected Boolean statusOrderCancelled;
    protected Boolean statusSubmtdForMgrApproval;
    protected Boolean statusSubmtdForOpReqsterApprvl;
    protected User user;

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
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
