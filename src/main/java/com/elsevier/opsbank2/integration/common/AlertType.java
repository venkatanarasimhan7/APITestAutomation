
package com.elsevier.opsbank2.integration.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alertType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="alertType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="info"/&gt;
 *     &lt;enumeration value="warning"/&gt;
 *     &lt;enumeration value="error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "alertType")
@XmlEnum
public enum AlertType {

    @XmlEnumValue("info")
    INFO("info"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    AlertType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertType fromValue(String v) {
        for (AlertType c: AlertType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
