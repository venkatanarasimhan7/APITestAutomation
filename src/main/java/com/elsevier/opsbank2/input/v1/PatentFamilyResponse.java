
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patentFamilyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patentFamilyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorrelationInfo" type="{http://www.elsevier.com/opsbank2/input/v1}CorrelationInfo" minOccurs="0"/&gt;
 *         &lt;element name="retrievePatentFamilyVO" type="{http://www.elsevier.com/opsbank2/input/v1}retrievePatentFamilyVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderState" type="{http://www.elsevier.com/opsbank2/input/v1}OrderState" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patentFamilyResponse", propOrder = {
    "correlationInfo",
    "retrievePatentFamilyVO",
    "orderState",
    "userId"
})
public class PatentFamilyResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CorrelationInfo")
    protected CorrelationInfo correlationInfo;
    protected List<RetrievePatentFamilyVO> retrievePatentFamilyVO;
    @XmlElement(name = "OrderState")
    protected OrderState orderState;
    protected Long userId;

    /**
     * Gets the value of the correlationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationInfo }
     *     
     */
    public CorrelationInfo getCorrelationInfo() {
        return correlationInfo;
    }

    /**
     * Sets the value of the correlationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationInfo }
     *     
     */
    public void setCorrelationInfo(CorrelationInfo value) {
        this.correlationInfo = value;
    }

    /**
     * Gets the value of the retrievePatentFamilyVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retrievePatentFamilyVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetrievePatentFamilyVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrievePatentFamilyVO }
     * 
     * 
     */
    public List<RetrievePatentFamilyVO> getRetrievePatentFamilyVO() {
        if (retrievePatentFamilyVO == null) {
            retrievePatentFamilyVO = new ArrayList<RetrievePatentFamilyVO>();
        }
        return this.retrievePatentFamilyVO;
    }

    /**
     * Gets the value of the orderState property.
     * 
     * @return
     *     possible object is
     *     {@link OrderState }
     *     
     */
    public OrderState getOrderState() {
        return orderState;
    }

    /**
     * Sets the value of the orderState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderState }
     *     
     */
    public void setOrderState(OrderState value) {
        this.orderState = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

}
