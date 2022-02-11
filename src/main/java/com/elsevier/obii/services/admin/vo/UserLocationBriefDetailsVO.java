
package com.elsevier.obii.services.admin.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for UserLocationBriefDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserLocationBriefDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userLocationDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userLocationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userLocationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserLocationBriefDetailsVO", propOrder = {
    "userLocationDesc",
    "userLocationId",
    "userLocationName"
})
public class UserLocationBriefDetailsVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String userLocationDesc;
    @XmlElement(required = true, nillable = true)
    protected String userLocationId;
    @XmlElement(required = true, nillable = true)
    protected String userLocationName;

    /**
     * Gets the value of the userLocationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocationDesc() {
        return userLocationDesc;
    }

    /**
     * Sets the value of the userLocationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocationDesc(String value) {
        this.userLocationDesc = value;
    }

    /**
     * Gets the value of the userLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocationId() {
        return userLocationId;
    }

    /**
     * Sets the value of the userLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocationId(String value) {
        this.userLocationId = value;
    }

    /**
     * Gets the value of the userLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLocationName() {
        return userLocationName;
    }

    /**
     * Sets the value of the userLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLocationName(String value) {
        this.userLocationName = value;
    }

}
