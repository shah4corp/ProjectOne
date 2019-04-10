package com.shah.selenium.automation.testListenerAdapter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverUtility {
	    //for Tightly encapsulated class we have to give variables as private & we can access outside the class using getter methods
		private static RemoteWebDriver driver;
		//to access launchBrowser in GmailLoginTest we need to give it as static
		public static void launchBrowser(String parameter) {
            if(parameter.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\workspace\\ProjectOne\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
            }
            else if (parameter.equalsIgnoreCase("firefox")) {
           	driver = new FirefoxDriver();
    			}
            else if (parameter.equalsIgnoreCase("ie")) {
    			System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\workspace\\ProjectOne\\Drivers\\IEDriverServer.exe");
            	driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
public static WebDriver getDriver()
{
	return driver;
}
}

