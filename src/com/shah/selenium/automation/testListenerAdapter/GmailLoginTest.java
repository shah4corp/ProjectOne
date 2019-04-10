package com.shah.selenium.automation.testListenerAdapter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.shah.automation.supporters.PropertiesReusables;

public class GmailLoginTest extends PropertiesReusables {
	public GmailLoginTest(String fileName) throws Exception {
		super("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\shah\\automation\\supporters\\hello.txt");
	}

	@Test
public void Gmail_login() {
DriverUtility.launchBrowser("chrome");
DriverUtility.getDriver().get("https://www.gmail.com");
WebElement username = DriverUtility.getDriver().findElement(By.id("identifierId"));
}
}
