package com.shah.automation.selenium.ITestListener12_03_2019;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseUtilility
{
	private static String baseDir;
	private static WebDriver driver;
	private static String tcName;
	@BeforeSuite
	public static void launchBrowser(String browser) {
     baseDir = System.getProperty("user.dir");
     if(browser.equalsIgnoreCase("chrome")){
     System.setProperty("webdriver.chrome.driver", baseDir+"\\Drivers\\chromedriver.exe");
     driver = new ChromeDriver();
     initActivities();
     }
     else if(browser.equalsIgnoreCase("chrome"))
     {
    	 System.setProperty("webdriver.ie.driver", baseDir+"\\Drivers\\IEDriverServer.exe");
         driver = new InternetExplorerDriver(); 
         initActivities(); 
     }
     else if(browser.equalsIgnoreCase("phantomjs"))
     {
    	 System.setProperty("phantomjs.binary.path", baseDir+"\\Drivers\\phantomjs.exe");
         driver = new PhantomJSDriver(); 
         initActivities();
     }
     else if (browser.equalsIgnoreCase("headless")) {
			driver = new HtmlUnitDriver();
	        initActivities();	
		}
	}
    public static void initActivities() {
    	driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
	}
    
    @AfterSuite
    public void closeBrowser() {
    if(driver!=null)
    {
    	driver.close();
    }
    else 
    {
    	System.out.println("Driver is pointing to NULL: @AfterSuite");
    }
   }
    
    @BeforeMethod
    public void beforeTcExecutuion(Method method) {
    	tcName = method.getName();
        System.out.println("The method name is: "+ tcName);
	}
    
    @AfterMethod
    public void afterTcExecution(ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.SUCCESS)
        {
			System.out.println("TC IS PASSED: " + tcName);
        }
        else if (result.getStatus()==ITestResult.FAILURE) {
			System.out.println("TC IS FAILED: " + tcName + "SO TAKING SCREENSHOT");
			ScreenshotUtility.screenShot(tcName,getDriver());
		}
		else if (result.getStatus()==ITestResult.SKIP) {
			System.out.println("TC IS SKIPPED: " + tcName + "SO TAKING SCREENSHOT");
			ScreenshotUtility.screenShot(tcName,getDriver());
		}	
	}
     
    @BeforeTest
	public void intialiseReports() {
		
	}
	@AfterTest
	public void generateReports() {
		
	}    
    
	public static WebDriver getDriver(){
		return driver;
	}	
	
	public static String getBaseDir(){
		return baseDir;
	}
	
	public static String getTCName(){
		return tcName;
	}
	
    
}