package com.automation.selenium190320129;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryTest {
@Test(retryAnalyzer=CostomRetryAnalyzer.class)
public void login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\workspace\\ProjectOne\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	WebElement userName = driver.findElement(By.id("identifier"));
	userName.clear();
	userName.sendKeys("shah4corp@gmail.com");
}
}
