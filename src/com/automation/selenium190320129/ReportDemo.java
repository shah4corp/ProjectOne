package com.automation.selenium190320129;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportDemo {
@BeforeMethod
public void method() {
	System.out.println("Before");
}
/*@AfterMethod
public static void screenshot(String fileName, WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File file = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("D:\\"+fileName+".jpeg"));
}
*/@Test
public void verifyTitle() {
	PropertyConfigurator.configure("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\automation\\selenium190320129\\log4j.properties");
	ExtentReports extent1 = new ExtentReports("C:\\Users\\user\\Desktop\\edit\\Title.html");
	ExtentTest logger = extent1.startTest("DemoExtentReport");
	WebDriver driver = new FirefoxDriver();
	logger.log(LogStatus.INFO, "Browser is launched");
	driver.manage().window().maximize();
	logger.log(LogStatus.INFO, "Browser is maximised");
	driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	String title = driver.getTitle();
	Assert.assertTrue(title.contains("Gmail"));
	logger.log(LogStatus.INFO, "Gmail page verified");
	logger.log(LogStatus.PASS,"Test case is passed");
	extent1.flush();
	
}

















































}
