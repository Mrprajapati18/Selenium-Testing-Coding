package UtilityLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportsSetUp extends BaseClass{
	
	public static ExtentReports setUp(String reportName)
	{
		ExtentReports extentReports = new ExtentReports();
		
		String destPath = System.getProperty("user.dir")+"//ExtentReports//"
		+DateAndTime.captureCurrentYear()+"//"+DateAndTime.captureMonthAndYear()
		+"//"+reportName+DateAndTime.captureDateAndTime()+".html";
		
		ExtentSparkReporter extentReporter = new ExtentSparkReporter(destPath);
		extentReports.attachReporter(extentReporter);
		
		return extentReports;
	}

}
