
package com.elsevier.opsbank2.outputorder.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.elsevier.opsbank2.outputorder.v1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.elsevier.opsbank2.outputorder.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOutputOrderProcessRequest }
     * 
     */
    public CreateOutputOrderProcessRequest createCreateOutputOrderProcessRequest() {
        return new CreateOutputOrderProcessRequest();
    }

    /**
     * Create an instance of {@link CreateOutputOrderProcessResponse }
     * 
     */
    public CreateOutputOrderProcessResponse createCreateOutputOrderProcessResponse() {
        return new CreateOutputOrderProcessResponse();
    }

    /**
     * Create an instance of {@link UpdateOrderTypeRequest }
     * 
     */
    public UpdateOrderTypeRequest createUpdateOrderTypeRequest() {
        return new UpdateOrderTypeRequest();
    }

    /**
     * Create an instance of {@link UpdateOrderTypeResponse }
     * 
     */
    public UpdateOrderTypeResponse createUpdateOrderTypeResponse() {
        return new UpdateOrderTypeResponse();
    }

    /**
     * Create an instance of {@link UpdateOutputOrderStatusRequest }
     * 
     */
    public UpdateOutputOrderStatusRequest createUpdateOutputOrderStatusRequest() {
        return new UpdateOutputOrderStatusRequest();
    }

    /**
     * Create an instance of {@link UpdateOutputOrderStatusResponse }
     * 
     */
    public UpdateOutputOrderStatusResponse createUpdateOutputOrderStatusResponse() {
        return new UpdateOutputOrderStatusResponse();
    }

    /**
     * Create an instance of {@link FinaliseOutputOrderRequest }
     * 
     */
    public FinaliseOutputOrderRequest createFinaliseOutputOrderRequest() {
        return new FinaliseOutputOrderRequest();
    }

    /**
     * Create an instance of {@link FinaliseOutputOrderResponse }
     * 
     */
    public FinaliseOutputOrderResponse createFinaliseOutputOrderResponse() {
        return new FinaliseOutputOrderResponse();
    }

}
