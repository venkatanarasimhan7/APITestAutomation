
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryItemInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="itemFileIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additinalItemFileIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="brAttachmentFileIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deltaItemFileIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="errorLogRemarks" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryItemInfo", propOrder = {
    "carIds",
    "itemFileIds",
    "additinalItemFileIds",
    "brAttachmentFileIds",
    "deltaItemFileIds",
    "errorLogRemarks"
})
public class DeliveryItemInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<String> carIds;
    protected List<String> itemFileIds;
    protected List<String> additinalItemFileIds;
    protected List<String> brAttachmentFileIds;
    protected List<String> deltaItemFileIds;
    protected List<String> errorLogRemarks;

    /**
     * Gets the value of the carIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarIds() {
        if (carIds == null) {
            carIds = new ArrayList<String>();
        }
        return this.carIds;
    }

    /**
     * Gets the value of the itemFileIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemFileIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemFileIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItemFileIds() {
        if (itemFileIds == null) {
            itemFileIds = new ArrayList<String>();
        }
        return this.itemFileIds;
    }

    /**
     * Gets the value of the additinalItemFileIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additinalItemFileIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditinalItemFileIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditinalItemFileIds() {
        if (additinalItemFileIds == null) {
            additinalItemFileIds = new ArrayList<String>();
        }
        return this.additinalItemFileIds;
    }

    /**
     * Gets the value of the brAttachmentFileIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brAttachmentFileIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrAttachmentFileIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBrAttachmentFileIds() {
        if (brAttachmentFileIds == null) {
            brAttachmentFileIds = new ArrayList<String>();
        }
        return this.brAttachmentFileIds;
    }

    /**
     * Gets the value of the deltaItemFileIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deltaItemFileIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeltaItemFileIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeltaItemFileIds() {
        if (deltaItemFileIds == null) {
            deltaItemFileIds = new ArrayList<String>();
        }
        return this.deltaItemFileIds;
    }

    /**
     * Gets the value of the errorLogRemarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorLogRemarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorLogRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorLogRemarks() {
        if (errorLogRemarks == null) {
            errorLogRemarks = new ArrayList<String>();
        }
        return this.errorLogRemarks;
    }

}
