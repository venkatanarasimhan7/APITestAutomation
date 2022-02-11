
package com.elsevier.obii.services.outputorder.vo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.elsevier.obii.vo.GenericVO;


/**
 * <p>Java class for DataScopeVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataScopeVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://vo.obii.elsevier.com}GenericVO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataScopeId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataScopeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataScopeVO", propOrder = {
    "dataScopeId",
    "dataScopeName"
})
public class DataScopeVO
    extends GenericVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected String dataScopeId;
    @XmlElement(required = true, nillable = true)
    protected String dataScopeName;

    /**
     * Gets the value of the dataScopeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataScopeId() {
        return dataScopeId;
    }

    /**
     * Sets the value of the dataScopeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScopeId(String value) {
        this.dataScopeId = value;
    }

    /**
     * Gets the value of the dataScopeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataScopeName() {
        return dataScopeName;
    }

    /**
     * Sets the value of the dataScopeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScopeName(String value) {
        this.dataScopeName = value;
    }

}
