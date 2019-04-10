package com.arraycollectionfrmwrk.selenium.automation;

import java.io.IOException;

import org.testng.annotations.Test;

public class Array {
	@Test
	public void arrayMethod() throws IOException {
		int[] a = new int[5];
        a[0]= 30;
        a[1]= 20;
        int i;
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
//            ScreenshotUtility.takeScreenshot();

        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
