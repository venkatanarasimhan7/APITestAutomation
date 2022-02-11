
package opsbankiioutputlibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the opsbankiioutputlibrary package. 
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

    private final static QName _FTPResponseBO_QNAME = new QName("http://OPSBankIIOutputLibrary", "FTPResponseBO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: opsbankiioutputlibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FTPResponseBO }
     * 
     */
    public FTPResponseBO createFTPResponseBO() {
        return new FTPResponseBO();
    }

    /**
     * Create an instance of {@link NameValuePair }
     * 
     */
    public NameValuePair createNameValuePair() {
        return new NameValuePair();
    }

    /**
     * Create an instance of {@link FileInfo }
     * 
     */
    public FileInfo createFileInfo() {
        return new FileInfo();
    }

    /**
     * Create an instance of {@link CreateFileDetailsBO }
     * 
     */
    public CreateFileDetailsBO createCreateFileDetailsBO() {
        return new CreateFileDetailsBO();
    }

    /**
     * Create an instance of {@link PostProcessOutputBO }
     * 
     */
    public PostProcessOutputBO createPostProcessOutputBO() {
        return new PostProcessOutputBO();
    }

    /**
     * Create an instance of {@link OutputOrderXMLFileResponse }
     * 
     */
    public OutputOrderXMLFileResponse createOutputOrderXMLFileResponse() {
        return new OutputOrderXMLFileResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTPResponseBO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FTPResponseBO }{@code >}
     */
    @XmlElementDecl(namespace = "http://OPSBankIIOutputLibrary", name = "FTPResponseBO")
    public JAXBElement<FTPResponseBO> createFTPResponseBO(FTPResponseBO value) {
        return new JAXBElement<FTPResponseBO>(_FTPResponseBO_QNAME, FTPResponseBO.class, null, value);
    }

}
