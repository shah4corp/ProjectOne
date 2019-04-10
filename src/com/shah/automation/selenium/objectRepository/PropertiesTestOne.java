package com.shah.automation.selenium.objectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTestOne {
public static void main(String[] args) throws IOException {
	FileInputStream fip = new FileInputStream("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\shah\\automation\\selenium\\objectRepository\\Gmail_OR.properties");
    
	Properties properties = new Properties();
    properties.load(fip);

    String gh_un_id_value =properties.getProperty("gh_un_id_value1");
    String gh_next_id_value =properties.getProperty("gh_next_id_value1");
    String gh_pwd_value =properties.getProperty("gh_pwd_value1");
    
    System.out.println(gh_un_id_value);
    System.out.println(gh_next_id_value);
    System.out.println(gh_pwd_value);
    

    properties.setProperty("job", "Practice");
    properties.setProperty("name", "shahnawaz");
    properties.setProperty("course", "selenium");
    FileOutputStream fop = new FileOutputStream("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\shah\\automation\\selenium\\objectRepository\\Gmail_OR.properties");
  
    properties.store(fop, "file load successfull");
    
    String Job1= properties.getProperty("Job");
    properties.load(fip);
    System.out.println(Job1);
    


}
}
