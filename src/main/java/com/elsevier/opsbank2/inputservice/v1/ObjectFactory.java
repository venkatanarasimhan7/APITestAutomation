
package com.elsevier.opsbank2.inputservice.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.elsevier.opsbank2.input.v1.ExportCARFileInfo;
import com.elsevier.opsbank2.input.v1.InputOrderCARIdsRetrievalRequest;
import com.elsevier.opsbank2.input.v1.MatchPatentFamily;
import com.elsevier.opsbank2.input.v1.OPSBankInput;
import com.elsevier.opsbank2.input.v1.PatentDetailsRetrievalRequest;
import com.elsevier.opsbank2.input.v1.RetrieveTPAAndPublisher;
import com.elsevier.opsbank2.input.v1.StopPatentProcessing;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.elsevier.opsbank2.inputservice.v1 package. 
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

    private final static QName _CreateInputOrderRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "createInputOrderRequest");
    private final static QName _GenerateInputFilesRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "generateInputFilesRequest");
    private final static QName _GenerateFilesReply_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "generateFilesReply");
    private final static QName _UploadInputOrderRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "uploadInputOrderRequest");
    private final static QName _UploadOrderReply_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "uploadOrderReply");
    private final static QName _ValidateInputDeliveryRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "validateInputDeliveryRequest");
    private final static QName _ValidateInputDeliveryReply_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "validateInputDeliveryReply");
    private final static QName _RegisterInputDeliveryRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "registerInputDeliveryRequest");
    private final static QName _ProcessInputDeliveryRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "processInputDeliveryRequest");
    private final static QName _ProcessInputDeliveryReply_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "processInputDeliveryReply");
    private final static QName _CloseInputOrderRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "closeInputOrderRequest");
    private final static QName _DecideNextActivityRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "decideNextActivityRequest");
    private final static QName _SimulateCARDeliveryRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "simulateCARDeliveryRequest");
    private final static QName _PatentFamilyProcessingRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "patentFamilyProcessingRequest");
    private final static QName _PatentFamilyProcessingReply_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "patentFamilyProcessingReply");
    private final static QName _PatentCARInformationRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "patentCARInformationRequest");
    private final static QName _MatchPatentFamilyProcessingRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "matchPatentFamilyProcessingRequest");
    private final static QName _MatchPatentFamilyProcessingReply_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "matchPatentFamilyProcessingReply");
    private final static QName _StopPatentProcessingRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "stopPatentProcessingRequest");
    private final static QName _RetrieveTPAAndPublisherRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "retrieveTPAAndPublisherRequest");
    private final static QName _PatentDetailsRetrievalRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "patentDetailsRetrievalRequest");
    private final static QName _InputOrderCARIdsRetrievalRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "inputOrderCARIdsRetrievalRequest");
    private final static QName _ExportCARRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "exportCARRequest");
    private final static QName _ExportCARReply_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "exportCARReply");
    private final static QName _TransformExportedCARRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "transformExportedCARRequest");
    private final static QName _TransformExportedCARReply_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "transformExportedCARReply");
    private final static QName _EmitExhibitEventsRequest_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "emitExhibitEventsRequest");
    private final static QName _EmitExhibitEventsReply_QNAME = new QName("http://www.elsevier.com/opsbank2/inputservice/v1", "emitExhibitEventsReply");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.elsevier.opsbank2.inputservice.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateInputOrderResponse }
     * 
     */
    public CreateInputOrderResponse createCreateInputOrderResponse() {
        return new CreateInputOrderResponse();
    }

    /**
     * Create an instance of {@link GenerateInputFilesResponse }
     * 
     */
    public GenerateInputFilesResponse createGenerateInputFilesResponse() {
        return new GenerateInputFilesResponse();
    }

    /**
     * Create an instance of {@link UploadInputOrderResponse }
     * 
     */
    public UploadInputOrderResponse createUploadInputOrderResponse() {
        return new UploadInputOrderResponse();
    }

    /**
     * Create an instance of {@link ValidateInputDeliveryResponse }
     * 
     */
    public ValidateInputDeliveryResponse createValidateInputDeliveryResponse() {
        return new ValidateInputDeliveryResponse();
    }

    /**
     * Create an instance of {@link RegisterInputDeliveryResponse }
     * 
     */
    public RegisterInputDeliveryResponse createRegisterInputDeliveryResponse() {
        return new RegisterInputDeliveryResponse();
    }

    /**
     * Create an instance of {@link ProcessInputDeliveryResponse }
     * 
     */
    public ProcessInputDeliveryResponse createProcessInputDeliveryResponse() {
        return new ProcessInputDeliveryResponse();
    }

    /**
     * Create an instance of {@link CloseInputOrderResponse }
     * 
     */
    public CloseInputOrderResponse createCloseInputOrderResponse() {
        return new CloseInputOrderResponse();
    }

    /**
     * Create an instance of {@link DecideNextActivityResponse }
     * 
     */
    public DecideNextActivityResponse createDecideNextActivityResponse() {
        return new DecideNextActivityResponse();
    }

    /**
     * Create an instance of {@link SimulateCARDeliveryResponse }
     * 
     */
    public SimulateCARDeliveryResponse createSimulateCARDeliveryResponse() {
        return new SimulateCARDeliveryResponse();
    }

    /**
     * Create an instance of {@link PatentFamilyProcessingResponse }
     * 
     */
    public PatentFamilyProcessingResponse createPatentFamilyProcessingResponse() {
        return new PatentFamilyProcessingResponse();
    }

    /**
     * Create an instance of {@link PatentCARInformationResponse }
     * 
     */
    public PatentCARInformationResponse createPatentCARInformationResponse() {
        return new PatentCARInformationResponse();
    }

    /**
     * Create an instance of {@link MatchPatentFamilyProcessingResponse }
     * 
     */
    public MatchPatentFamilyProcessingResponse createMatchPatentFamilyProcessingResponse() {
        return new MatchPatentFamilyProcessingResponse();
    }

    /**
     * Create an instance of {@link StopPatentProcessingResponse }
     * 
     */
    public StopPatentProcessingResponse createStopPatentProcessingResponse() {
        return new StopPatentProcessingResponse();
    }

    /**
     * Create an instance of {@link RetrieveTPAAndPublisherResponse }
     * 
     */
    public RetrieveTPAAndPublisherResponse createRetrieveTPAAndPublisherResponse() {
        return new RetrieveTPAAndPublisherResponse();
    }

    /**
     * Create an instance of {@link PatentDetailsRetrievalResponse }
     * 
     */
    public PatentDetailsRetrievalResponse createPatentDetailsRetrievalResponse() {
        return new PatentDetailsRetrievalResponse();
    }

    /**
     * Create an instance of {@link InputOrderCARIdsRetrievalResponse }
     * 
     */
    public InputOrderCARIdsRetrievalResponse createInputOrderCARIdsRetrievalResponse() {
        return new InputOrderCARIdsRetrievalResponse();
    }

    /**
     * Create an instance of {@link ExportCARResponse }
     * 
     */
    public ExportCARResponse createExportCARResponse() {
        return new ExportCARResponse();
    }

    /**
     * Create an instance of {@link TransformExportedCARResponse }
     * 
     */
    public TransformExportedCARResponse createTransformExportedCARResponse() {
        return new TransformExportedCARResponse();
    }

    /**
     * Create an instance of {@link EmitExhibitEventsResponse }
     * 
     */
    public EmitExhibitEventsResponse createEmitExhibitEventsResponse() {
        return new EmitExhibitEventsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "createInputOrderRequest")
    public JAXBElement<OPSBankInput> createCreateInputOrderRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_CreateInputOrderRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "generateInputFilesRequest")
    public JAXBElement<OPSBankInput> createGenerateInputFilesRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_GenerateInputFilesRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "generateFilesReply")
    public JAXBElement<OPSBankInput> createGenerateFilesReply(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_GenerateFilesReply_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "uploadInputOrderRequest")
    public JAXBElement<OPSBankInput> createUploadInputOrderRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_UploadInputOrderRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "uploadOrderReply")
    public JAXBElement<OPSBankInput> createUploadOrderReply(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_UploadOrderReply_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "validateInputDeliveryRequest")
    public JAXBElement<OPSBankInput> createValidateInputDeliveryRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_ValidateInputDeliveryRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "validateInputDeliveryReply")
    public JAXBElement<OPSBankInput> createValidateInputDeliveryReply(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_ValidateInputDeliveryReply_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "registerInputDeliveryRequest")
    public JAXBElement<OPSBankInput> createRegisterInputDeliveryRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_RegisterInputDeliveryRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "processInputDeliveryRequest")
    public JAXBElement<OPSBankInput> createProcessInputDeliveryRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_ProcessInputDeliveryRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "processInputDeliveryReply")
    public JAXBElement<OPSBankInput> createProcessInputDeliveryReply(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_ProcessInputDeliveryReply_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "closeInputOrderRequest")
    public JAXBElement<OPSBankInput> createCloseInputOrderRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_CloseInputOrderRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "decideNextActivityRequest")
    public JAXBElement<OPSBankInput> createDecideNextActivityRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_DecideNextActivityRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "simulateCARDeliveryRequest")
    public JAXBElement<OPSBankInput> createSimulateCARDeliveryRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_SimulateCARDeliveryRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "patentFamilyProcessingRequest")
    public JAXBElement<OPSBankInput> createPatentFamilyProcessingRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_PatentFamilyProcessingRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "patentFamilyProcessingReply")
    public JAXBElement<OPSBankInput> createPatentFamilyProcessingReply(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_PatentFamilyProcessingReply_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "patentCARInformationRequest")
    public JAXBElement<OPSBankInput> createPatentCARInformationRequest(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_PatentCARInformationRequest_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchPatentFamily }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MatchPatentFamily }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "matchPatentFamilyProcessingRequest")
    public JAXBElement<MatchPatentFamily> createMatchPatentFamilyProcessingRequest(MatchPatentFamily value) {
        return new JAXBElement<MatchPatentFamily>(_MatchPatentFamilyProcessingRequest_QNAME, MatchPatentFamily.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OPSBankInput }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "matchPatentFamilyProcessingReply")
    public JAXBElement<OPSBankInput> createMatchPatentFamilyProcessingReply(OPSBankInput value) {
        return new JAXBElement<OPSBankInput>(_MatchPatentFamilyProcessingReply_QNAME, OPSBankInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPatentProcessing }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopPatentProcessing }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "stopPatentProcessingRequest")
    public JAXBElement<StopPatentProcessing> createStopPatentProcessingRequest(StopPatentProcessing value) {
        return new JAXBElement<StopPatentProcessing>(_StopPatentProcessingRequest_QNAME, StopPatentProcessing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveTPAAndPublisher }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveTPAAndPublisher }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "retrieveTPAAndPublisherRequest")
    public JAXBElement<RetrieveTPAAndPublisher> createRetrieveTPAAndPublisherRequest(RetrieveTPAAndPublisher value) {
        return new JAXBElement<RetrieveTPAAndPublisher>(_RetrieveTPAAndPublisherRequest_QNAME, RetrieveTPAAndPublisher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PatentDetailsRetrievalRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PatentDetailsRetrievalRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "patentDetailsRetrievalRequest")
    public JAXBElement<PatentDetailsRetrievalRequest> createPatentDetailsRetrievalRequest(PatentDetailsRetrievalRequest value) {
        return new JAXBElement<PatentDetailsRetrievalRequest>(_PatentDetailsRetrievalRequest_QNAME, PatentDetailsRetrievalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputOrderCARIdsRetrievalRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InputOrderCARIdsRetrievalRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "inputOrderCARIdsRetrievalRequest")
    public JAXBElement<InputOrderCARIdsRetrievalRequest> createInputOrderCARIdsRetrievalRequest(InputOrderCARIdsRetrievalRequest value) {
        return new JAXBElement<InputOrderCARIdsRetrievalRequest>(_InputOrderCARIdsRetrievalRequest_QNAME, InputOrderCARIdsRetrievalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "exportCARRequest")
    public JAXBElement<ExportCARFileInfo> createExportCARRequest(ExportCARFileInfo value) {
        return new JAXBElement<ExportCARFileInfo>(_ExportCARRequest_QNAME, ExportCARFileInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "exportCARReply")
    public JAXBElement<ExportCARFileInfo> createExportCARReply(ExportCARFileInfo value) {
        return new JAXBElement<ExportCARFileInfo>(_ExportCARReply_QNAME, ExportCARFileInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "transformExportedCARRequest")
    public JAXBElement<ExportCARFileInfo> createTransformExportedCARRequest(ExportCARFileInfo value) {
        return new JAXBElement<ExportCARFileInfo>(_TransformExportedCARRequest_QNAME, ExportCARFileInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "transformExportedCARReply")
    public JAXBElement<ExportCARFileInfo> createTransformExportedCARReply(ExportCARFileInfo value) {
        return new JAXBElement<ExportCARFileInfo>(_TransformExportedCARReply_QNAME, ExportCARFileInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "emitExhibitEventsRequest")
    public JAXBElement<ExportCARFileInfo> createEmitExhibitEventsRequest(ExportCARFileInfo value) {
        return new JAXBElement<ExportCARFileInfo>(_EmitExhibitEventsRequest_QNAME, ExportCARFileInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportCARFileInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.elsevier.com/opsbank2/inputservice/v1", name = "emitExhibitEventsReply")
    public JAXBElement<ExportCARFileInfo> createEmitExhibitEventsReply(ExportCARFileInfo value) {
        return new JAXBElement<ExportCARFileInfo>(_EmitExhibitEventsReply_QNAME, ExportCARFileInfo.class, null, value);
    }

}
