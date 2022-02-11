package com.elsevier.connections;

import com.elsevier.common.WSSecurityHeaderSOAPHandler;
import com.elsevier.opsbank2.input.v1.InputOrderCARIdsRetrievalRequest;
import com.elsevier.opsbank2.inputservice.v1.InputOrderCARIdsRetrievalResponse;
import com.elsevier.opsbank2.inputservice.v1.InputService;
import com.elsevier.opsbank2.inputservice.v1.InputService_Service;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RetriveID {

    public static void main (String args[]){
        InputOrderCARIdsRetrievalRequest inputOrderCARIdsRetrievalRequest = new InputOrderCARIdsRetrievalRequest();
       // String orderId = opsBankInput.getCurrentActivity().getInputDelivery().getDeliveryInfo().getOrderInfo().getOrderId();
        inputOrderCARIdsRetrievalRequest.setOrderId("33686856");

        //logger.info("correlationId: {} ** making CARId retrieval request service call with: {}", correlationId, serializeObj(inputOrderCARIdsRetrievalRequest));

        // conf = new SiteConfig();
        URL wsdlURL=null;
        try {
            wsdlURL = new URL("https://input-soap-service-ob2sit.apps.ose-nonprod.cp.tio.systems/cxf/ob2/inputService/?wsdl");
            //logger.debug("correlationId: {} ** wsdlURL: {} ", correlationId, wsdlURL);
        } catch (MalformedURLException e) {
           // throw new BpmnError(ElsevierConstants.ERRORS.GENERIC, "Malformed url.");
        }

        InputService_Service ipService = new InputService_Service(wsdlURL);
        InputService inputServiceSOAP = ipService.getInputServiceSOAP();

        BindingProvider bp = (BindingProvider) inputServiceSOAP;
        @SuppressWarnings("rawtypes")
        List<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new WSSecurityHeaderSOAPHandler("IntUser1Sit","HkVE323Io"));
        bp.getBinding().setHandlerChain(handlerChain);
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdlURL.toString());

        InputOrderCARIdsRetrievalResponse response = inputServiceSOAP.submitInputOrderCARIdsRetrieval(inputOrderCARIdsRetrievalRequest); //openshift call
        //response.getInputOrderCARIdsRetrievalResponseReturn().
String res = RetriveID.serializeObj(response);
        System.out.println("responce***:"+res);;
    }

    public static String serializeObj(Object obj) {

        ObjectMapper objectMapper = new ObjectMapper();
        StringWriter stringEmp = new StringWriter();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        try {
            objectMapper.writeValue(stringEmp, obj);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringEmp.toString();
    }

}
