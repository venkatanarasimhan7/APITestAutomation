
package com.elsevier.common;

import java.io.File; import java.io.FileInputStream; import
java.io.FileNotFoundException; import java.io.IOException; import
java.text.SimpleDateFormat; import java.util.ArrayList; import
java.util.Collection; import java.util.Date; import java.util.List; import
java.util.Properties;

import org.apache.commons.io.FileUtils;

import net.masterthought.cucumber.Configuration; import
net.masterthought.cucumber.ReportBuilder;

public class Utils { private static String appConfigPath =
".\\src\\main\\resources\\Configurations.properties"; public static
Properties propDetails = new Properties();

public static void loadProperties() throws FileNotFoundException, IOException
{ propDetails.load(new FileInputStream(appConfigPath));
System.setProperty("karate.env",propDetails.getProperty("environment")); }

public static void generateReport() throws IOException { File outputFolder =
new File(".\\Reports"); String timeStamp = new
SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date()); Collection<File>
jsonFiles = FileUtils.listFiles(new File(".\\target\\surefire-reports"), new
		String[] {"json"}, true); List<String> jsonPaths = new
		ArrayList(jsonFiles.size()); jsonFiles.forEach(file ->
		jsonPaths.add(file.getAbsolutePath())); Configuration config = new
		Configuration(new File(outputFolder+"/"+"Run_Result"+"_"+timeStamp),
				propDetails.getProperty("ProjectName")); ReportBuilder reportBuilder = new
				ReportBuilder(jsonPaths, config); reportBuilder.generateReports(); }

public Utils() { super(); // TODO Auto-generated constructor stub 
}
}


