
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.services.common.vo.CodeListItemDetailsVO;
import com.elsevier.obii.services.common.vo.PartyInfoVO;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for DeliveryInstructionVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryInstructionVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalDeliveryMedia" type="{http://vo.common.services.obii.elsevier.com}CodeListItemDetailsVO"/&gt;
 *         &lt;element name="externalDeliverySupInfo" type="{http://vo.common.services.obii.elsevier.com}PartyInfoVO"/&gt;
 *         &lt;element name="internalDeliveryMethod" type="{http://vo.common.services.obii.elsevier.com}CodeListItemDetailsVO"/&gt;
 *         &lt;element name="isExternalDelvryReqd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isInternalDelvryReqd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="skipEndToEndTestInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryInstructionVO", propOrder = {
    "externalDeliveryMedia",
    "externalDeliverySupInfo",
    "internalDeliveryMethod",
    "isExternalDelvryReqd",
    "isInternalDelvryReqd",
    "skipEndToEndTestInd"
})
public class DeliveryInstructionVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected CodeListItemDetailsVO externalDeliveryMedia;
    @XmlElement(required = true, nillable = true)
    protected PartyInfoVO externalDeliverySupInfo;
    @XmlElement(required = true, nillable = true)
    protected CodeListItemDetailsVO internalDeliveryMethod;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isExternalDelvryReqd;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isInternalDelvryReqd;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean skipEndToEndTestInd;

    /**
     * Gets the value of the externalDeliveryMedia property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public CodeListItemDetailsVO getExternalDeliveryMedia() {
        return externalDeliveryMedia;
    }

    /**
     * Sets the value of the externalDeliveryMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public void setExternalDeliveryMedia(CodeListItemDetailsVO value) {
        this.externalDeliveryMedia = value;
    }

    /**
     * Gets the value of the externalDeliverySupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInfoVO }
     *     
     */
    public PartyInfoVO getExternalDeliverySupInfo() {
        return externalDeliverySupInfo;
    }

    /**
     * Sets the value of the externalDeliverySupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInfoVO }
     *     
     */
    public void setExternalDeliverySupInfo(PartyInfoVO value) {
        this.externalDeliverySupInfo = value;
    }

    /**
     * Gets the value of the internalDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public CodeListItemDetailsVO getInternalDeliveryMethod() {
        return internalDeliveryMethod;
    }

    /**
     * Sets the value of the internalDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListItemDetailsVO }
     *     
     */
    public void setInternalDeliveryMethod(CodeListItemDetailsVO value) {
        this.internalDeliveryMethod = value;
    }

    /**
     * Gets the value of the isExternalDelvryReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExternalDelvryReqd() {
        return isExternalDelvryReqd;
    }

    /**
     * Sets the value of the isExternalDelvryReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternalDelvryReqd(Boolean value) {
        this.isExternalDelvryReqd = value;
    }

    /**
     * Gets the value of the isInternalDelvryReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInternalDelvryReqd() {
        return isInternalDelvryReqd;
    }

    /**
     * Sets the value of the isInternalDelvryReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInternalDelvryReqd(Boolean value) {
        this.isInternalDelvryReqd = value;
    }

    /**
     * Gets the value of the skipEndToEndTestInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipEndToEndTestInd() {
        return skipEndToEndTestInd;
    }

    /**
     * Sets the value of the skipEndToEndTestInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipEndToEndTestInd(Boolean value) {
        this.skipEndToEndTestInd = value;
    }

}
