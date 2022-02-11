
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for ChangeRequestInputVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeRequestInputVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outputAttachmentFileIds" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="parentOutputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestOrderInput" type="{http://vo.outputorder.services.obii.elsevier.com}RequestOrderInputVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeRequestInputVO", propOrder = {
    "outputAttachmentFileIds",
    "parentOutputOrderId",
    "requestOrderInput"
})
public class ChangeRequestInputVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString outputAttachmentFileIds;
    @XmlElement(required = true, nillable = true)
    protected String parentOutputOrderId;
    @XmlElement(required = true, nillable = true)
    protected RequestOrderInputVO requestOrderInput;

    /**
     * Gets the value of the outputAttachmentFileIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getOutputAttachmentFileIds() {
        return outputAttachmentFileIds;
    }

    /**
     * Sets the value of the outputAttachmentFileIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setOutputAttachmentFileIds(ArrayOfXsdNillableString value) {
        this.outputAttachmentFileIds = value;
    }

    /**
     * Gets the value of the parentOutputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOutputOrderId() {
        return parentOutputOrderId;
    }

    /**
     * Sets the value of the parentOutputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOutputOrderId(String value) {
        this.parentOutputOrderId = value;
    }

    /**
     * Gets the value of the requestOrderInput property.
     * 
     * @return
     *     possible object is
     *     {@link RequestOrderInputVO }
     *     
     */
    public RequestOrderInputVO getRequestOrderInput() {
        return requestOrderInput;
    }

    /**
     * Sets the value of the requestOrderInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestOrderInputVO }
     *     
     */
    public void setRequestOrderInput(RequestOrderInputVO value) {
        this.requestOrderInput = value;
    }

}
