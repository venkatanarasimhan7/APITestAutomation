
package com.elsevier.opsbank2.output.v1;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.eis.service.vo.ArrayOfOutputFileDetails;
import com.elsevier.obii.eis.service.vo.Attributes;
import com.elsevier.obii.vo.IntegrationServiceResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}integrationServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="outputFileDetails" type="{http://vo.service.eis.obii.elsevier.com}ArrayOfOutputFileDetails" minOccurs="0"/&gt;
 *         &lt;element name="attributes" type="{http://vo.service.eis.obii.elsevier.com}Attributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileCount",
    "recordCount",
    "outputFileDetails",
    "attributes"
})
@XmlRootElement(name = "startOutputXMLGenerationResponse")
public class StartOutputXMLGenerationResponse
    extends IntegrationServiceResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fileCount;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger recordCount;
    protected ArrayOfOutputFileDetails outputFileDetails;
    protected Attributes attributes;

    /**
     * Gets the value of the fileCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileCount() {
        return fileCount;
    }

    /**
     * Sets the value of the fileCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileCount(BigInteger value) {
        this.fileCount = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordCount(BigInteger value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the outputFileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutputFileDetails }
     *     
     */
    public ArrayOfOutputFileDetails getOutputFileDetails() {
        return outputFileDetails;
    }

    /**
     * Sets the value of the outputFileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutputFileDetails }
     *     
     */
    public void setOutputFileDetails(ArrayOfOutputFileDetails value) {
        this.outputFileDetails = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
    }

}
