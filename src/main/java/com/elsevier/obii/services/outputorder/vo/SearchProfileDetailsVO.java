
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for SearchProfileDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchProfileDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isExistingSearchProfileAttached" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="searchProfileId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="searchProfileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchProfileDetailsVO", propOrder = {
    "isExistingSearchProfileAttached",
    "searchProfileId",
    "searchProfileName"
})
public class SearchProfileDetailsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isExistingSearchProfileAttached;
    @XmlElement(required = true, nillable = true)
    protected String searchProfileId;
    @XmlElement(required = true, nillable = true)
    protected String searchProfileName;

    /**
     * Gets the value of the isExistingSearchProfileAttached property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExistingSearchProfileAttached() {
        return isExistingSearchProfileAttached;
    }

    /**
     * Sets the value of the isExistingSearchProfileAttached property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExistingSearchProfileAttached(Boolean value) {
        this.isExistingSearchProfileAttached = value;
    }

    /**
     * Gets the value of the searchProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchProfileId() {
        return searchProfileId;
    }

    /**
     * Sets the value of the searchProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchProfileId(String value) {
        this.searchProfileId = value;
    }

    /**
     * Gets the value of the searchProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchProfileName() {
        return searchProfileName;
    }

    /**
     * Sets the value of the searchProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchProfileName(String value) {
        this.searchProfileName = value;
    }

}
