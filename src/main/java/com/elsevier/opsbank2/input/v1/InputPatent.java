
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputPatent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputPatent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SearchResult" type="{http://www.elsevier.com/opsbank2/input/v1}PatentFamilyEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReplyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationInfo" type="{http://www.elsevier.com/opsbank2/input/v1}OperationInfo" minOccurs="0"/&gt;
 *         &lt;element name="OrderState" type="{http://www.elsevier.com/opsbank2/input/v1}OrderState" minOccurs="0"/&gt;
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputPatent", propOrder = {
    "resultCount",
    "searchResult",
    "replyStatus",
    "operationInfo",
    "orderState",
    "userid"
})
public class InputPatent
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ResultCount")
    protected Integer resultCount;
    @XmlElement(name = "SearchResult")
    protected List<PatentFamilyEntry> searchResult;
    @XmlElement(name = "ReplyStatus")
    protected String replyStatus;
    @XmlElement(name = "OperationInfo")
    protected OperationInfo operationInfo;
    @XmlElement(name = "OrderState")
    protected OrderState orderState;
    protected Long userid;

    /**
     * Gets the value of the resultCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultCount(Integer value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the searchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatentFamilyEntry }
     * 
     * 
     */
    public List<PatentFamilyEntry> getSearchResult() {
        if (searchResult == null) {
            searchResult = new ArrayList<PatentFamilyEntry>();
        }
        return this.searchResult;
    }

    /**
     * Gets the value of the replyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyStatus() {
        return replyStatus;
    }

    /**
     * Sets the value of the replyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyStatus(String value) {
        this.replyStatus = value;
    }

    /**
     * Gets the value of the operationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperationInfo }
     *     
     */
    public OperationInfo getOperationInfo() {
        return operationInfo;
    }

    /**
     * Sets the value of the operationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationInfo }
     *     
     */
    public void setOperationInfo(OperationInfo value) {
        this.operationInfo = value;
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
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserid(Long value) {
        this.userid = value;
    }

}
