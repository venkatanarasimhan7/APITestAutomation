package com.elsevier.connections;

import com.elsevier.common.GetJsonTestData;
import com.elsevier.common.WSSecurityHeaderSOAPHandler;
import com.elsevier.obii.eis.service.vo.ArrayOfOutputFileDetails;
import com.elsevier.obii.eis.service.vo.PostProcessInputVO;
import com.elsevier.obii.services.outputorder.vo.CancelDataDeliveryInputVO;
import com.elsevier.obii.services.outputorder.vo.CreateExternalDeliveryOrderOutputVO;
import com.elsevier.obii.services.outputorder.vo.DeliveryNotificationEmailVO;
import com.elsevier.obii.services.outputorder.vo.RegisterDataDeliveryInputVO;
import com.elsevier.obii.services.query.vo.QueryInputVO;

import com.elsevier.obii.services.utility.vo.NameValuePairVO;
import com.elsevier.obii.services.utility.vo.OutputOrderDeliveryDataVO;
import com.elsevier.obii.vo.UserVO;
import com.elsevier.opsbank2.output.v1.*;
import com.elsevier.opsbank2.outputorder.v1.OutputOrderIntegrationService;
import com.elsevier.opsbank2.outputorder.v1.OutputOrderIntegrationService_Service;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConnectToOutPutProcessSoap {

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

    public static OutputProcess optProcSeverSoap (String wsdlUrl){
        URL wsdlURL = null;
        try {
            // wsdlURL = new URL("https://input-soap-service-ob2sit.apps.ose-nonprod.cp.tio.systems/cxf/ob2/inputService/?wsdl");
            wsdlURL = new URL(wsdlUrl);
            //logger.debug("correlationId: {} ** wsdlURL: {} ", correlationId, wsdlURL);
        } catch (MalformedURLException e) {
            // throw new BpmnError(ElsevierConstants.ERRORS.GENERIC, "Malformed url.");
        }

        OutputProcess_Service optOrdService = new OutputProcess_Service(wsdlURL);
        OutputProcess optOrdProc = optOrdService.getOutputProcessSOAP();
        BindingProvider bp = (BindingProvider) optOrdProc;
        @SuppressWarnings("rawtypes")
        List<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new WSSecurityHeaderSOAPHandler("IntUser1Sit", "HkVE323Io"));
        bp.getBinding().setHandlerChain(handlerChain);
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdlURL.toString());

        return optOrdProc;
    }


    public static String connectToOutputProcess(String serviceName, String wsdlUrl, String inputJsonString) throws ParseException, DatatypeConfigurationException {

        getDataList = GetJsonTestData.getDataList(inputJsonString, serviceName);

        for (int i = 0; i < getDataList.size(); i++) {

            Map<String, String> indiData = getDataList.get(i);
            if (serviceName.equalsIgnoreCase("RegisterDataDelivery")) {

               // CreateExternalDeliveryOrderOutputVO
                RegisterDataDeliveryInputVO regDataDeli = new RegisterDataDeliveryInputVO();
                regDataDeli.setDeliveryDate(Long.valueOf(indiData.get("deliveryDate")));
                regDataDeli.setIsDeliveryTypeInternal(Boolean.valueOf(indiData.get("isDeliveryTypeInternal")));
                regDataDeli.setOutputDeliveryId(indiData.get("outputDeliveryId"));
                regDataDeli.setOutputOrderId(indiData.get("outputOrderId"));

                RegisterDataDeliveryRequest registerDataDeliveryRequest = new RegisterDataDeliveryRequest();
                registerDataDeliveryRequest.setRegisterDataDeliveryInput(regDataDeli);

                OutputProcess outProcService = (OutputProcess) ConnectToOutPutProcessSoap.optProcSeverSoap(wsdlUrl);
                RegisterDataDeliveryResponse regDataDeliRes = outProcService.registerDataDelivery(registerDataDeliveryRequest);

                Boolean exportRes= regDataDeliRes.isRegisterDataDeliveryResponseReturn();
                serviceResponse = exportRes.toString();

            }


            if(serviceName.equalsIgnoreCase("SubmitCancelDataDelivery")){

                CancelDataDeliveryInputVO createCancelDateDeliverySoap = new CancelDataDeliveryInputVO();

                if(indiData.containsKey("outputOrderId")){
                    createCancelDateDeliverySoap.setOutputOrderId(indiData.get("outputOrderId"));
                }
                if(indiData.containsKey("ouputOrderDeliveryId")){
                    createCancelDateDeliverySoap.setOuputOrderDeliveryId(indiData.get("ouputOrderDeliveryId"));
                }
                if(indiData.containsKey("outputResultSetId")){
                    createCancelDateDeliverySoap.setOutputResultSetId(indiData.get("outputResultSetId"));
                }

                CancelDataDeliveryRequest createCancelDataDeliverySoap = new CancelDataDeliveryRequest();
                createCancelDataDeliverySoap.setCancelDataDeliveryInput(createCancelDateDeliverySoap);

                OutputProcess outProcService = (OutputProcess) ConnectToOutPutProcessSoap.optProcSeverSoap(wsdlUrl);
                CancelDataDeliveryResponse cancelDataDeliveryResponse = outProcService.submitCancelDataDelivery(createCancelDataDeliverySoap);

                Boolean exportRes= cancelDataDeliveryResponse.isCancelDataDeliveryResponseReturn();
                serviceResponse = exportRes.toString();

            }

            if(serviceName.equalsIgnoreCase("SubmitDeliverOutputOrderDataFilesToCustomer")){

                NameValuePairVO nameValuePairVO = new NameValuePairVO();

                if(indiData.containsKey("name")){
                    nameValuePairVO.setName(indiData.get("name"));
                }

                OutputOrderDeliveryDataVO dataInsert = new OutputOrderDeliveryDataVO();

                if(indiData.containsKey("userId")){
                    dataInsert.setUserId(indiData.get("userId"));
                }

                if(indiData.containsKey("outputOrderId")){
                    dataInsert.setOutputOrderId(indiData.get("outputOrderId"));
                }

                if(indiData.containsKey("name")){
                    dataInsert.setCorrelationinfo(nameValuePairVO);
                }

                if(indiData.containsKey("ftpAddressId")){
                    dataInsert.setFtpAddressId("ftpAddressId");
                }

                if(indiData.containsKey("outputOrderDeliveryId")){
                    dataInsert.setOutputOrderDeliveryId("outputOrderDeliveryId");
                }

                DeliverOutputOrderDataFilesToCustomerRequest createDeliveryOptOrdDataFilesCusSOAP = new DeliverOutputOrderDataFilesToCustomerRequest();
                createDeliveryOptOrdDataFilesCusSOAP.setOutputOrderDeliveryDataVO(dataInsert);

                OutputProcess outProcService = (OutputProcess) ConnectToOutPutProcessSoap.optProcSeverSoap(wsdlUrl);
                DeliverOutputOrderDataFilesToCustomerResponse deliverOutputOrderDataFilesToCustomerResponse = outProcService.submitDeliverOutputOrderDataFilesToCustomer(createDeliveryOptOrdDataFilesCusSOAP);

                Boolean exportRes=deliverOutputOrderDataFilesToCustomerResponse.isDeliverOutputOrderDataFilesToCustomerReturn();
                serviceResponse = exportRes.toString();

            }

            if(serviceName.equalsIgnoreCase("SubmitGetPostProcessStatus")){


                com.elsevier.obii.eis.service.vo.NameValuePairVO nameValuePairVO = new com.elsevier.obii.eis.service.vo.NameValuePairVO();

                if(indiData.containsKey("name")){
                    nameValuePairVO.setName(indiData.get("name"));
                }

                PostProcessInputVO postProcessInputVO = new PostProcessInputVO();

                if(indiData.containsKey("name")){
                    postProcessInputVO.setCorrelationId(nameValuePairVO);
                }

                if(indiData.containsKey("outputOrderId")){
                    postProcessInputVO.setOutputOrderId(Long.valueOf(indiData.get("outputOrderId")));
                }

                if(indiData.containsKey("outputDeliveryId")){
                    postProcessInputVO.setOutputDeliveryId(Long.valueOf(indiData.get("outputDeliveryId")));
                }

                if(indiData.containsKey("deliverySeq")){
                    postProcessInputVO.setDeliverySeq((Long.valueOf(indiData.get("deliverySeq"))));
                }

                if(indiData.containsKey("indexName")){
                    postProcessInputVO.setIndexName(indiData.get("indexName"));
                }

                GetPostProcessStatusRequest  getPostProcessStatusRequest = new GetPostProcessStatusRequest();
                getPostProcessStatusRequest.setPostProcessInputVO(postProcessInputVO);

                OutputProcess outProcService = (OutputProcess) ConnectToOutPutProcessSoap.optProcSeverSoap(wsdlUrl);
                GetPostProcessStatusResponse getPostProcessStatusRequestSOAP = outProcService.submitGetPostProcessStatus(getPostProcessStatusRequest);

                Boolean responce = getPostProcessStatusRequestSOAP.isGetPostProcessStatusReturn();
                serviceResponse = responce.toString();

            }

            if(serviceName.equalsIgnoreCase("SubmitGetUserAndOrderInfo")){

                GetUserAndOrderInfoRequest getUserAndOrderInfoRequest = new GetUserAndOrderInfoRequest();

                if(indiData.containsKey("outputOrderId")){
                    getUserAndOrderInfoRequest.setOutputOrderId(indiData.get("outputOrderId"));
                }

                if(indiData.containsKey("userLoginName")){
                    getUserAndOrderInfoRequest.setUserLoginName(indiData.get("userLoginName"));
                }

                OutputProcess outProcService = (OutputProcess) ConnectToOutPutProcessSoap.optProcSeverSoap(wsdlUrl);
                GetUserAndOrderInfoResponse getUserAndOrderInfoRes =  outProcService.submitGetUserAndOrderInfo(getUserAndOrderInfoRequest);

                UserVO custDeatils = getUserAndOrderInfoRes.getUserDetails();
                String userDetail = custDeatils.getUserFirstName().toString().concat("").concat(custDeatils.getUserLastName()).concat("").concat(custDeatils.getUserId());
                serviceResponse = userDetail;


            }

            if(serviceName.equalsIgnoreCase("SubmitGetUserDetails")){

                GetUserDetailsRequest getuserDetailSOAP = new GetUserDetailsRequest();
                getuserDetailSOAP.setUserLoginName(indiData.get("userLoginName"));
                OutputProcess outProcService = (OutputProcess) ConnectToOutPutProcessSoap.optProcSeverSoap(wsdlUrl);
                GetUserDetailsResponse getUserDetailsResponse = outProcService.submitGetUserDetails(getuserDetailSOAP);

                UserVO custDeatils = getUserDetailsResponse.getUserDetails();
                String userDetail = custDeatils.getUserFirstName().toString().concat("").concat(custDeatils.getUserLastName()).concat("").concat(custDeatils.getUserId());
                serviceResponse = userDetail;

            }

            if(serviceName.equalsIgnoreCase("SubmitRunSearchProfile")){

                QueryInputVO queryInputVO = new QueryInputVO();
                if(indiData.containsKey("searchProfileSQLText")){
                    queryInputVO.setSearchProfileSQLText(indiData.get("searchProfileSQLText"));
                }
                if(indiData.containsKey("searchProfileId")){
                    queryInputVO.setSearchProfileId(indiData.get("searchProfileId"));
                }
                if(indiData.containsKey("outputOrderDeliveryId")){
                    queryInputVO.setOutputOrderDeliveryId(indiData.get("outputOrderDeliveryId"));
                }
                if(indiData.containsKey("outputOrderId")){
                    queryInputVO.setOutputOrderId(indiData.get("outputOrderId"));
                }
                if(indiData.containsKey("outputResultSetId")){
                    queryInputVO.setOutputResultSetId(indiData.get("outputResultSetId"));
                }
                if(indiData.containsKey("outputOrderTypeCode")){
                    queryInputVO.setOutputOrderTypeCode(indiData.get("outputOrderTypeCode"));
                }
                if(indiData.containsKey("parentOutputOrderId")){
                    queryInputVO.setParentOutputOrderId(indiData.get("parentOutputOrderId"));
                }
                if(indiData.containsKey("compositeQueryInd")){
                    queryInputVO.setCompositeQueryInd(indiData.get("compositeQueryInd"));
                }

               UserVO userVO = new UserVO();
                if(indiData.containsKey("userId")){
                    userVO.setUserId(indiData.get("userId"));
                }
                if(indiData.containsKey("userEmailAddressName")){
                    userVO.setUserEmailAddressName(indiData.get("userEmailAddressName"));
                }
                if(indiData.containsKey("userFirstName")){
                    userVO.setUserFirstName(indiData.get("userFirstName"));
                }
                if(indiData.containsKey("userLoginName")){
                    userVO.setUserLoginName(indiData.get("userLoginName"));
                }

                RunSearchProfileRequest runSearchProfileRequest = new RunSearchProfileRequest();
                runSearchProfileRequest.setQueryInputVO(queryInputVO);
                runSearchProfileRequest.setUserVO(userVO);

                OutputProcess outProcService = (OutputProcess) ConnectToOutPutProcessSoap.optProcSeverSoap(wsdlUrl);
                RunSearchProfileResponse runSearchProfileResponse = outProcService.submitRunSearchProfile(runSearchProfileRequest);

                Boolean response = runSearchProfileResponse.isRunSearchProfileResponseReturn();
                serviceResponse = response.toString();


            }

            if(serviceName.equalsIgnoreCase("SubmitSendDeliveryNotificationEmail")){


                DeliveryNotificationEmailVO deliveryNotificationEmailVO = new DeliveryNotificationEmailVO();

                if(indiData.containsKey("outputDeliveryId")){
                    deliveryNotificationEmailVO.setOutputDeliveryId(indiData.get("outputDeliveryId"));
                }
                if(indiData.containsKey("outputOrderId")){
                    deliveryNotificationEmailVO.setOutputOrderId(indiData.get("outputOrderId"));
                }

                UserVO userVO = new UserVO();
                if(indiData.containsKey("userId")){
                    userVO.setUserId(indiData.get("userId"));
                }
                if(indiData.containsKey("userEmailAddressName")){
                    userVO.setUserEmailAddressName(indiData.get("userEmailAddressName"));
                }
                if(indiData.containsKey("userFirstName")){
                    userVO.setUserFirstName(indiData.get("userFirstName"));
                }
                if(indiData.containsKey("userLoginName")){
                    userVO.setUserLoginName(indiData.get("userLoginName"));
                }

                deliveryNotificationEmailVO.setUser(userVO);

                SendDeliveryNotificationEmailRequest sendDeliveryNotificationEmailRequest = new SendDeliveryNotificationEmailRequest();
                sendDeliveryNotificationEmailRequest.setDeliveryNotificationEmailVO(deliveryNotificationEmailVO);

                OutputProcess outProcService = (OutputProcess) ConnectToOutPutProcessSoap.optProcSeverSoap(wsdlUrl);
                SendDeliveryNotificationEmailResponse sendDeliveryNotificationEmailResponse = outProcService.submitSendDeliveryNotificationEmail(sendDeliveryNotificationEmailRequest);
                Boolean response = sendDeliveryNotificationEmailResponse.isSendDeliveryNotificationEmailReturn();
                serviceResponse = response.toString();
            }

            if(serviceName.equalsIgnoreCase("SubmitStartOutputXMLGeneration")){


                StartOutputXMLGenerationRequest startOutputXMLGenerationRequest = new StartOutputXMLGenerationRequest();
                startOutputXMLGenerationRequest.setCorrelationId(indiData.get("correlationId"));

                OutputProcess outProcService = (OutputProcess) ConnectToOutPutProcessSoap.optProcSeverSoap(wsdlUrl);
                StartOutputXMLGenerationResponse startOutputXMLGenerationResponse = outProcService.submitStartOutputXMLGeneration(startOutputXMLGenerationRequest);

                ArrayOfOutputFileDetails arrayOfOutputFileDetails = startOutputXMLGenerationResponse.getOutputFileDetails();
                arrayOfOutputFileDetails.getFileDetail();
            }

        }

        return serviceResponse;
    }



}
