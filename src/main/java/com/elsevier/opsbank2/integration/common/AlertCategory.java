
package com.elsevier.opsbank2.integration.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alertCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="alertCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="validation"/&gt;
 *     &lt;enumeration value="business"/&gt;
 *     &lt;enumeration value="system"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "alertCategory")
@XmlEnum
public enum AlertCategory {

    @XmlEnumValue("validation")
    VALIDATION("validation"),
    @XmlEnumValue("business")
    BUSINESS("business"),
    @XmlEnumValue("system")
    SYSTEM("system");
    private final String value;

    AlertCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertCategory fromValue(String v) {
        for (AlertCategory c: AlertCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
