
package com.elsevier.obii.services.common.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for CodeListDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeListDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codeListId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codeListTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isProtectedCodeList" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListDetailsVO", propOrder = {
    "codeListDescription",
    "codeListId",
    "codeListTypeName",
    "isProtectedCodeList"
})
public class CodeListDetailsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String codeListDescription;
    @XmlElement(required = true, nillable = true)
    protected String codeListId;
    @XmlElement(required = true, nillable = true)
    protected String codeListTypeName;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isProtectedCodeList;

    /**
     * Gets the value of the codeListDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListDescription() {
        return codeListDescription;
    }

    /**
     * Sets the value of the codeListDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListDescription(String value) {
        this.codeListDescription = value;
    }

    /**
     * Gets the value of the codeListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListId() {
        return codeListId;
    }

    /**
     * Sets the value of the codeListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListId(String value) {
        this.codeListId = value;
    }

    /**
     * Gets the value of the codeListTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListTypeName() {
        return codeListTypeName;
    }

    /**
     * Sets the value of the codeListTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListTypeName(String value) {
        this.codeListTypeName = value;
    }

    /**
     * Gets the value of the isProtectedCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProtectedCodeList() {
        return isProtectedCodeList;
    }

    /**
     * Sets the value of the isProtectedCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProtectedCodeList(Boolean value) {
        this.isProtectedCodeList = value;
    }

}
