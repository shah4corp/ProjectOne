package com.shah.selenium.automation.testListenerAdapter;

import java.io.IOException;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
//ListenerAdapterTest can be any class name
public class ListenerAdapterTest extends TestListenerAdapter{
@Override
//itr is any name that is variable name
public void onTestFailure(ITestResult itr)
{
//in the below method we have itr to holds name that can be accessed using getName() 
	try {
	ScreenshotUtility.screenShot(itr.getName(), DriverUtility.getDriver());
} catch (IOException e) {
System.out.println("the test executed successfully");}
}
}

