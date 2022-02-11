
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for OutputOrderApprovalVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputOrderApprovalVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carAttachmentFileIds" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *         &lt;element name="elsevierStaffId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requesterId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primaryOutputFiles" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_xsd_nillable_string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputOrderApprovalVO", propOrder = {
    "carAttachmentFileIds",
    "elsevierStaffId",
    "outputOrderId",
    "requesterId",
    "primaryOutputFiles"
})
public class OutputOrderApprovalVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString carAttachmentFileIds;
    @XmlElement(required = true, nillable = true)
    protected String elsevierStaffId;
    @XmlElement(required = true, nillable = true)
    protected String outputOrderId;
    @XmlElement(required = true, nillable = true)
    protected String requesterId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdNillableString primaryOutputFiles;

    /**
     * Gets the value of the carAttachmentFileIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getCarAttachmentFileIds() {
        return carAttachmentFileIds;
    }

    /**
     * Sets the value of the carAttachmentFileIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setCarAttachmentFileIds(ArrayOfXsdNillableString value) {
        this.carAttachmentFileIds = value;
    }

    /**
     * Gets the value of the elsevierStaffId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElsevierStaffId() {
        return elsevierStaffId;
    }

    /**
     * Sets the value of the elsevierStaffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElsevierStaffId(String value) {
        this.elsevierStaffId = value;
    }

    /**
     * Gets the value of the outputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputOrderId() {
        return outputOrderId;
    }

    /**
     * Sets the value of the outputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputOrderId(String value) {
        this.outputOrderId = value;
    }

    /**
     * Gets the value of the requesterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterId() {
        return requesterId;
    }

    /**
     * Sets the value of the requesterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterId(String value) {
        this.requesterId = value;
    }

    /**
     * Gets the value of the primaryOutputFiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public ArrayOfXsdNillableString getPrimaryOutputFiles() {
        return primaryOutputFiles;
    }

    /**
     * Sets the value of the primaryOutputFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdNillableString }
     *     
     */
    public void setPrimaryOutputFiles(ArrayOfXsdNillableString value) {
        this.primaryOutputFiles = value;
    }

}
