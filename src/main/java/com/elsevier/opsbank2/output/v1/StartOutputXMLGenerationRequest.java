
package com.elsevier.opsbank2.output.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.eis.service.vo.PreProcessInputVO;


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
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="getPreprocessData" type="{http://vo.service.eis.obii.elsevier.com}PreProcessInputVO"/&gt;
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
    "correlationId",
    "getPreprocessData"
})
@XmlRootElement(name = "startOutputXMLGenerationRequest")
public class StartOutputXMLGenerationRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String correlationId;
    @XmlElement(required = true)
    protected PreProcessInputVO getPreprocessData;

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the getPreprocessData property.
     * 
     * @return
     *     possible object is
     *     {@link PreProcessInputVO }
     *     
     */
    public PreProcessInputVO getGetPreprocessData() {
        return getPreprocessData;
    }

    /**
     * Sets the value of the getPreprocessData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreProcessInputVO }
     *     
     */
    public void setGetPreprocessData(PreProcessInputVO value) {
        this.getPreprocessData = value;
    }

}
