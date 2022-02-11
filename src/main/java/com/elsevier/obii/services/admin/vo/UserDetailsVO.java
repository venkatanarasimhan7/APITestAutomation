
package com.elsevier.obii.services.admin.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.common.vo.ElsevierOrgUnitVO;
import com.elsevier.obii.vo.GenericVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for UserDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdByUser" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="elsevierOrgUnit" type="{http://vo.common.services.obii.elsevier.com}ElsevierOrgUnitVO"/&gt;
 *         &lt;element name="lastLoginDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="lastUpdatedByUser" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="user" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *         &lt;element name="userLocation" type="{http://vo.admin.services.obii.elsevier.com}UserLocationBriefDetailsVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDetailsVO", propOrder = {
    "createdByUser",
    "creationDate",
    "elsevierOrgUnit",
    "lastLoginDate",
    "lastUpdatedByUser",
    "lastUpdateDate",
    "user",
    "userLocation"
})
public class UserDetailsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected UserVO createdByUser;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long creationDate;
    @XmlElement(required = true, nillable = true)
    protected ElsevierOrgUnitVO elsevierOrgUnit;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long lastLoginDate;
    @XmlElement(required = true, nillable = true)
    protected UserVO lastUpdatedByUser;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long lastUpdateDate;
    @XmlElement(required = true, nillable = true)
    protected UserVO user;
    @XmlElement(required = true, nillable = true)
    protected UserLocationBriefDetailsVO userLocation;

    /**
     * Gets the value of the createdByUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getCreatedByUser() {
        return createdByUser;
    }

    /**
     * Sets the value of the createdByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setCreatedByUser(UserVO value) {
        this.createdByUser = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreationDate(Long value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the elsevierOrgUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ElsevierOrgUnitVO }
     *     
     */
    public ElsevierOrgUnitVO getElsevierOrgUnit() {
        return elsevierOrgUnit;
    }

    /**
     * Sets the value of the elsevierOrgUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElsevierOrgUnitVO }
     *     
     */
    public void setElsevierOrgUnit(ElsevierOrgUnitVO value) {
        this.elsevierOrgUnit = value;
    }

    /**
     * Gets the value of the lastLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Sets the value of the lastLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastLoginDate(Long value) {
        this.lastLoginDate = value;
    }

    /**
     * Gets the value of the lastUpdatedByUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getLastUpdatedByUser() {
        return lastUpdatedByUser;
    }

    /**
     * Sets the value of the lastUpdatedByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setLastUpdatedByUser(UserVO value) {
        this.lastUpdatedByUser = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastUpdateDate(Long value) {
        this.lastUpdateDate = value;
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
     * Gets the value of the userLocation property.
     * 
     * @return
     *     possible object is
     *     {@link UserLocationBriefDetailsVO }
     *     
     */
    public UserLocationBriefDetailsVO getUserLocation() {
        return userLocation;
    }

    /**
     * Sets the value of the userLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLocationBriefDetailsVO }
     *     
     */
    public void setUserLocation(UserLocationBriefDetailsVO value) {
        this.userLocation = value;
    }

}
