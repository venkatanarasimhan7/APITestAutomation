package com.elsevier.connections;

import com.elsevier.common.GetJsonTestData;
import com.elsevier.common.WSSecurityHeaderSOAPHandler;
import com.elsevier.opsbank2.input.v1.ExportCARFileInfo;
import com.elsevier.opsbank2.input.v1.InputOrderCARIdsRetrievalRequest;
import com.elsevier.opsbank2.inputservice.v1.ExportCARResponse;
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
import java.util.Map;

public class ConnectToServices {


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

    public static String connectToServices(String serviceName, String orderId){

        String serviceResponse =null;

        if(serviceName.equalsIgnoreCase("submitInputOrderCARIdsRetrieval")){
            InputOrderCARIdsRetrievalRequest inputOrderCARIdsRetrievalRequest = new InputOrderCARIdsRetrievalRequest();
            // String orderId = opsBankInput.getCurrentActivity().getInputDelivery().getDeliveryInfo().getOrderInfo().getOrderId();
            inputOrderCARIdsRetrievalRequest.setOrderId(orderId);
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
            String caeID = response.getInputOrderCARIdsRetrievalResponseReturn().getCarIds().get(0).toString();
            String res = ConnectToServices.serializeObj(caeID);
            System.out.println("responce***:"+res);;
            serviceResponse = caeID;
        }

        if(serviceName.equalsIgnoreCase("SubmitExportCAR")){

            ExportCARFileInfo submitExportService = new ExportCARFileInfo();
            //submitExportService.setCarId();


        }

        return serviceResponse;
    }

    public static InputService inputServiceSOAPObj(String wsdlUrl){

        URL wsdlURL=null;
        try {
            // wsdlURL = new URL("https://input-soap-service-ob2sit.apps.ose-nonprod.cp.tio.systems/cxf/ob2/inputService/?wsdl");
            wsdlURL = new URL(wsdlUrl);
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

return inputServiceSOAP;
    }
    public static String connectToServices(String serviceName, String wsdlUrl, String inputJsonString ){

        Map<String,String> getRequestData = GetJsonTestData.getData(inputJsonString,serviceName);
        String serviceResponse =null;

        if(serviceName.equalsIgnoreCase("submitInputOrderCARIdsRetrieval")){
            InputOrderCARIdsRetrievalRequest inputOrderCARIdsRetrievalRequest = new InputOrderCARIdsRetrievalRequest();
            // String orderId = opsBankInput.getCurrentActivity().getInputDelivery().getDeliveryInfo().getOrderInfo().getOrderId();
            String orderId = getRequestData.get("orderId");
            inputOrderCARIdsRetrievalRequest.setOrderId(orderId);
            URL wsdlURL=null;
            try {
               // wsdlURL = new URL("https://input-soap-service-ob2sit.apps.ose-nonprod.cp.tio.systems/cxf/ob2/inputService/?wsdl");
                wsdlURL = new URL(wsdlUrl);
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
            String caeID = response.getInputOrderCARIdsRetrievalResponseReturn().getCarIds().get(0).toString();
            String res = ConnectToServices.serializeObj(caeID);
            System.out.println("responce***:"+res);;
            serviceResponse = caeID;
        }

        if(serviceName.equalsIgnoreCase("SubmitExportCAR")){

            ExportCARFileInfo submitExportService = new ExportCARFileInfo();
            submitExportService.setCarId(getRequestData.get("carId"));
            InputService inputServiceSOAP = ConnectToServices.inputServiceSOAPObj(wsdlUrl);
            ExportCARResponse response = inputServiceSOAP.submitExportCAR(submitExportService);

            Boolean exportRes = response.isExportCARResponseReturn();
            serviceResponse = exportRes.toString();

        }

        return serviceResponse;
    }
}
