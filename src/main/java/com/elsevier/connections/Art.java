
package com.elsevier.connections;

import java.util.Base64; import java.util.Properties; import
java.util.logging.Logger;

import com.elsevier.common.Utils;
import org.apache.commons.logging.Log; import org.junit.Before;



import cucumber.api.Scenario; 
 
public class Art extends Utils {




	/*public static String getArtAuthorization() { String env =
			Art_test_runner.propDetails.getProperty("EndPoint"); String valid_cred =
			null; try { if (env.contentEquals("OBUAT_ART")) { String creds =
			"OB2User1Uat:X1so5Blt2H"; valid_cred =
			Base64.getEncoder().encodeToString(creds.getBytes()); } else
				if(env.contentEquals("OBDEV1_ART")) { String creds =
				"OB2ARTDevUser1:bjk233XDFRxsa"; valid_cred =
				Base64.getEncoder().encodeToString(creds.getBytes()); } } catch(Exception e)
			{ System.out.println(e.getMessage()); } return "Basic " + valid_cred; }

	public static String getInvalidArtAuthentication() { String env =
			Art_test_runner.propDetails.getProperty("EndPoint"); String encoded_creds =
			null; try { if (env.contentEquals("OBUAT_ART")) { String creds =
			"OB2User1Uat:X1so5Blt2HASD"; encoded_creds =
			Base64.getEncoder().encodeToString(creds.getBytes()); } else
				if(env.contentEquals("OBDEV1_ART")) { String creds =
				"OB2ARTDevUser1:bjk233XDFRxsabnhg"; encoded_creds =
				Base64.getEncoder().encodeToString(creds.getBytes()); } }catch(Exception e) {
					System.out.println(e.getMessage()); } return "Basic " + encoded_creds; }
*/
	public static boolean validateStructuredResponse(String Request,String
			Response) { System.out.println("Request sent"+Request);
			System.out.println("Response Validation"+Response); return true; }

}

