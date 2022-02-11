
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveTpaAndPublisherOutputInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveTpaAndPublisherOutputInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyArticleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveTpaAndPublisherOutputInfo", propOrder = {
    "publisherId",
    "thirdPartyArticleId"
})
public class RetrieveTpaAndPublisherOutputInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Long publisherId;
    protected String thirdPartyArticleId;

    /**
     * Gets the value of the publisherId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPublisherId() {
        return publisherId;
    }

    /**
     * Sets the value of the publisherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPublisherId(Long value) {
        this.publisherId = value;
    }

    /**
     * Gets the value of the thirdPartyArticleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyArticleId() {
        return thirdPartyArticleId;
    }

    /**
     * Sets the value of the thirdPartyArticleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyArticleId(String value) {
        this.thirdPartyArticleId = value;
    }

}
