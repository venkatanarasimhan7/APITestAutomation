Feature: Functional scenarios for all the services in OUTPUTPROCESS SOAP WSDL.

  Background:
    * string testData = read('./TestData/OutputDeliveryService.json')

  @SOAP_TC01_RegisterDataDelivery
  Scenario: validate the response for RegisterDataDelivery service.

    * def serviceName = 'RegisterDataDelivery';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutPutProcessSoap');
    * def response = classRef.connectToOPTCreation(serviceName,outputDeliveryServiceWSDL,testData);
    And match response == 'true'

  @SOAP_TC02_SubmitCancelDataDelivery
  Scenario: validate the response for SubmitCancelDataDelivery service.

    * def serviceName = 'SubmitCancelDataDelivery';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutPutProcessSoap');
    * def response = classRef.connectToOPTCreation(serviceName,outputDeliveryServiceWSDL,testData);
    And match response == 'true'

  @SOAP_TC03_SubmitDeliverOutputOrderDataFilesToCustomer
  Scenario: validate the response for RegisterDataDelivery service.

    * def serviceName = 'SubmitDeliverOutputOrderDataFilesToCustomer';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutPutProcessSoap');
    * def response = classRef.connectToOPTCreation(serviceName,outputDeliveryServiceWSDL,testData);
    And match response == 'true'

  @SOAP_TC04_SubmitGetPostProcessStatus
  Scenario: validate the response for SubmitGetPostProcessStatus service.

    * def serviceName = 'SubmitGetPostProcessStatus';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutPutProcessSoap');
    * def response = classRef.connectToOPTCreation(serviceName,outputDeliveryServiceWSDL,testData);
    And match response == 'true'


  @SOAP_TC05_SubmitGetUserAndOrderInfo
  Scenario: validate the response for SubmitGetUserAndOrderInfo service.

    * def serviceName = 'SubmitGetUserAndOrderInfo';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutPutProcessSoap');
    * def response = classRef.connectToOPTCreation(serviceName,outputDeliveryServiceWSDL,testData);
    And match response == 'true'

  @SOAP_TC06_SubmitGetUserDetails
  Scenario: validate the response for SubmitGetUserDetails service.

    * def serviceName = 'SubmitGetUserDetails';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutPutProcessSoap');
    * def response = classRef.connectToOPTCreation(serviceName,outputDeliveryServiceWSDL,testData);
    And match response == 'true'

  @SOAP_TC07_SubmitRunSearchProfile
  Scenario: validate the response for SubmitRunSearchProfile service.

    * def serviceName = 'SubmitRunSearchProfile';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutPutProcessSoap');
    * def response = classRef.connectToOPTCreation(serviceName,outputDeliveryServiceWSDL,testData);
    And match response == 'true'

  @SOAP_TC08_SubmitSendDeliveryNotificationEmail
  Scenario: validate the response for SubmitRunSearchProfile service.

    * def serviceName = 'SubmitSendDeliveryNotificationEmail';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutPutProcessSoap');
    * def response = classRef.connectToOPTCreation(serviceName,outputDeliveryServiceWSDL,testData);
    And match response == 'true'

  @SOAP_TC09_SubmitStartOutputXMLGeneration
  Scenario: validate the response for SubmitStartOutputXMLGeneration service.

    * def serviceName = 'SubmitStartOutputXMLGeneration';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutPutProcessSoap');
    * def response = classRef.connectToOPTCreation(serviceName,outputDeliveryServiceWSDL,testData);
    And match response == 'true'