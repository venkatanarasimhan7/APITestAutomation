
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrievePatentFamilyVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrievePatentFamilyVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bibRecId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="patentFamilyInfo" type="{http://www.elsevier.com/opsbank2/input/v1}patentFamilyInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrievePatentFamilyVO", propOrder = {
    "bibRecId",
    "patentFamilyInfo"
})
public class RetrievePatentFamilyVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String bibRecId;
    protected List<PatentFamilyInfo> patentFamilyInfo;

    /**
     * Gets the value of the bibRecId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBibRecId() {
        return bibRecId;
    }

    /**
     * Sets the value of the bibRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBibRecId(String value) {
        this.bibRecId = value;
    }

    /**
     * Gets the value of the patentFamilyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patentFamilyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatentFamilyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatentFamilyInfo }
     * 
     * 
     */
    public List<PatentFamilyInfo> getPatentFamilyInfo() {
        if (patentFamilyInfo == null) {
            patentFamilyInfo = new ArrayList<PatentFamilyInfo>();
        }
        return this.patentFamilyInfo;
    }

}
