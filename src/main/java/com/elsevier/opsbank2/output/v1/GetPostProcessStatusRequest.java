
package com.elsevier.opsbank2.output.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.eis.service.vo.PostProcessInputVO;


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
 *         &lt;element name="postProcessInputVO" type="{http://vo.service.eis.obii.elsevier.com}PostProcessInputVO"/&gt;
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
    "postProcessInputVO"
})
@XmlRootElement(name = "getPostProcessStatusRequest")
public class GetPostProcessStatusRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected PostProcessInputVO postProcessInputVO;

    /**
     * Gets the value of the postProcessInputVO property.
     * 
     * @return
     *     possible object is
     *     {@link PostProcessInputVO }
     *     
     */
    public PostProcessInputVO getPostProcessInputVO() {
        return postProcessInputVO;
    }

    /**
     * Sets the value of the postProcessInputVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostProcessInputVO }
     *     
     */
    public void setPostProcessInputVO(PostProcessInputVO value) {
        this.postProcessInputVO = value;
    }

}
