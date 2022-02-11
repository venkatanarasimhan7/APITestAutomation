
package com.elsevier.obii.services.common.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for CodeListItemDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListItemDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codeItemDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codeListDetails" type="{http://vo.common.services.obii.elsevier.com}CodeListDetailsVO"/&gt;
 *         &lt;element name="codeListItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="lastUpdatedUser" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListItemDetailsVO", propOrder = {
    "codeItemCode",
    "codeItemDesc",
    "codeListDetails",
    "codeListItemId",
    "lastUpdatedDate",
    "lastUpdatedUser"
})
public class CodeListItemDetailsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String codeItemCode;
    @XmlElement(required = true, nillable = true)
    protected String codeItemDesc;
    @XmlElement(required = true, nillable = true)
    protected CodeListDetailsVO codeListDetails;
    @XmlElement(required = true, nillable = true)
    protected String codeListItemId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long lastUpdatedDate;
    @XmlElement(required = true, nillable = true)
    protected UserVO lastUpdatedUser;

    /**
     * Gets the value of the codeItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeItemCode() {
        return codeItemCode;
    }

    /**
     * Sets the value of the codeItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeItemCode(String value) {
        this.codeItemCode = value;
    }

    /**
     * Gets the value of the codeItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeItemDesc() {
        return codeItemDesc;
    }

    /**
     * Sets the value of the codeItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeItemDesc(String value) {
        this.codeItemDesc = value;
    }

    /**
     * Gets the value of the codeListDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListDetailsVO }
     *     
     */
    public CodeListDetailsVO getCodeListDetails() {
        return codeListDetails;
    }

    /**
     * Sets the value of the codeListDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListDetailsVO }
     *     
     */
    public void setCodeListDetails(CodeListDetailsVO value) {
        this.codeListDetails = value;
    }

    /**
     * Gets the value of the codeListItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListItemId() {
        return codeListItemId;
    }

    /**
     * Sets the value of the codeListItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListItemId(String value) {
        this.codeListItemId = value;
    }

    /**
     * Gets the value of the lastUpdatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * Sets the value of the lastUpdatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastUpdatedDate(Long value) {
        this.lastUpdatedDate = value;
    }

    /**
     * Gets the value of the lastUpdatedUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    /**
     * Sets the value of the lastUpdatedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setLastUpdatedUser(UserVO value) {
        this.lastUpdatedUser = value;
    }

}
