
package com.elsevier.opsbank2.output.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.outputorder.vo.OutputOrderDeliveryInfoVO;
import com.elsevier.obii.vo.IntegrationServiceResponse;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}integrationServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userDetails" type="{http://vo.obii.elsevier.com}UserVO" minOccurs="0"/&gt;
 *         &lt;element name="orderInfo" type="{http://vo.outputorder.services.obii.elsevier.com}OutputOrderDeliveryInfoVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userDetails",
    "orderInfo"
})
@XmlRootElement(name = "getUserAndOrderInfoResponse")
public class GetUserAndOrderInfoResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected UserVO userDetails;
    protected OutputOrderDeliveryInfoVO orderInfo;

    /**
     * Gets the value of the userDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getUserDetails() {
        return userDetails;
    }

    /**
     * Sets the value of the userDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setUserDetails(UserVO value) {
        this.userDetails = value;
    }

    /**
     * Gets the value of the orderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOrderDeliveryInfoVO }
     *     
     */
    public OutputOrderDeliveryInfoVO getOrderInfo() {
        return orderInfo;
    }

    /**
     * Sets the value of the orderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOrderDeliveryInfoVO }
     *     
     */
    public void setOrderInfo(OutputOrderDeliveryInfoVO value) {
        this.orderInfo = value;
    }

}
