
package com.elsevier.obii.services.admin.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for FTPAddressVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTPAddressVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="articleInPressIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ftpAddressName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ftpDirectory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ftpPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ftpUserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transferPushIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ftpAddressId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parcelType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parcelTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parcelTypeCodeItemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTPAddressVO", propOrder = {
    "articleInPressIndicator",
    "ftpAddressName",
    "ftpDirectory",
    "ftpPassword",
    "ftpUserName",
    "transferPushIndicator",
    "ftpAddressId",
    "parcelType",
    "parcelTypeCode",
    "parcelTypeCodeItemId"
})
public class FTPAddressVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean articleInPressIndicator;
    @XmlElement(required = true, nillable = true)
    protected String ftpAddressName;
    @XmlElement(required = true, nillable = true)
    protected String ftpDirectory;
    @XmlElement(required = true, nillable = true)
    protected String ftpPassword;
    @XmlElement(required = true, nillable = true)
    protected String ftpUserName;
    @XmlElement(required = true, nillable = true)
    protected String transferPushIndicator;
    @XmlElement(required = true, nillable = true)
    protected String ftpAddressId;
    @XmlElement(required = true, nillable = true)
    protected String parcelType;
    @XmlElement(required = true, nillable = true)
    protected String parcelTypeCode;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long parcelTypeCodeItemId;

    /**
     * Gets the value of the articleInPressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArticleInPressIndicator() {
        return articleInPressIndicator;
    }

    /**
     * Sets the value of the articleInPressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArticleInPressIndicator(Boolean value) {
        this.articleInPressIndicator = value;
    }

    /**
     * Gets the value of the ftpAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpAddressName() {
        return ftpAddressName;
    }

    /**
     * Sets the value of the ftpAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpAddressName(String value) {
        this.ftpAddressName = value;
    }

    /**
     * Gets the value of the ftpDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpDirectory() {
        return ftpDirectory;
    }

    /**
     * Sets the value of the ftpDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpDirectory(String value) {
        this.ftpDirectory = value;
    }

    /**
     * Gets the value of the ftpPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpPassword() {
        return ftpPassword;
    }

    /**
     * Sets the value of the ftpPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpPassword(String value) {
        this.ftpPassword = value;
    }

    /**
     * Gets the value of the ftpUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpUserName() {
        return ftpUserName;
    }

    /**
     * Sets the value of the ftpUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpUserName(String value) {
        this.ftpUserName = value;
    }

    /**
     * Gets the value of the transferPushIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferPushIndicator() {
        return transferPushIndicator;
    }

    /**
     * Sets the value of the transferPushIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferPushIndicator(String value) {
        this.transferPushIndicator = value;
    }

    /**
     * Gets the value of the ftpAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtpAddressId() {
        return ftpAddressId;
    }

    /**
     * Sets the value of the ftpAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtpAddressId(String value) {
        this.ftpAddressId = value;
    }

    /**
     * Gets the value of the parcelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelType() {
        return parcelType;
    }

    /**
     * Sets the value of the parcelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelType(String value) {
        this.parcelType = value;
    }

    /**
     * Gets the value of the parcelTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelTypeCode() {
        return parcelTypeCode;
    }

    /**
     * Sets the value of the parcelTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelTypeCode(String value) {
        this.parcelTypeCode = value;
    }

    /**
     * Gets the value of the parcelTypeCodeItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParcelTypeCodeItemId() {
        return parcelTypeCodeItemId;
    }

    /**
     * Sets the value of the parcelTypeCodeItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParcelTypeCodeItemId(Long value) {
        this.parcelTypeCodeItemId = value;
    }

}
