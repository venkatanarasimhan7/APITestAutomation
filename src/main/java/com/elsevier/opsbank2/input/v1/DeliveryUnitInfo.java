
package com.elsevier.opsbank2.input.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryUnitInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryUnitInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supplierUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitFileInfo" type="{http://www.elsevier.com/opsbank2/input/v1}UnitFileInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reloadCntParcelUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="lowerLevelBRId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="isSourceStrFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deliverySupplierUnitInfo" type="{http://www.elsevier.com/opsbank2/input/v1}UnitFileInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="parcelUnitInfo" type="{http://www.elsevier.com/opsbank2/input/v1}ParcelUnitInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryUnitInfo", propOrder = {
    "filePath",
    "supplierUnitId",
    "unitFileInfo",
    "reloadCntParcelUnit",
    "lowerLevelBRId",
    "isSourceStrFound",
    "deliverySupplierUnitInfo",
    "parcelUnitInfo"
})
public class DeliveryUnitInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<String> filePath;
    protected String supplierUnitId;
    @XmlElement(name = "UnitFileInfo")
    protected List<UnitFileInfo> unitFileInfo;
    protected Long reloadCntParcelUnit;
    protected Long lowerLevelBRId;
    protected Boolean isSourceStrFound;
    protected List<UnitFileInfo> deliverySupplierUnitInfo;
    protected List<ParcelUnitInfo> parcelUnitInfo;

    /**
     * Gets the value of the filePath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filePath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilePath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFilePath() {
        if (filePath == null) {
            filePath = new ArrayList<String>();
        }
        return this.filePath;
    }

    /**
     * Gets the value of the supplierUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierUnitId() {
        return supplierUnitId;
    }

    /**
     * Sets the value of the supplierUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierUnitId(String value) {
        this.supplierUnitId = value;
    }

    /**
     * Gets the value of the unitFileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitFileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitFileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitFileInfo }
     * 
     * 
     */
    public List<UnitFileInfo> getUnitFileInfo() {
        if (unitFileInfo == null) {
            unitFileInfo = new ArrayList<UnitFileInfo>();
        }
        return this.unitFileInfo;
    }

    /**
     * Gets the value of the reloadCntParcelUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReloadCntParcelUnit() {
        return reloadCntParcelUnit;
    }

    /**
     * Sets the value of the reloadCntParcelUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReloadCntParcelUnit(Long value) {
        this.reloadCntParcelUnit = value;
    }

    /**
     * Gets the value of the lowerLevelBRId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLowerLevelBRId() {
        return lowerLevelBRId;
    }

    /**
     * Sets the value of the lowerLevelBRId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLowerLevelBRId(Long value) {
        this.lowerLevelBRId = value;
    }

    /**
     * Gets the value of the isSourceStrFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSourceStrFound() {
        return isSourceStrFound;
    }

    /**
     * Sets the value of the isSourceStrFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSourceStrFound(Boolean value) {
        this.isSourceStrFound = value;
    }

    /**
     * Gets the value of the deliverySupplierUnitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliverySupplierUnitInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliverySupplierUnitInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitFileInfo }
     * 
     * 
     */
    public List<UnitFileInfo> getDeliverySupplierUnitInfo() {
        if (deliverySupplierUnitInfo == null) {
            deliverySupplierUnitInfo = new ArrayList<UnitFileInfo>();
        }
        return this.deliverySupplierUnitInfo;
    }

    /**
     * Gets the value of the parcelUnitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parcelUnitInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParcelUnitInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParcelUnitInfo }
     * 
     * 
     */
    public List<ParcelUnitInfo> getParcelUnitInfo() {
        if (parcelUnitInfo == null) {
            parcelUnitInfo = new ArrayList<ParcelUnitInfo>();
        }
        return this.parcelUnitInfo;
    }

}
