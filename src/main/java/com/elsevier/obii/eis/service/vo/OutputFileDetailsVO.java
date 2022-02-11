
package com.elsevier.obii.eis.service.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.eis.service.ArrayOfXsdNillableLong;


/**
 * <p>Java class for OutputFileDetailsVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputFileDetailsVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carIds" type="{http://service.eis.obii.elsevier.com}ArrayOf_xsd_nillable_long" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="deliverySeq" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputFileDetailsVO", propOrder = {
    "carIds",
    "fileName",
    "fileIndex",
    "deliverySeq"
})
public class OutputFileDetailsVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ArrayOfXsdNillableLong carIds;
    protected String fileName;
    protected Integer fileIndex;
    protected Long deliverySeq;

    /**
     * Gets the value of the carIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableLong }
     *     
     */
    public ArrayOfXsdNillableLong getCarIds() {
        return carIds;
    }

    /**
     * Sets the value of the carIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableLong }
     *     
     */
    public void setCarIds(ArrayOfXsdNillableLong value) {
        this.carIds = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFileIndex() {
        return fileIndex;
    }

    /**
     * Sets the value of the fileIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFileIndex(Integer value) {
        this.fileIndex = value;
    }

    /**
     * Gets the value of the deliverySeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliverySeq() {
        return deliverySeq;
    }

    /**
     * Sets the value of the deliverySeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliverySeq(Long value) {
        this.deliverySeq = value;
    }

}
