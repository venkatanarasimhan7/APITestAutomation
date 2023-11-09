
Feature: functional scenarios to automate the cars in datalake scenarios

  Background:
   # * def testData = karate.readAsString('./TestData/InputServiceTestData.json')
    #* def wsdlUrl = inputServiceWsdl
  * string testData = read('./TestData/InputServiceTestData.json')

  @SOAP_TC01_submitInputOrderCARIdsRetrieval
  Scenario: Retrive and validate the car ID from submitInputOrderCARIdsRetrieval service.

    * def serviceName = 'submitInputOrderCARIdsRetrieval';
    * def classRef = Java.type('com.elsevier.connections.ConnectToServices');
    * def response = classRef.connectToServices(serviceName,inputServiceWsdl,testData);
    And match response == '930902700'

  @SOAP_TC02_SubmitExportCAR
  Scenario: Retrive and validate the car ID from submitInputOrderCARIdsRetrieval service.

    * def serviceName = 'SubmitExportCAR';
    * def classRef = Java.type('com.elsevier.connections.ConnectToServices');
    * def response = classRef.connectToServices(serviceName,inputServiceWsdl,testData);
    And match response == 'true'

      @EKB_FF_TC01
  Scenario: Hit the harvester and validate the file are dropped in S3 and message posted to content found kafka.

    Given url 'https://dp-content-ekb-api-harvester.content.dev.dp.elsevier.systems/harvest?ekbId=51119'
    When method GET
    Then status 200





