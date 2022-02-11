package com.elsevier.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement;
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClientBuilder;
import com.amazonaws.services.simplesystemsmanagement.model.*;
//import com.elsevier.test.gherkin.glue.GenericActionSteps;
//import com.elsevier.test.support.execution.DelayUtility;

public class ParameterStore {
	  static final Logger LOGGER = LogManager.getLogger(ParameterStore.class);
	 public static String getParametrValue(String parameterName, String tester) {
	       
		    AWSSimpleSystemsManagement ssmclient=null;
		    if (!tester.toUpperCase().equals("JENKINS")) {
	             ssmclient = AWSSimpleSystemsManagementClientBuilder.standard().withRegion("eu-west-1").withCredentials(new ProfileCredentialsProvider("svc_ec2_readonly_access")).build();
		    } else {    
		    	ssmclient = AWSSimpleSystemsManagementClientBuilder.standard().withRegion("eu-west-1").build();
		    }
	        GetParametersRequest paramRequest = new GetParametersRequest().withNames(parameterName).withWithDecryption(true);
	        boolean retry = false;
	        GetParametersResult paramResult=null;
	        do {
		        try {
		        	paramResult = ssmclient.getParameters(paramRequest);
		        	retry = false;
		        } catch (Exception e) {
		        	LOGGER.info("Connection to AWS parameter store failed!")  ;
		        	LOGGER.info(e.getMessage())  ;
		        	retry=true;
		        	DelayUtility.applyDelay(3000);
		        }
	        } while (retry);
	        
	        
	        ssmclient.shutdown();
	       
        return paramResult.getParameters().get(0).getValue();
    }
	 
	 public static GetParametersResult getParameters(String tester,List<String> parameterNames) {

	        AWSSimpleSystemsManagement ssmclient=null;
		    if (!tester.toUpperCase().equals("JENKINS")) {
	             ssmclient = AWSSimpleSystemsManagementClientBuilder.standard().withRegion("eu-west-1").withCredentials(new ProfileCredentialsProvider("svc_ec2_readonly_access")).build();
		    } else {    
		    	ssmclient = AWSSimpleSystemsManagementClientBuilder.standard().withRegion("eu-west-1").build();
		    }
	        GetParametersRequest paramRequest = new GetParametersRequest().withNames(parameterNames).withWithDecryption(true);
	        boolean retry = false;
	        GetParametersResult paramResult=null;
	        do {
		        try {
		        	paramResult = ssmclient.getParameters(paramRequest);
		        	retry = false;
		        } catch (Exception e) {
		        	LOGGER.info("Connection to AWS parameter store failed!")  ;
		        	LOGGER.info(e.getMessage())  ;
		        	retry=true;
		        	DelayUtility.applyDelay(3000);
		        }
	        } while (retry);
	        
	        ssmclient.shutdown();

		 return paramResult;
	 }
	 
}
