#Author: Radhika Sundaramurthy
@FunctionalTests_ART
Feature: Automated Tagging Reference

Background:
	* url apiURL
	* header Authorization = callonce read('basic-auth.js')
	
	
  @Test01_ART
  Scenario Outline: Verify the response schema elements existence for <scenarioName>
    Given path '/ob2/OB2ARTStructureReferences'  
    When request {'art:references': ['<reference>'],'art:correlationID': '<id>'} 
    And def unstructRequest = {'art:references': ['<reference>'],'art:correlationID': '<id>'}
    And method POST
    Then status <status>    
    And def structResponse = response
		And match structResponse == {'art:correlationID': '<id>', 'pav:createdOn': '##present', 'prov:wasAttributedTo': '##present', 'art:version': '##present', 'art:structuredReferences': '##present'}
		And match structResponse contains {'art:structuredReferences': '##notnull'}
		And assert responseTime < 60000
		* def refs = Java.type('com.elsevier.connections.Art');
	  * def result = refs.validateStructuredResponse(unstructRequest,structResponse);
		And match result contains true
		 
		Examples:
    |read('./TestData/TestData.csv')|  
    
    @Test03_ART
    Scenario: Verify the response schema elements existence for references with tags and special characters
    Given path '/ob2/OB2ARTStructureReferences'  
   # When request {'art:references': ["SENG K H, LIU J, GUO Z P, CHEN Z X, JIA D Z, LIU H K. Free-standing V<inf>2</inf>O<inf>5</inf> electrode for flexible lithium ion batteries [J]. Electrochemistry Communications, 2011, 13 (5): 383-386.", "UVB radiation refers to ultraviolet (UV) with wavelength ranging from 280nm to 320nm and plays a major role in vitamin D synthesis, plant growth, and human health. In this article, erythemal weighted UVB irradiance (UVER) is modeled on the Surface Radiation Budget Network (SURFRAD) stations based on the relationship with solar zenith angel (SZA), clearness index (Kt), and ozone (O<inf>3</inf>). Two models are established, one of which can be used when the O<inf>3</inf> information is missing (Model I) and the other one (Model II) takes O<inf>3</inf> into consideration. Verification indicates both Model I and Model II show good performance on Fort Peck, Montana with tiny mean bias error (MBE), within ±0.2%, while Model II performs more stable when verified on all SURFRAD stations, with smaller MBE (-1.61%) and root mean square error (RMSE). By using MODIS downward shortwave radiation (DSR) as model input, a UVER product with a resolution of 5km×5km can be obtained. The MBE of this product on SURFRAD stations is 0.82% and 2.85% for the instantaneous and 3-hour estimation, respectively. And similar result can be obtained on stations of UVB monitoring and research program (UVMRP) maintained by U.S. department of agriculture. Erythemal daily dose (EDD) is further calculated from the hourly UVER product, and the result corresponds to that from measurement within ±10% bias in 33 out of total 35 stations and within ±5% bias in 18 stations. In addition, comparison with OMI product OMUVBd shows that our result corresponds the ground measurements better. Fathani T F, Legono D and Alfath M A 2017 Sensitivity analysis of depth-integrated numerical models for estimating landslide movement Journal of Disaster Research 12 607-616", "Gupta, A. K., Das, M., and Anderson, D. M.: Solar influence on the Indian summer monsoon during the Holocene, Geophys. Res. Lett., 32, L17703, <https://doi.org/10.1029/2005GL022685>https://doi.org/10.1029/2005GL022685</a>, 2005."],'art:correlationID': '10792c64-1850-4909-82d5-03f7f0d75a7b'}
    * def reqJson = read('ArtRequest.json')  
    When request reqJson
    And method POST
    Then status 200
    And def structResponse = response
		And match structResponse == {'art:correlationID': '##present', 'pav:createdOn': '##present', 'prov:wasAttributedTo': '##present', 'art:version': '##present', 'art:structuredReferences': '##present'}
		And match structResponse contains {'art:structuredReferences': '##notnull'}
		And assert responseTime < 60000	
		* def respVal = read('responseVal.json')
	  Then match structResponse contains {'art:correlationID':'#ignore','pav:createdOn':'#ignore','prov:wasAttributedTo':'http://data.elsevier.com/art/structure-references','art:version':'#ignore',['<respVal>']}
		
		@Test04_ART
		Scenario: Verify the response schema elements existence for references with non english characters
    Given path '/ob2/OB2ARTStructureReferences'
    When request {'art:references': ["Арбузова Т. Л., Дулепова Б. И. 1989. Синтаксономия степной растительности Сохондинского заповедника. Класс Cleistogenetea squarrosae Mirk. et al. 1986, порядок Thymetalia gobici Mirk. in Kas. et al. 1987. М. 21 с. Деп. в ВИНИТИ 06.05.1989. № 4687-B89.", "Банникова И. А. 2003. Лесостепь Внутренней Азии: структура и функции. М. 287 с.", "Беликович А. В., Галанин А. В. 2006. Забайкальский харганат как тип растительности Комаровские чтения. Владивосток. Вып. 52. С. 98–126.", "Бухарова Е. В., Намзалов Б. Б. 2016. Абрикосники Западного Забайкалья. Улан-Удэ. 146 с.", "Гоголева П. А., Кононов К. Е., Миркин Б. М., Миронова С. И. 1987. Синтаксономия и симфитосоциология растительности аласов Центральной Якутии. Иркутск. 176 с."],'art:correlationID': '10792c64-1850-4909-82d5-03f7f0d75a7b'} 
    And method POST
    Then status 200 
    And def structResponse = response
		And match structResponse == {'art:correlationID': '##present', 'pav:createdOn': '##present', 'prov:wasAttributedTo': '##present', 'art:version': '##present', 'art:structuredReferences': '##present'}
		And match structResponse contains {'art:structuredReferences': '##notnull'}
		And assert responseTime < 60000	 
  
   @Test05_ART  
   Scenario: Verify the response schema elements existence for 400 Bad Request
    Given path '/ob2/OB2ARTStructureReferences'  
    When request 'Test invalid POST body' 
    And method POST
    Then status 400
    And def resp = response
		And match resp contains {"message":"The request body cannot be structured."}
		
		@Test06_ART
		Scenario: Verify the response when authentication fails with 401 Unauthorized
    Given path '/ob2/OB2ARTStructureReferences'  
    When request {'art:references': ['"Klionsky DJ, Abdalla FC, Abeliovich H, Abraham RT, Acevedo-Arozena A, Adeli K, Agholme L, Agnello M, Agostinis P, Aguirre-Ghiso JA, et al. Guidelines for the use and interpretation of assays for monitoring autophagy. Autophagy 2012; 8:445-544; http://dx.doi.org/10.4161/auto.19496.'],'art:correlationID': '6e2408ff-da3c-4e06-8d33-4e12bed9be83'}
    And header Authorization = call read('invalid-basic-auth.js') 
    And print Authorization
    And method POST
    Then status 401
    
    