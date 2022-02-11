package com.elsevier.runners;

import com.elsevier.common.Utils;
import org.junit.AfterClass;
import org.junit.Test;
import com.intuit.karate.KarateOptions;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class ApiRunners {

@Test
    public void API1() throws Throwable {
        //loadProperties();
        System.out.println("enter class");
        Results results  = Runner.path("classpath:FeatureFiles").tags("@SOAP_TC01_createOutputOrderProcess").parallel(1);
        System.out.println("exit class");
        //Results results = Runner.parallel(getClass(),1);
        //generateReport();
       //assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }

   /* @Test
    public void testParallel() throws Throwable {
        //loadProperties();
        Results results = Runner.path("classpath:FeatureFiles").tags("@Test01_ART").parallel(2);
        //Results results = Runner.parallel(getClass(),1);
        assertTrue(results.getErrorMessages(), results.getFailCount() == 0);
    }*/

    @AfterClass
    public static void finalReport() throws IOException {
        Utils.generateReport();
    }
}
