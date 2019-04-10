package com.shah.selenium.automation18032019;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GmailLogin extends BaseEngine {
	@Test
	public void gmailLoginTest(){
		BaseEngine.getDriver().navigate().to("https://www.gmail.com"); 
		BaseEngine.getDriver().findElement(By.id("Email")).sendKeys("shah4corp@gmail.com");
	}

}
