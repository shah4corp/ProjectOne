package com.shah.selenium.automation18032019;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
public class BaseEngine {
	private static WebDriver driver;
    private static String baseDir;
	private static String tcName;
	@Parameters("browser")
	@BeforeSuite
public void launchBrowser(@Optional("chrome")String browser) {
		baseDir = System.getProperty("user.dir");
if(browser.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\workspace\\ProjectOne\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	initActivities();
	}
else if(browser.equalsIgnoreCase("firefox"))
	{
	driver = new FirefoxDriver();
	initActivities();
   }

	else {
		if(browser.equalsIgnoreCase("ie"))
		{
		System.setProperty("webdriver.ie.driver", baseDir + "\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		initActivities();
	}
		else{
			if(browser.equalsIgnoreCase("phantomjs"))
			{
			System.setProperty("phantomjs.binary.path", baseDir+"\\Drivers\\phantomjs.exe");
			driver = new InternetExplorerDriver();
			initActivities();
			}
			
		}			
}
}
   public void initActivities() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
}

@AfterSuite
public void closeBrowser() {
	if(driver!=null){
		driver.close();
	}
	else {
		System.out.println("Driver is ponting to NULL : @AfterSuite");
	}
}

@BeforeMethod
public void beforeTcExecution(Method method) {
	tcName = method.getName();
	System.out.println("CURRENTLY EXECUTING TC IS: " +tcName);
}
   
@AfterMethod
public void afterTcExeution(ITestResult itr) throws IOException {
if(ITestResult.SUCCESS==itr.getStatus()){
	System.out.println("TC IS PASSED: " + tcName);
}
else if(ITestResult.SUCCESS==itr.getStatus()){
	System.out.println("TC IS FAILED: " + tcName + "SO TAKING SCREENSHOT");
	ScreenshotUtility.screenshot();
}
else if (itr.getStatus()==ITestResult.SKIP) {
	System.out.println("TC IS SKIPPED: " + tcName + "SO TAKING SCREENSHOT");
	ScreenshotUtility.screenshot();
}
}
   
public static String getBaseDir() {
	return baseDir;
}
 
public static WebDriver getDriver() {
	return driver;
}

public static String getTcName() {
	return tcName;
}
   
@org.testng.annotations.BeforeTest
public void intialiseReports() {
	
}
@org.testng.annotations.AfterTest
public void generateReports() {
	
}
   
}
