
package com.elsevier.opsbank2.interfacerun.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitiateInterfaceRun complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitiateInterfaceRun"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterfaceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InterfaceRunTypeSeqNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InterfaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaskID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InitParams" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}InterfaceParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RunParams" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}InterfaceParams" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RunStartTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="InterfaceRunSeqno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SCAMetaData" type="{http://www.elsevier.com/opsbank2/interfacerun/v1}SCATargetInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitiateInterfaceRun", propOrder = {
    "interfaceID",
    "interfaceRunTypeSeqNum",
    "interfaceName",
    "taskID",
    "initParams",
    "runParams",
    "runStartTime",
    "interfaceRunSeqno",
    "scaMetaData"
})
public class InitiateInterfaceRun
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InterfaceID")
    protected Long interfaceID;
    @XmlElement(name = "InterfaceRunTypeSeqNum")
    protected Long interfaceRunTypeSeqNum;
    @XmlElement(name = "InterfaceName")
    protected String interfaceName;
    @XmlElement(name = "TaskID")
    protected Long taskID;
    @XmlElement(name = "InitParams")
    protected List<InterfaceParameter> initParams;
    @XmlElement(name = "RunParams")
    protected List<InterfaceParams> runParams;
    @XmlElement(name = "RunStartTime")
    protected Long runStartTime;
    @XmlElement(name = "InterfaceRunSeqno")
    protected Long interfaceRunSeqno;
    @XmlElement(name = "SCAMetaData")
    protected SCATargetInfo scaMetaData;

    /**
     * Gets the value of the interfaceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceID() {
        return interfaceID;
    }

    /**
     * Sets the value of the interfaceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceID(Long value) {
        this.interfaceID = value;
    }

    /**
     * Gets the value of the interfaceRunTypeSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceRunTypeSeqNum() {
        return interfaceRunTypeSeqNum;
    }

    /**
     * Sets the value of the interfaceRunTypeSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceRunTypeSeqNum(Long value) {
        this.interfaceRunTypeSeqNum = value;
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
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskID(Long value) {
        this.taskID = value;
    }

    /**
     * Gets the value of the initParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceParameter }
     * 
     * 
     */
    public List<InterfaceParameter> getInitParams() {
        if (initParams == null) {
            initParams = new ArrayList<InterfaceParameter>();
        }
        return this.initParams;
    }

    /**
     * Gets the value of the runParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceParams }
     * 
     * 
     */
    public List<InterfaceParams> getRunParams() {
        if (runParams == null) {
            runParams = new ArrayList<InterfaceParams>();
        }
        return this.runParams;
    }

    /**
     * Gets the value of the runStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRunStartTime() {
        return runStartTime;
    }

    /**
     * Sets the value of the runStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRunStartTime(Long value) {
        this.runStartTime = value;
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
     * Gets the value of the scaMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link SCATargetInfo }
     *     
     */
    public SCATargetInfo getSCAMetaData() {
        return scaMetaData;
    }

    /**
     * Sets the value of the scaMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCATargetInfo }
     *     
     */
    public void setSCAMetaData(SCATargetInfo value) {
        this.scaMetaData = value;
    }

}
