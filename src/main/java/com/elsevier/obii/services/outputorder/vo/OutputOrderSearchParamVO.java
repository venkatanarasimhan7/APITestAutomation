
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for OutputOrderSearchParamVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputOrderSearchParamVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outputOrderStatuses" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *         &lt;element name="outputOrderTypes" type="{http://vo.outputorder.services.obii.elsevier.com}ArrayOf_tns8_nillable_CodeListItemDetailsVO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputOrderSearchParamVO", propOrder = {
    "outputOrderStatuses",
    "outputOrderTypes"
})
public class OutputOrderSearchParamVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO outputOrderStatuses;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns8NillableCodeListItemDetailsVO outputOrderTypes;

    /**
     * Gets the value of the outputOrderStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public ArrayOfTns8NillableCodeListItemDetailsVO getOutputOrderStatuses() {
        return outputOrderStatuses;
    }

    /**
     * Sets the value of the outputOrderStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public void setOutputOrderStatuses(ArrayOfTns8NillableCodeListItemDetailsVO value) {
        this.outputOrderStatuses = value;
    }

    /**
     * Gets the value of the outputOrderTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public ArrayOfTns8NillableCodeListItemDetailsVO getOutputOrderTypes() {
        return outputOrderTypes;
    }

    /**
     * Sets the value of the outputOrderTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns8NillableCodeListItemDetailsVO }
     *     
     */
    public void setOutputOrderTypes(ArrayOfTns8NillableCodeListItemDetailsVO value) {
        this.outputOrderTypes = value;
    }

}
