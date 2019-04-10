package com.shah.automation.selenium.ITestListener12_03_2019;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GmailLoginTest {
	@Test
	private void gmailLogin() {
    BaseUtilility.launchBrowser("chrome");
    BaseUtilility.getDriver().get("https://www.gmail.com");
    BaseUtilility.getDriver().findElement(By.id("identifierd")).sendKeys("shah4corp");
	}
}





