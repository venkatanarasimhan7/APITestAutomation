
package com.elsevier.obii.eis.service.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.elsevier.obii.eis.service.vo package. 
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

    private final static QName _NameValuePairVOValue_QNAME = new QName("", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.elsevier.obii.eis.service.vo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PreProcessInputVO }
     * 
     */
    public PreProcessInputVO createPreProcessInputVO() {
        return new PreProcessInputVO();
    }

    /**
     * Create an instance of {@link PreProcessOutputVO }
     * 
     */
    public PreProcessOutputVO createPreProcessOutputVO() {
        return new PreProcessOutputVO();
    }

    /**
     * Create an instance of {@link AttributesVO }
     * 
     */
    public AttributesVO createAttributesVO() {
        return new AttributesVO();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link OutputFileDetailsVO }
     * 
     */
    public OutputFileDetailsVO createOutputFileDetailsVO() {
        return new OutputFileDetailsVO();
    }

    /**
     * Create an instance of {@link OutputFileDetail }
     * 
     */
    public OutputFileDetail createOutputFileDetail() {
        return new OutputFileDetail();
    }

    /**
     * Create an instance of {@link ArrayOfOutputFileDetails }
     * 
     */
    public ArrayOfOutputFileDetails createArrayOfOutputFileDetails() {
        return new ArrayOfOutputFileDetails();
    }

    /**
     * Create an instance of {@link PostProcessInputVO }
     * 
     */
    public PostProcessInputVO createPostProcessInputVO() {
        return new PostProcessInputVO();
    }

    /**
     * Create an instance of {@link NameValuePairVO }
     * 
     */
    public NameValuePairVO createNameValuePairVO() {
        return new NameValuePairVO();
    }

    /**
     * Create an instance of {@link ArrayOf438060916NillableLong }
     * 
     */
    public ArrayOf438060916NillableLong createArrayOf438060916NillableLong() {
        return new ArrayOf438060916NillableLong();
    }

    /**
     * Create an instance of {@link ArrayOfCreatedFileDetailsVO }
     * 
     */
    public ArrayOfCreatedFileDetailsVO createArrayOfCreatedFileDetailsVO() {
        return new ArrayOfCreatedFileDetailsVO();
    }

    /**
     * Create an instance of {@link CreatedFileDetailsVO }
     * 
     */
    public CreatedFileDetailsVO createCreatedFileDetailsVO() {
        return new CreatedFileDetailsVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "value", scope = NameValuePairVO.class)
    public JAXBElement<String> createNameValuePairVOValue(String value) {
        return new JAXBElement<String>(_NameValuePairVOValue_QNAME, String.class, NameValuePairVO.class, value);
    }

}
