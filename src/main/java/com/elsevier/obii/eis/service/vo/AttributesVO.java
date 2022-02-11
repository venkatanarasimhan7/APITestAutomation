
package com.elsevier.obii.eis.service.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.eis.service.ArrayOfXsdNillableLong;


/**
 * <p>Java class for AttributesVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributesVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="indexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isAbstractPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isCitationPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isReferencePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="attachments" type="{http://service.eis.obii.elsevier.com}ArrayOf_xsd_nillable_long" minOccurs="0"/&gt;
 *         &lt;element name="isFullArticlePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isUnstructuredAffiliations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isReferenceInstanceId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isUnstructuredReferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributesVO", propOrder = {
    "indexName",
    "isAbstractPresent",
    "isCitationPresent",
    "isReferencePresent",
    "attachments",
    "isFullArticlePresent",
    "isUnstructuredAffiliations",
    "isReferenceInstanceId",
    "isUnstructuredReferences"
})
public class AttributesVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String indexName;
    protected Boolean isAbstractPresent;
    protected Boolean isCitationPresent;
    protected Boolean isReferencePresent;
    protected ArrayOfXsdNillableLong attachments;
    protected Boolean isFullArticlePresent;
    protected Boolean isUnstructuredAffiliations;
    protected Boolean isReferenceInstanceId;
    protected Boolean isUnstructuredReferences;

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
     * Gets the value of the isAbstractPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAbstractPresent() {
        return isAbstractPresent;
    }

    /**
     * Sets the value of the isAbstractPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAbstractPresent(Boolean value) {
        this.isAbstractPresent = value;
    }

    /**
     * Gets the value of the isCitationPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCitationPresent() {
        return isCitationPresent;
    }

    /**
     * Sets the value of the isCitationPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCitationPresent(Boolean value) {
        this.isCitationPresent = value;
    }

    /**
     * Gets the value of the isReferencePresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReferencePresent() {
        return isReferencePresent;
    }

    /**
     * Sets the value of the isReferencePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReferencePresent(Boolean value) {
        this.isReferencePresent = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableLong }
     *     
     */
    public ArrayOfXsdNillableLong getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableLong }
     *     
     */
    public void setAttachments(ArrayOfXsdNillableLong value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the isFullArticlePresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFullArticlePresent() {
        return isFullArticlePresent;
    }

    /**
     * Sets the value of the isFullArticlePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFullArticlePresent(Boolean value) {
        this.isFullArticlePresent = value;
    }

    /**
     * Gets the value of the isUnstructuredAffiliations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnstructuredAffiliations() {
        return isUnstructuredAffiliations;
    }

    /**
     * Sets the value of the isUnstructuredAffiliations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnstructuredAffiliations(Boolean value) {
        this.isUnstructuredAffiliations = value;
    }

    /**
     * Gets the value of the isReferenceInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReferenceInstanceId() {
        return isReferenceInstanceId;
    }

    /**
     * Sets the value of the isReferenceInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReferenceInstanceId(Boolean value) {
        this.isReferenceInstanceId = value;
    }

    /**
     * Gets the value of the isUnstructuredReferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUnstructuredReferences() {
        return isUnstructuredReferences;
    }

    /**
     * Sets the value of the isUnstructuredReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUnstructuredReferences(Boolean value) {
        this.isUnstructuredReferences = value;
    }

}
