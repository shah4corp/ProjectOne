package com.shah.selenium.automationcorp;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTest {
RemoteWebDriver driver;
@Test
public void logIn() throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\workspace\\ProjectOne\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.gmail.com");
driver.findElement(By.id("identifieId")).sendKeys("shah4corp@gmail.com");

}
	@BeforeMethod
	public void beforeLogin(Method m) {
 System.out.println("executing thr test case :" + m.getName());
}
	
@AfterMethod
public void AfterMethod(ITestResult result) throws IOException {
if(ITestResult.FAILURE==result.getStatus()){
	ScreenshotUtility.Shah(driver, result.getName());
}
}
	
}
