package com.elsevier.connections;

import com.elsevier.common.GetJsonTestData;
import com.elsevier.common.WSSecurityHeaderSOAPHandler;
import com.elsevier.opsbank2.inputservice.v1.InputService;
import com.elsevier.opsbank2.inputservice.v1.InputService_Service;
import com.elsevier.opsbank2.interfacerun.v1.InterfaceRunInput;
import com.elsevier.opsbank2.interfacerunservice.v1.RunInterface;
import com.elsevier.opsbank2.outputorder.v1.*;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConnectToOutputCreationWSDL {

    static String serviceResponse = null;
    static List<Map<String, String>> getDataList = null;

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

    public static OutputOrderIntegrationService optOrderCreateSOAPObj(String wsdlUrl) {

        URL wsdlURL = null;
        try {
            // wsdlURL = new URL("https://input-soap-service-ob2sit.apps.ose-nonprod.cp.tio.systems/cxf/ob2/inputService/?wsdl");
            wsdlURL = new URL(wsdlUrl);
            //logger.debug("correlationId: {} ** wsdlURL: {} ", correlationId, wsdlURL);
        } catch (MalformedURLException e) {
            // throw new BpmnError(ElsevierConstants.ERRORS.GENERIC, "Malformed url.");
        }

        OutputOrderIntegrationService_Service opService = new OutputOrderIntegrationService_Service(wsdlURL);
        //InputService_Service ipService = new InputService_Service(wsdlURL);
        // InputService inputServiceSOAP = ipService.getInputServiceSOAP();
        OutputOrderIntegrationService opIntServiceSoap = opService.getOutputOrderIntegrationServiceSoap();
        BindingProvider bp = (BindingProvider) opIntServiceSoap;
        @SuppressWarnings("rawtypes")
        List<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new WSSecurityHeaderSOAPHandler("IntUser1Sit", "HkVE323Io"));
        bp.getBinding().setHandlerChain(handlerChain);
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdlURL.toString());

        return opIntServiceSoap;
    }

    public static String connectToOPTCreation(String serviceName, String wsdlUrl, String inputJsonString) throws ParseException, DatatypeConfigurationException {


        //Map<String,String> getRequestData = GetJsonTestData.getData(inputJsonString,serviceName);


        getDataList = GetJsonTestData.getDataList(inputJsonString, serviceName);

        for (int i = 0; i < getDataList.size(); i++) {

            Map<String, String> indiData = getDataList.get(i);
            System.out.println("indiData***" + indiData);
            if (serviceName.equalsIgnoreCase("createOutputOrderProcess")) {

                CreateOutputOrderProcessRequest otpOrderCreate = new CreateOutputOrderProcessRequest();
                otpOrderCreate.setOrderId(indiData.get("orderId"));
                OutputOrderIntegrationService otpOrcerSoap = (OutputOrderIntegrationService) ConnectToOutputCreationWSDL.optOrderCreateSOAPObj(wsdlUrl);
                CreateOutputOrderProcessResponse response = otpOrcerSoap.createOutputOrderProcess(otpOrderCreate);

                Boolean exportRes = response.isCreateOutputOrderProcessReturn();
                System.out.println("serviceResponse*****" + exportRes);
                serviceResponse = exportRes.toString();


            }

            if (serviceName.equalsIgnoreCase("finaliseOutputOrder")) {
                FinaliseOutputOrderRequest fnlOptOrderReq = new FinaliseOutputOrderRequest();
                if (indiData.containsKey("outputOrderId")) {
                    fnlOptOrderReq.setOutputOrderId(indiData.get("outputOrderId"));
                }
                if (indiData.containsKey("orderStartDate")) {
                    DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    Date date = format.parse(indiData.get("orderStartDate"));
                    GregorianCalendar cal = new GregorianCalendar();
                    cal.setTime(date);
                    XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
                    fnlOptOrderReq.setOrderStartDate(xmlGregCal);
                }
                if (indiData.containsKey("approved")) {
                    fnlOptOrderReq.setApproved(Boolean.valueOf(indiData.get("approved")));
                }
                if (indiData.containsKey("dataChangeRequired")) {
                    fnlOptOrderReq.setDataChangeRequired(Boolean.valueOf(indiData.get("dataChangeRequired")));
                }
                if (indiData.containsKey("startDateChangeRequired")) {
                    fnlOptOrderReq.setStartDateChangeRequired(Boolean.valueOf(indiData.get("dataChangeRequired")));
                }
                if (indiData.containsKey("dataMismatch")) {
                    fnlOptOrderReq.setDataMismatch(Boolean.valueOf(indiData.get("dataMismatch")));
                }
                if (indiData.containsKey("requestorRemarks")) {
                    fnlOptOrderReq.setRequestorRemarks(indiData.get("dataMismatch"));
                }

                OutputOrderIntegrationService otpOrcerSoap = (OutputOrderIntegrationService) ConnectToOutputCreationWSDL.optOrderCreateSOAPObj(wsdlUrl);
                FinaliseOutputOrderResponse fnlOptOrderRes = otpOrcerSoap.finaliseOutputOrder(fnlOptOrderReq);

                Boolean fnlOptOrdResBol = fnlOptOrderRes.isFinaliseOutputOrderResponseReturn();
                serviceResponse = fnlOptOrdResBol.toString();
            }


            if (serviceName.equalsIgnoreCase("updateOrderType")) {

                UpdateOrderTypeRequest uptOrdReq = new UpdateOrderTypeRequest();
                if(indiData.containsKey("isDevelopmentOrder")){
                    uptOrdReq.setIsDevelopmentOrder(Boolean.valueOf(indiData.get("isDevelopmentOrder")));
                }
                if(indiData.containsKey("isProductionOrder")){
                    uptOrdReq.setIsProductionOrder(Boolean.valueOf(indiData.get("isProductionOrder")));
                }
                if(indiData.containsKey("isRequestOrder")){
                    uptOrdReq.setIsRequestOrder(Boolean.valueOf(indiData.get("isRequestOrder")));
                }
                if(indiData.containsKey("outputOrderId")){
                    uptOrdReq.setOutputOrderId(indiData.get("outputOrderId"));
                }

                OutputOrderIntegrationService otpOrcerSoap = (OutputOrderIntegrationService) ConnectToOutputCreationWSDL.optOrderCreateSOAPObj(wsdlUrl);
                UpdateOrderTypeResponse uptOrdRes = otpOrcerSoap.updateOrderType(uptOrdReq);
                Boolean uptOrdResBol = uptOrdRes.isUpdateOrderTypeResponseReturn();

                serviceResponse = uptOrdResBol.toString();
            }

            if (serviceName.equalsIgnoreCase("updateOutputOrderStatus")) {

                UpdateOutputOrderStatusRequest uptOptOrdStatusReq = new UpdateOutputOrderStatusRequest();

                if(indiData.containsKey("outputOrderId")){
                    uptOptOrdStatusReq.setOutputOrderId(indiData.get("outputOrderId"));
                }
                if(indiData.containsKey("statusInProduction")){
                    uptOptOrdStatusReq.setStatusInProduction(Boolean.valueOf(indiData.get("statusInProduction")));
                }
                if(indiData.containsKey("statusManagerApproved")){
                    uptOptOrdStatusReq.setStatusManagerApproved(Boolean.valueOf(indiData.get("statusManagerApproved")));
                }
                if(indiData.containsKey("statusManagerRejected")){
                    uptOptOrdStatusReq.setStatusManagerRejected(Boolean.valueOf(indiData.get("statusManagerRejected")));
                }
                if(indiData.containsKey("statusOpRequesterRejected")){
                    uptOptOrdStatusReq.setStatusOpRequesterRejected(Boolean.valueOf(indiData.get("statusOpRequesterRejected")));
                }
                if(indiData.containsKey("statusOrderCancelled")){
                    uptOptOrdStatusReq.setStatusOrderCancelled(Boolean.valueOf(indiData.get("statusOrderCancelled")));
                }
                if(indiData.containsKey("statusSubmtdForMgrApproval")){
                    uptOptOrdStatusReq.setStatusSubmtdForMgrApproval(Boolean.valueOf(indiData.get("statusSubmtdForMgrApproval")));
                }
                if(indiData.containsKey("statusSubmtdForOpReqsterApprvl")){
                    uptOptOrdStatusReq.setStatusSubmtdForOpReqsterApprvl(Boolean.valueOf(indiData.get("statusSubmtdForOpReqsterApprvl")));
                }

                OutputOrderIntegrationService otpOrcerSoap = (OutputOrderIntegrationService) ConnectToOutputCreationWSDL.optOrderCreateSOAPObj(wsdlUrl);
                UpdateOutputOrderStatusResponse uptOptOrdStatusRes = otpOrcerSoap.updateOutputOrderStatus(uptOptOrdStatusReq);


                Boolean uptOrdStatusReqBol = uptOptOrdStatusRes.isUpdateOutputOrderStatusResponseReturn();

                serviceResponse = uptOrdStatusReqBol.toString();

            }
        }
        return serviceResponse;
    }


    public static String finalizeOptOrder(String serviceName, String wsdlUrl, String inputJsonString) throws DatatypeConfigurationException, ParseException {


        getDataList = GetJsonTestData.getDataList(inputJsonString, serviceName);

        for (int i = 0; i < getDataList.size(); i++) {
            Map<String, String> indiData = getDataList.get(i);
            System.out.println("indiData***" + indiData);
            FinaliseOutputOrderRequest fnlOptOrderReq = new FinaliseOutputOrderRequest();
            if (indiData.containsKey("outputOrderId")) {
                fnlOptOrderReq.setOutputOrderId(indiData.get("outputOrderId"));
            }
            if (indiData.containsKey("orderStartDate")) {
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                Date date = format.parse(indiData.get("orderStartDate"));
                GregorianCalendar cal = new GregorianCalendar();
                cal.setTime(date);
                XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
                fnlOptOrderReq.setOrderStartDate(xmlGregCal);
            }
            if (indiData.containsKey("approved")) {
                fnlOptOrderReq.setApproved(Boolean.valueOf(indiData.get("approved")));
            }
            if (indiData.containsKey("dataChangeRequired")) {
                fnlOptOrderReq.setDataChangeRequired(Boolean.valueOf(indiData.get("dataChangeRequired")));
            }
            if (indiData.containsKey("startDateChangeRequired")) {
                fnlOptOrderReq.setStartDateChangeRequired(Boolean.valueOf(indiData.get("dataChangeRequired")));
            }
            if (indiData.containsKey("dataMismatch")) {
                fnlOptOrderReq.setDataMismatch(Boolean.valueOf(indiData.get("dataMismatch")));
            }
            if (indiData.containsKey("requestorRemarks")) {
                fnlOptOrderReq.setRequestorRemarks(indiData.get("dataMismatch"));
            }

            OutputOrderIntegrationService otpOrcerSoap = (OutputOrderIntegrationService) ConnectToOutputCreationWSDL.optOrderCreateSOAPObj(wsdlUrl);
            FinaliseOutputOrderResponse fnlOptOrderRes = otpOrcerSoap.finaliseOutputOrder(fnlOptOrderReq);

            Boolean fnlOptOrdResBol = fnlOptOrderRes.isFinaliseOutputOrderResponseReturn();
            serviceResponse = fnlOptOrdResBol.toString();
        }
        return serviceResponse;
    }

    public static String updateOrderType(String serviceName, String wsdlUrl, String inputJsonString){

        getDataList = GetJsonTestData.getDataList(inputJsonString, serviceName);

        for (int i = 0; i < getDataList.size(); i++) {

            Map<String, String> indiData = getDataList.get(i);
            System.out.println("indiData***" + indiData);
            UpdateOrderTypeRequest uptOrdReq = new UpdateOrderTypeRequest();
            if(indiData.containsKey("isDevelopmentOrder")){
                uptOrdReq.setIsDevelopmentOrder(Boolean.valueOf(indiData.get("isDevelopmentOrder")));
            }
            if(indiData.containsKey("isProductionOrder")){
                uptOrdReq.setIsProductionOrder(Boolean.valueOf(indiData.get("isProductionOrder")));
            }
            if(indiData.containsKey("isRequestOrder")){
                uptOrdReq.setIsRequestOrder(Boolean.valueOf(indiData.get("isRequestOrder")));
            }
            if(indiData.containsKey("outputOrderId")){
                uptOrdReq.setOutputOrderId(indiData.get("outputOrderId"));
            }

            OutputOrderIntegrationService otpOrcerSoap = (OutputOrderIntegrationService) ConnectToOutputCreationWSDL.optOrderCreateSOAPObj(wsdlUrl);
            UpdateOrderTypeResponse uptOrdRes = otpOrcerSoap.updateOrderType(uptOrdReq);
            Boolean uptOrdResBol = uptOrdRes.isUpdateOrderTypeResponseReturn();

            serviceResponse = uptOrdResBol.toString();

        }

        return serviceResponse;
    }


    public static String uptOptOrdStatus(String serviceName, String wsdlUrl, String inputJsonString){
        getDataList = GetJsonTestData.getDataList(inputJsonString, serviceName);

        for (int i = 0; i < getDataList.size(); i++) {

            Map<String, String> indiData = getDataList.get(i);
            System.out.println("indiData***" + indiData);
            UpdateOutputOrderStatusRequest uptOptOrdStatusReq = new UpdateOutputOrderStatusRequest();

            if(indiData.containsKey("outputOrderId")){
                uptOptOrdStatusReq.setOutputOrderId(indiData.get("outputOrderId"));
            }
            if(indiData.containsKey("statusInProduction")){
                uptOptOrdStatusReq.setStatusInProduction(Boolean.valueOf(indiData.get("statusInProduction")));
            }
            if(indiData.containsKey("statusManagerApproved")){
                uptOptOrdStatusReq.setStatusManagerApproved(Boolean.valueOf(indiData.get("statusManagerApproved")));
            }
            if(indiData.containsKey("statusManagerRejected")){
                uptOptOrdStatusReq.setStatusManagerRejected(Boolean.valueOf(indiData.get("statusManagerRejected")));
            }
            if(indiData.containsKey("statusOpRequesterRejected")){
                uptOptOrdStatusReq.setStatusOpRequesterRejected(Boolean.valueOf(indiData.get("statusOpRequesterRejected")));
            }
            if(indiData.containsKey("statusOrderCancelled")){
                uptOptOrdStatusReq.setStatusOrderCancelled(Boolean.valueOf(indiData.get("statusOrderCancelled")));
            }
            if(indiData.containsKey("statusSubmtdForMgrApproval")){
                uptOptOrdStatusReq.setStatusSubmtdForMgrApproval(Boolean.valueOf(indiData.get("statusSubmtdForMgrApproval")));
            }
            if(indiData.containsKey("statusSubmtdForOpReqsterApprvl")){
                uptOptOrdStatusReq.setStatusSubmtdForOpReqsterApprvl(Boolean.valueOf(indiData.get("statusSubmtdForOpReqsterApprvl")));
            }

            OutputOrderIntegrationService otpOrcerSoap = (OutputOrderIntegrationService) ConnectToOutputCreationWSDL.optOrderCreateSOAPObj(wsdlUrl);
            UpdateOutputOrderStatusResponse uptOptOrdStatusRes = otpOrcerSoap.updateOutputOrderStatus(uptOptOrdStatusReq);


            Boolean uptOrdStatusReqBol = uptOptOrdStatusRes.isUpdateOutputOrderStatusResponseReturn();

            serviceResponse = uptOrdStatusReqBol.toString();
        }

return serviceResponse;
    }




}



