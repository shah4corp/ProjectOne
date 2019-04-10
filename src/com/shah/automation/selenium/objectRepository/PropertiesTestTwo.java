package com.shah.automation.selenium.objectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTestTwo {
	public static void main(String[] args) throws IOException  {
		FileInputStream fip = new FileInputStream("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\shah\\automation\\selenium\\objectRepository\\Gmail_OR.properties");
		
		Properties property = new Properties();
		property.load(fip);
		
		String gmail_username = property.getProperty("gh_un_id1");
		String gmail_next = property.getProperty("gh_next_id1");
		String gmail_password = property.getProperty("gh_pwd_value1");

		System.out.println("");
	}

}
