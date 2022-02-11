
Feature: functional scenarios to automate the cars in datalake scenarios

  Background:
   # * def testData = karate.readAsString('./TestData/InputServiceTestData.json')
    #* def wsdlUrl = inputServiceWsdl
  * string testData = read('./TestData/OutPutOrdeIntegrationServiceTestData.json')

    @SOAP_TC01_createOutputOrderProcess
  Scenario: Retrive and validate the Order ID from createOutputOrderProcess service.

    * def serviceName = 'createOutputOrderProcess';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutputCreationWSDL');
    * def response = classRef.connectToOPTCreation(serviceName,outputOrderIntegServiceWSDL,testData);
    And match response == 'true'

  @SOAP_TC02_createOutputOrderProcess
  Scenario: validate the response from finaliseOutputOrder service.

    * def serviceName = 'finaliseOutputOrder';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutputCreationWSDL');
    * def response = classRef.connectToOPTCreation(serviceName,outputOrderIntegServiceWSDL,testData);
    And match response == 'true'

  @SOAP_TC03_updateOrderType
  Scenario: validate the response from updateOrderType service.

    * def serviceName = 'updateOrderType';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutputCreationWSDL');
    * def response = classRef.connectToOPTCreation(serviceName,outputOrderIntegServiceWSDL,testData);
    And match response == 'true'

  @SOAP_TC04_updateOutputOrderStatus
  Scenario: validate the response from updateOutputOrderStatus service.

    * def serviceName = 'updateOutputOrderStatus';
    * def classRef = Java.type('com.elsevier.connections.ConnectToOutputCreationWSDL');
    * def response = classRef.connectToOPTCreation(serviceName,outputOrderIntegServiceWSDL,testData);
    And match response == 'true'




