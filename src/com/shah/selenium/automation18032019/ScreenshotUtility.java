package com.shah.selenium.automation18032019;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public interface ScreenshotUtility {

	public static String screenshot() throws IOException {
		 String loc= BaseEngine.getBaseDir()+"\\screenshot\\"+BaseEngine.getTcName()+".jpeg";
		 TakesScreenshot takesScreenshot = (TakesScreenshot) BaseEngine.getDriver();
		 File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File("D:\\screenshot.jpeg"));
		 return loc;
	}
}
