package com.elsevier.opsbank2.interfacerunservice.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2022-01-11T14:06:58.115+05:30
 * Generated source version: 3.4.5
 *
 */
@WebServiceClient(name = "InterfaceRunService",
                  wsdlLocation = "https://supporting-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/interfaceRunService/?wsdl",
                  targetNamespace = "http://www.elsevier.com/opsbank2/interfacerunservice/v1")
public class InterfaceRunService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.elsevier.com/opsbank2/interfacerunservice/v1", "InterfaceRunService");
    public final static QName InterfaceRunServiceSOAP = new QName("http://www.elsevier.com/opsbank2/interfacerunservice/v1", "InterfaceRunServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("https://supporting-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/interfaceRunService/?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InterfaceRunService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "https://supporting-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/interfaceRunService/?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InterfaceRunService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InterfaceRunService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InterfaceRunService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public InterfaceRunService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public InterfaceRunService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public InterfaceRunService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns InterfaceRunService
     */
    @WebEndpoint(name = "InterfaceRunServiceSOAP")
    public InterfaceRunService getInterfaceRunServiceSOAP() {
        return super.getPort(InterfaceRunServiceSOAP, InterfaceRunService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InterfaceRunService
     */
    @WebEndpoint(name = "InterfaceRunServiceSOAP")
    public InterfaceRunService getInterfaceRunServiceSOAP(WebServiceFeature... features) {
        return super.getPort(InterfaceRunServiceSOAP, InterfaceRunService.class, features);
    }

}
