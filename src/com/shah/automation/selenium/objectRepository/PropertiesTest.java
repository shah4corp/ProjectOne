package com.shah.automation.selenium.objectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertiesTest {
public static void main(String[] args) throws IOException {
	
	FileInputStream fip = new FileInputStream("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\shah\\automation\\selenium\\objectRepository\\Gmail_OR.properties");
	
	Properties properties = new Properties();
	properties.load(fip);
	
	String gh_un_id_Value = properties.getProperty("gh_un_id1","123");
	String gh_next_id = properties.getProperty("gh_next_id");
	String gh_signin_id = properties.getProperty("gh_signin_id1","456");
	
	System.out.println(gh_next_id);
	System.out.println(gh_signin_id);
	System.out.println(gh_un_id_Value);
	
	properties.setProperty("JOB", "PRACTICE");
	properties.setProperty("name", "shahnawaz");
	properties.setProperty("course", "selenium");
	
	FileOutputStream fop = new FileOutputStream("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\shah\\automation\\selenium\\objectRepository\\Gmail_OR.properties");
	properties.store(fop, "file is saved succesfully");	

	System.out.println(gh_next_id);
	System.out.println(gh_signin_id);
	System.out.println(gh_un_id_Value);
	System.out.println(properties.getProperty("job"));
}
}
