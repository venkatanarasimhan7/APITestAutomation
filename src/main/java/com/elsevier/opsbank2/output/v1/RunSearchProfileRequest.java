
package com.elsevier.opsbank2.output.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.query.vo.QueryInputVO;
import com.elsevier.obii.vo.UserVO;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryInputVO" type="{http://vo.query.services.obii.elsevier.com}QueryInputVO"/&gt;
 *         &lt;element name="userVO" type="{http://vo.obii.elsevier.com}UserVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryInputVO",
    "userVO"
})
@XmlRootElement(name = "runSearchProfileRequest")
public class RunSearchProfileRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected QueryInputVO queryInputVO;
    @XmlElement(required = true)
    protected UserVO userVO;

    /**
     * Gets the value of the queryInputVO property.
     * 
     * @return
     *     possible object is
     *     {@link QueryInputVO }
     *     
     */
    public QueryInputVO getQueryInputVO() {
        return queryInputVO;
    }

    /**
     * Sets the value of the queryInputVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryInputVO }
     *     
     */
    public void setQueryInputVO(QueryInputVO value) {
        this.queryInputVO = value;
    }

    /**
     * Gets the value of the userVO property.
     * 
     * @return
     *     possible object is
     *     {@link UserVO }
     *     
     */
    public UserVO getUserVO() {
        return userVO;
    }

    /**
     * Sets the value of the userVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserVO }
     *     
     */
    public void setUserVO(UserVO value) {
        this.userVO = value;
    }

}
