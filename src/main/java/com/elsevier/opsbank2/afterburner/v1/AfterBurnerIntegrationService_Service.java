package com.elsevier.opsbank2.afterburner.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2021-11-12T16:01:53.170+05:30
 * Generated source version: 3.4.5
 *
 */
@WebServiceClient(name = "AfterBurnerIntegrationService",
                  wsdlLocation = "https://output-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/afterBurnerIntegService/?WSDL",
                  targetNamespace = "http://www.elsevier.com/opsbank2/afterburner/v1")
public class AfterBurnerIntegrationService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.elsevier.com/opsbank2/afterburner/v1", "AfterBurnerIntegrationService");
    public final static QName AfterBurnerIntegrationServiceSoap = new QName("http://www.elsevier.com/opsbank2/afterburner/v1", "AfterBurnerIntegrationServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("https://output-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/afterBurnerIntegService/?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AfterBurnerIntegrationService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "https://output-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/afterBurnerIntegService/?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public AfterBurnerIntegrationService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AfterBurnerIntegrationService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AfterBurnerIntegrationService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AfterBurnerIntegrationService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AfterBurnerIntegrationService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AfterBurnerIntegrationService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AfterBurnerIntegrationService
     */
    @WebEndpoint(name = "AfterBurnerIntegrationServiceSoap")
    public AfterBurnerIntegrationService getAfterBurnerIntegrationServiceSoap() {
        return super.getPort(AfterBurnerIntegrationServiceSoap, AfterBurnerIntegrationService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AfterBurnerIntegrationService
     */
    @WebEndpoint(name = "AfterBurnerIntegrationServiceSoap")
    public AfterBurnerIntegrationService getAfterBurnerIntegrationServiceSoap(WebServiceFeature... features) {
        return super.getPort(AfterBurnerIntegrationServiceSoap, AfterBurnerIntegrationService.class, features);
    }

}
