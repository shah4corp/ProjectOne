package com.automation.selenium190320129;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportTest {

public static void main(String[] args) {
	ExtentReports extentReports = new ExtentReports("C:\\Users\\user\\workspace\\ProjectOne\\Reports\\report.html");
	extentReports.assignProject("FP");
	
	//ExtentTest extentTest = extentReports.startTest("test","this is the....");
	com.relevantcodes.extentreports.ExtentTest extentTest = extentReports.startTest("test");
	
	extentTest.log(LogStatus.INFO, "browser is opened");
	extentTest.log(LogStatus.INFO, "uesrname is entered");
	
	extentReports.flush();
	extentReports.endTest(extentTest);
	
	
	
	
	
	
	
	
	
	
	
	
}

}
