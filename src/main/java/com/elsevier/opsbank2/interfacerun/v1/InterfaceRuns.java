
package com.elsevier.opsbank2.interfacerun.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterfaceRuns complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceRuns"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdByUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="interfaceRunEndDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceRunSeqno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceRunStartDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceRunStatusTypeClid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceRunTypeSeqno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="interfaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileInfos" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}ArrayOf_tns3_nillable_FileInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceRuns", propOrder = {
    "createdByUserId",
    "interfaceId",
    "interfaceRunEndDate",
    "interfaceRunSeqno",
    "interfaceRunStartDate",
    "interfaceRunStatusTypeClid",
    "interfaceRunTypeSeqno",
    "interfaceName",
    "fileInfos"
})
public class InterfaceRuns
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Long createdByUserId;
    protected long interfaceId;
    protected Long interfaceRunEndDate;
    protected Long interfaceRunSeqno;
    protected Long interfaceRunStartDate;
    protected Long interfaceRunStatusTypeClid;
    protected Long interfaceRunTypeSeqno;
    protected String interfaceName;
    protected ArrayOfTns3NillableFileInfo fileInfos;

    /**
     * Gets the value of the createdByUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatedByUserId() {
        return createdByUserId;
    }

    /**
     * Sets the value of the createdByUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatedByUserId(Long value) {
        this.createdByUserId = value;
    }

    /**
     * Gets the value of the interfaceId property.
     * 
     */
    public long getInterfaceId() {
        return interfaceId;
    }

    /**
     * Sets the value of the interfaceId property.
     * 
     */
    public void setInterfaceId(long value) {
        this.interfaceId = value;
    }

    /**
     * Gets the value of the interfaceRunEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceRunEndDate() {
        return interfaceRunEndDate;
    }

    /**
     * Sets the value of the interfaceRunEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceRunEndDate(Long value) {
        this.interfaceRunEndDate = value;
    }

    /**
     * Gets the value of the interfaceRunSeqno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceRunSeqno() {
        return interfaceRunSeqno;
    }

    /**
     * Sets the value of the interfaceRunSeqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceRunSeqno(Long value) {
        this.interfaceRunSeqno = value;
    }

    /**
     * Gets the value of the interfaceRunStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceRunStartDate() {
        return interfaceRunStartDate;
    }

    /**
     * Sets the value of the interfaceRunStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceRunStartDate(Long value) {
        this.interfaceRunStartDate = value;
    }

    /**
     * Gets the value of the interfaceRunStatusTypeClid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceRunStatusTypeClid() {
        return interfaceRunStatusTypeClid;
    }

    /**
     * Sets the value of the interfaceRunStatusTypeClid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceRunStatusTypeClid(Long value) {
        this.interfaceRunStatusTypeClid = value;
    }

    /**
     * Gets the value of the interfaceRunTypeSeqno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceRunTypeSeqno() {
        return interfaceRunTypeSeqno;
    }

    /**
     * Sets the value of the interfaceRunTypeSeqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceRunTypeSeqno(Long value) {
        this.interfaceRunTypeSeqno = value;
    }

    /**
     * Gets the value of the interfaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the value of the interfaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceName(String value) {
        this.interfaceName = value;
    }

    /**
     * Gets the value of the fileInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3NillableFileInfo }
     *     
     */
    public ArrayOfTns3NillableFileInfo getFileInfos() {
        return fileInfos;
    }

    /**
     * Sets the value of the fileInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3NillableFileInfo }
     *     
     */
    public void setFileInfos(ArrayOfTns3NillableFileInfo value) {
        this.fileInfos = value;
    }

}
