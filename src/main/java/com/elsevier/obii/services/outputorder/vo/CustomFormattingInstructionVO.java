
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for CustomFormattingInstructionVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFormattingInstructionVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customFormattingSupId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customFormattingSupplierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isCustomFormattingReqd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="skipCustomFmtTestInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFormattingInstructionVO", propOrder = {
    "customFormattingSupId",
    "customFormattingSupplierName",
    "isCustomFormattingReqd",
    "skipCustomFmtTestInd"
})
public class CustomFormattingInstructionVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String customFormattingSupId;
    @XmlElement(required = true, nillable = true)
    protected String customFormattingSupplierName;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isCustomFormattingReqd;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean skipCustomFmtTestInd;

    /**
     * Gets the value of the customFormattingSupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomFormattingSupId() {
        return customFormattingSupId;
    }

    /**
     * Sets the value of the customFormattingSupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomFormattingSupId(String value) {
        this.customFormattingSupId = value;
    }

    /**
     * Gets the value of the customFormattingSupplierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomFormattingSupplierName() {
        return customFormattingSupplierName;
    }

    /**
     * Sets the value of the customFormattingSupplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomFormattingSupplierName(String value) {
        this.customFormattingSupplierName = value;
    }

    /**
     * Gets the value of the isCustomFormattingReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomFormattingReqd() {
        return isCustomFormattingReqd;
    }

    /**
     * Sets the value of the isCustomFormattingReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomFormattingReqd(Boolean value) {
        this.isCustomFormattingReqd = value;
    }

    /**
     * Gets the value of the skipCustomFmtTestInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipCustomFmtTestInd() {
        return skipCustomFmtTestInd;
    }

    /**
     * Sets the value of the skipCustomFmtTestInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipCustomFmtTestInd(Boolean value) {
        this.skipCustomFmtTestInd = value;
    }

}
