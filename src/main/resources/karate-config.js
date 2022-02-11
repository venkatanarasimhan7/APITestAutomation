function fn() {
  karate.configure('connectTimeout', 10000);
  karate.configure('readTimeout', 10000);
  var env = 'OBUAT';
  var config = {		  
		  apiURL : 'https://input-rest-service-ob2ci.apps.ose-nonprod.cp.tio.systems/ob2/dev/OB2ARTStructureReferences',
          inputServiceWsdl : 'https://input-soap-service-ob2sit.apps.ose-nonprod.cp.tio.systems/cxf/ob2/inputService/?wsdl',
          outputOrderIntegServiceWSDL : 'https://output-order-soap-proxy-service-ob2sit.apps.ose-nonprod.cp.tio.systems/ob2/outputOrderIntegService/?wsdl',
          interfaceRunServiceSDL : 'https://supporting-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/interfaceRunService/?wsdl',
          outputDeliveryServiceWSDL : 'https://output-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/outputDeliveryService/?wsdl'
  };
  switch(env){
  	case 'OBUAT':
	   config.apiURL = 'https://opsbank-input-rest-service-ob2uat.apps.ose-nonprod.cp.tio.systems',
	    outputOrderIntegServiceWSDL = 'https://output-order-soap-proxy-service-ob2sit.apps.ose-nonprod.cp.tio.systems/ob2/outputOrderIntegService/?wsdl',
	    outputDeliveryServiceWSDL = 'https://output-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/outputDeliveryService/?wsdl',
	   interfaceRunServiceSDL = 'https://supporting-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/interfaceRunService/?wsdl',
	   inputServiceWsdl = 'https://input-soap-service-ob2sit.apps.ose-nonprod.cp.tio.systems/cxf/ob2/inputService/?wsdl';
	   break;
  	case 'OBSYS3':
  		config.apiURL = 'https://opsbank-input-rest-service-ob2test.apps.ose-nonprod.cp.tio.systems',
  		 outputOrderIntegServiceWSDL = 'https://output-order-soap-proxy-service-ob2sit.apps.ose-nonprod.cp.tio.systems/ob2/outputOrderIntegService/?wsdl',
  		  outputDeliveryServiceWSDL = 'https://output-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/outputDeliveryService/?wsdl',
  		  interfaceRunServiceSDL = 'https://supporting-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/interfaceRunService/?wsdl',
	  inputServiceWsdl = 'https://input-soap-service-ob2sit.apps.ose-nonprod.cp.tio.systems/cxf/ob2/inputService/?wsdl';
	   break;
  	case 'OBDEV1':
  		config.apiURL = 'https://opsbank-input-rest-service-ob2uat.apps.ose-nonprod.cp.tio.systems',
  		 outputOrderIntegServiceWSDL = 'https://output-order-soap-proxy-service-ob2sit.apps.ose-nonprod.cp.tio.systems/ob2/outputOrderIntegService/?wsdl',
  		  outputDeliveryServiceWSDL = 'https://output-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/outputDeliveryService/?wsdl',
        interfaceRunServiceSDL = 'https://supporting-soap-service-ob2uat.apps.ose-nonprod.cp.tio.systems/cxf/ob2/interfaceRunService/?wsdl',
        inputServiceWsdl = 'https://input-soap-service-ob2sit.apps.ose-nonprod.cp.tio.systems/cxf/ob2/inputService/?wsdl';
  }
  return config;
}
