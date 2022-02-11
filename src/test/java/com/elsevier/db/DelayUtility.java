package com.elsevier.db;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DelayUtility {

	static final Logger LOGGER = LogManager.getLogger(DelayUtility.class);
	
	private static int minDelay = 1000;
	private static int midDelay = 3000;
	private static int maxDelay = 10000;
	
	public static void pressEnterToContinue() {
             LOGGER.info("Press Enter to continue");
             try{System.in.read();}
             catch(Exception e){}
	}
	
	
	public  static void applyQuietDelay(int delayLength) {
		
		try {
			    Thread.sleep(delayLength);
		} catch (Exception e) {
	    	LOGGER.error(e.getMessage().toString());
			LOGGER.error(e.getStackTrace().toString());	
		    Thread.currentThread().interrupt();
		}
		
	}
	
	
	public  static void applyDelay(int delayLength) {
		
		try {
			String pluralSuffix="";
			if (delayLength>=2000) {
				pluralSuffix="s";
			}
			if (delayLength>1000) {
			    LOGGER.info("Waiting for "+delayLength/1000+" second"+pluralSuffix+"...");
			} else {
				LOGGER.info("Waiting for "+delayLength+" mili second"+pluralSuffix+"...");
			}
			    Thread.sleep(delayLength);
		} catch (Exception e) {
	    	LOGGER.error(e.getMessage().toString());
			LOGGER.error(e.getStackTrace().toString());	
		    Thread.currentThread().interrupt();
		}
		
	}
	
	public  static void applyDelay(Long delayLength) {
		
		try {
			String pluralSuffix="";
			if (delayLength>=2000L) {
				pluralSuffix="s";
			}
			LOGGER.info("Waiting for "+delayLength/1000+" second"+pluralSuffix+"...");
		    Thread.sleep(delayLength);
		} catch (Exception e) {
	    	LOGGER.error(e.getMessage().toString());
			LOGGER.error(e.getStackTrace().toString());	
		    Thread.currentThread().interrupt();
		}
		
	}
	
	
	public static void applyMinDelay() {	
         applyDelay(minDelay);
	}
	public static void applyMidDelay() {	
        applyDelay(midDelay);
	}
	public static void applyMaxDelay() {	
        applyDelay(maxDelay);
	}




	/**
	 * @param minDelay the minDelay to set
	 */
	public static void setMinDelay(int minDelay) {
		DelayUtility.minDelay = minDelay;
	}





	/**
	 * @param midDelay the midDelay to set
	 */
	public static void setMidDelay(int midDelay) {
		DelayUtility.midDelay = midDelay;
	}




	/**
	 * @param maxDelay the maxDelay to set
	 */
	public static void setMaxDelay(int maxDelay) {
		DelayUtility.maxDelay = maxDelay;
	}
}
