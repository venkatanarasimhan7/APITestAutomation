package com.elsevier.opsbank2.inputservice.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.5
 * 2021-11-01T17:42:24.201+05:30
 * Generated source version: 3.4.5
 *
 */
@WebService(targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "InputService")
@XmlSeeAlso({com.elsevier.opsbank2.input.v1.ObjectFactory.class, ObjectFactory.class, com.elsevier.obii.vo.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface InputService {

    @WebMethod(operationName = "SubmitValidateInputDelivery", action = "validateInputDelivery")
    @WebResult(name = "validateInputDeliveryResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public ValidateInputDeliveryResponse submitValidateInputDelivery(

        @WebParam(partName = "parameters", name = "validateInputDeliveryRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );

    @WebMethod(operationName = "SubmitGenerateInputFiles", action = "generateInputFiles")
    @WebResult(name = "generateInputFilesResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public GenerateInputFilesResponse submitGenerateInputFiles(

        @WebParam(partName = "parameters", name = "generateInputFilesRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );

    @WebMethod(operationName = "SubmitRetrieveTPAAndPublisher", action = "retrieveTPAAndPublisher")
    @WebResult(name = "retrieveTPAAndPublisherResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public RetrieveTPAAndPublisherResponse submitRetrieveTPAAndPublisher(

        @WebParam(partName = "parameters", name = "retrieveTPAAndPublisherRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.RetrieveTPAAndPublisher parameters
    );

    @WebMethod(operationName = "SubmitPatentDetailsRetrieval", action = "patentDetailsRetrieval")
    @WebResult(name = "patentDetailsRetrievalResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public PatentDetailsRetrievalResponse submitPatentDetailsRetrieval(

        @WebParam(partName = "parameters", name = "patentDetailsRetrievalRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.PatentDetailsRetrievalRequest parameters
    );

    @WebMethod(operationName = "SubmitEmitExhibitEvents", action = "emitExhibitEvents")
    @WebResult(name = "emitExhibitEventsResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public EmitExhibitEventsResponse submitEmitExhibitEvents(

        @WebParam(partName = "parameters", name = "emitExhibitEventsRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.ExportCARFileInfo parameters
    );

    @WebMethod(operationName = "SubmitSimulateCARDelivery", action = "simulateCARDelivery")
    @WebResult(name = "simulateCARDeliveryResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public SimulateCARDeliveryResponse submitSimulateCARDelivery(

        @WebParam(partName = "parameters", name = "simulateCARDeliveryRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );

    @WebMethod(operationName = "SubmitStopPatentProcessing", action = "stopPatentProcessing")
    @WebResult(name = "stopPatentProcessingResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public StopPatentProcessingResponse submitStopPatentProcessing(

        @WebParam(partName = "parameters", name = "stopPatentProcessingRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.StopPatentProcessing parameters
    );

    @WebMethod(operationName = "SubmitTransformExportedCAR", action = "transformExportedCAR")
    @WebResult(name = "transformExportedCARResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public TransformExportedCARResponse submitTransformExportedCAR(

        @WebParam(partName = "parameters", name = "transformExportedCARRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.ExportCARFileInfo parameters
    );

    @WebMethod(operationName = "SubmitCloseInputOrder", action = "closeInputOrder")
    @WebResult(name = "closeInputOrderResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public CloseInputOrderResponse submitCloseInputOrder(

        @WebParam(partName = "parameters", name = "closeInputOrderRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );

    @WebMethod(operationName = "SubmitCreateInputOrder", action = "createInputOrder")
    @WebResult(name = "createInputOrderResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public CreateInputOrderResponse submitCreateInputOrder(

        @WebParam(partName = "parameters", name = "createInputOrderRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );

    @WebMethod(operationName = "SubmitRegisterInputDelivery", action = "registerInputDelivery")
    @WebResult(name = "registerInputDeliveryResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public RegisterInputDeliveryResponse submitRegisterInputDelivery(

        @WebParam(partName = "parameters", name = "registerInputDeliveryRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );

    @WebMethod(operationName = "SubmitProcessInputDelivery", action = "processInputDelivery")
    @WebResult(name = "processInputDeliveryResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public ProcessInputDeliveryResponse submitProcessInputDelivery(

        @WebParam(partName = "parameters", name = "processInputDeliveryRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );

    @WebMethod(operationName = "SubmitPatentFamilyProcessing", action = "patentFamilyProcessing")
    @WebResult(name = "patentFamilyProcessingResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public PatentFamilyProcessingResponse submitPatentFamilyProcessing(

        @WebParam(partName = "parameters", name = "patentFamilyProcessingRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );

    @WebMethod(operationName = "SubmitExportCAR", action = "exportCAR")
    @WebResult(name = "exportCARResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public ExportCARResponse submitExportCAR(

        @WebParam(partName = "parameters", name = "exportCARRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.ExportCARFileInfo parameters
    );

    @WebMethod(operationName = "SubmitMatchPatentFamilyProcessing", action = "matchPatentFamilyProcessing")
    @WebResult(name = "matchPatentFamilyProcessingResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public MatchPatentFamilyProcessingResponse submitMatchPatentFamilyProcessing(

        @WebParam(partName = "parameters", name = "matchPatentFamilyProcessingRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.MatchPatentFamily parameters
    );

    @WebMethod(operationName = "SubmitInputOrderCARIdsRetrieval", action = "inputOrderCARIdsRetrieval")
    @WebResult(name = "inputOrderCARIdsRetrievalResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public InputOrderCARIdsRetrievalResponse submitInputOrderCARIdsRetrieval(

        @WebParam(partName = "parameters", name = "inputOrderCARIdsRetrievalRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.InputOrderCARIdsRetrievalRequest parameters
    );

    @WebMethod(operationName = "SubmitDecideNextActivity", action = "decideNextActivity")
    @WebResult(name = "decideNextActivityResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public DecideNextActivityResponse submitDecideNextActivity(

        @WebParam(partName = "parameters", name = "decideNextActivityRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );

    @WebMethod(operationName = "SubmitUploadInputOrder", action = "uploadInputOrder")
    @WebResult(name = "uploadInputOrderResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public UploadInputOrderResponse submitUploadInputOrder(

        @WebParam(partName = "parameters", name = "uploadInputOrderRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );

    @WebMethod(operationName = "SubmitPatentCARInformation", action = "patentCARInformation")
    @WebResult(name = "patentCARInformationResponse", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1", partName = "parameters")
    public PatentCARInformationResponse submitPatentCARInformation(

        @WebParam(partName = "parameters", name = "patentCARInformationRequest", targetNamespace = "http://www.elsevier.com/opsbank2/inputservice/v1")
        com.elsevier.opsbank2.input.v1.OPSBankInput parameters
    );
}
