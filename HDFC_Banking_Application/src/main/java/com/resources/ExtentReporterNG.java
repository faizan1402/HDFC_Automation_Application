package com.resources;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG  {

	
	public static ExtentReports getReportObject() {
		
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		//ExtentSparkReporter basically to create the html report
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		// Report Name -> customize config
		reporter.config().setReportName("Web Automation Results");
		// Report Title -> customize config
		reporter.config().setDocumentTitle("Test Results");
		
		//ExtentReports is the attach the ExtentReports
		ExtentReports extent = new ExtentReports(); //-> this is the main class 
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Rahul Shetty");
		return extent;
		
	}
	
}
