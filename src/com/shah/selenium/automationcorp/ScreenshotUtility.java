package com.shah.selenium.automationcorp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface ScreenshotUtility {

	public static void Shah(RemoteWebDriver driver, String Imagename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\"+ Imagename +".jpeg"));
	}
	
}
