
package com.elsevier.obii.eis.service.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.eis.service.ArrayOfTns2NillableOutputFileDetailsVO;


/**
 * <p>Java class for PreProcessOutputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreProcessOutputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributes" type="{http://vo.service.eis.obii.elsevier.com}AttributesVO" minOccurs="0"/&gt;
 *         &lt;element name="fileDetails" type="{http://service.eis.obii.elsevier.com}ArrayOf_tns2_nillable_OutputFileDetailsVO" minOccurs="0"/&gt;
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maxNoOfFileToBeProcesed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreProcessOutputVO", propOrder = {
    "attributes",
    "fileDetails",
    "recordCount",
    "maxNoOfFileToBeProcesed"
})
public class PreProcessOutputVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AttributesVO attributes;
    protected ArrayOfTns2NillableOutputFileDetailsVO fileDetails;
    protected Integer recordCount;
    protected Long maxNoOfFileToBeProcesed;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesVO }
     *     
     */
    public AttributesVO getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesVO }
     *     
     */
    public void setAttributes(AttributesVO value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the fileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns2NillableOutputFileDetailsVO }
     *     
     */
    public ArrayOfTns2NillableOutputFileDetailsVO getFileDetails() {
        return fileDetails;
    }

    /**
     * Sets the value of the fileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns2NillableOutputFileDetailsVO }
     *     
     */
    public void setFileDetails(ArrayOfTns2NillableOutputFileDetailsVO value) {
        this.fileDetails = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordCount(Integer value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the maxNoOfFileToBeProcesed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxNoOfFileToBeProcesed() {
        return maxNoOfFileToBeProcesed;
    }

    /**
     * Sets the value of the maxNoOfFileToBeProcesed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxNoOfFileToBeProcesed(Long value) {
        this.maxNoOfFileToBeProcesed = value;
    }

}
