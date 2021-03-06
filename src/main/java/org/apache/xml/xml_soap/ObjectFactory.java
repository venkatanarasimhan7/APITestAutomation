
package org.apache.xml.xml_soap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.xml.xml_soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.xml.xml_soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link ArrayOfXSDAnyType }
     * 
     */
    public ArrayOfXSDAnyType createArrayOfXSDAnyType() {
        return new ArrayOfXSDAnyType();
    }

    /**
     * Create an instance of {@link DataHandler }
     * 
     */
    public DataHandler createDataHandler() {
        return new DataHandler();
    }

}
