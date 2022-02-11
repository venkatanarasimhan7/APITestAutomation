
package com.elsevier.obii.eis.service.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for PostProcessInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostProcessInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isFullArtePrsnt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allFileDetails" type="{http://vo.service.eis.obii.elsevier.com}ArrayOfCreatedFileDetailsVO" minOccurs="0"/&gt;
 *         &lt;element name="outputDeliveryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="parentOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="totalNoOfCarsProcessed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="outputResultsetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://vo.obii.elsevier.com}UserVO" minOccurs="0"/&gt;
 *         &lt;element name="indexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deliverySeq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="correlationId" type="{http://vo.service.eis.obii.elsevier.com}NameValuePairVO" minOccurs="0"/&gt;
 *         &lt;element name="runSequenecNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="supplierOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="attachmentTypes" type="{http://vo.service.eis.obii.elsevier.com}ArrayOf_438060916_nillable_long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostProcessInputVO", propOrder = {
    "isFullArtePrsnt",
    "allFileDetails",
    "outputDeliveryId",
    "outputOrderId",
    "parentOrderId",
    "totalNoOfCarsProcessed",
    "outputResultsetId",
    "user",
    "indexName",
    "deliverySeq",
    "correlationId",
    "runSequenecNumber",
    "interfaceId",
    "supplierOrderId",
    "attachmentTypes"
})
public class PostProcessInputVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean isFullArtePrsnt;
    protected ArrayOfCreatedFileDetailsVO allFileDetails;
    protected Long outputDeliveryId;
    protected Long outputOrderId;
    protected Long parentOrderId;
    protected Long totalNoOfCarsProcessed;
    protected Long outputResultsetId;
    protected UserVO user;
    protected String indexName;
    protected Long deliverySeq;
    protected NameValuePairVO correlationId;
    protected Long runSequenecNumber;
    protected Long interfaceId;
    protected Long supplierOrderId;
    protected ArrayOf438060916NillableLong attachmentTypes;

    /**
     * Gets the value of the isFullArtePrsnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFullArtePrsnt() {
        return isFullArtePrsnt;
    }

    /**
     * Sets the value of the isFullArtePrsnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFullArtePrsnt(Boolean value) {
        this.isFullArtePrsnt = value;
    }

    /**
     * Gets the value of the allFileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreatedFileDetailsVO }
     *     
     */
    public ArrayOfCreatedFileDetailsVO getAllFileDetails() {
        return allFileDetails;
    }

    /**
     * Sets the value of the allFileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreatedFileDetailsVO }
     *     
     */
    public void setAllFileDetails(ArrayOfCreatedFileDetailsVO value) {
        this.allFileDetails = value;
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
     * Gets the value of the totalNoOfCarsProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNoOfCarsProcessed() {
        return totalNoOfCarsProcessed;
    }

    /**
     * Sets the value of the totalNoOfCarsProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNoOfCarsProcessed(Long value) {
        this.totalNoOfCarsProcessed = value;
    }

    /**
     * Gets the value of the outputResultsetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutputResultsetId() {
        return outputResultsetId;
    }

    /**
     * Sets the value of the outputResultsetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutputResultsetId(Long value) {
        this.outputResultsetId = value;
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
     * Gets the value of the indexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * Sets the value of the indexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexName(String value) {
        this.indexName = value;
    }

    /**
     * Gets the value of the deliverySeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliverySeq() {
        return deliverySeq;
    }

    /**
     * Sets the value of the deliverySeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliverySeq(Long value) {
        this.deliverySeq = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link NameValuePairVO }
     *     
     */
    public NameValuePairVO getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValuePairVO }
     *     
     */
    public void setCorrelationId(NameValuePairVO value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the runSequenecNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRunSequenecNumber() {
        return runSequenecNumber;
    }

    /**
     * Sets the value of the runSequenecNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRunSequenecNumber(Long value) {
        this.runSequenecNumber = value;
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
     * Gets the value of the attachmentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOf438060916NillableLong }
     *     
     */
    public ArrayOf438060916NillableLong getAttachmentTypes() {
        return attachmentTypes;
    }

    /**
     * Sets the value of the attachmentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOf438060916NillableLong }
     *     
     */
    public void setAttachmentTypes(ArrayOf438060916NillableLong value) {
        this.attachmentTypes = value;
    }

}
