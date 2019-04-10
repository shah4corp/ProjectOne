package com.automation.selenium190320129;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Gmail_Login_fromFILES {
public static void main(String[] args) throws IOException {
	//reading url from config.properties
	File file1 = new File("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\automation\\selenium190320129\\Gmail_Config.properties");
	FileInputStream fip = new FileInputStream(file1);
	Properties p1 = new Properties();
	p1.load(fip);
	String url = p1.getProperty("gmail_url");
	System.out.println("Gmail url is :" + url);
    //reading web elements from OR.properties
	File file2 = new File("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\automation\\selenium190320129\\Gmail_OR.properties");
    FileInputStream fip2 = new FileInputStream(file2);
    Properties p2 = new Properties();
    p2.load(fip2);
    String username = p2.getProperty("gmail_username");
    String next = p2.getProperty("gmail_next");
    String password = p2.getProperty("gmail_password");
    String signin = p2.getProperty("gmail_sign");
    System.out.println(username);
    System.out.println(signin);
    
    //taking or reading test data from excel sheet
    File file3 = new File("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\automation\\selenium190320129\\Gmail.xls");
    FileInputStream fip3 = new FileInputStream(file3);
    Workbook workbook = WorkbookFactory.create(fip3);
    String usernamedata = workbook.getSheet("Gmail_excel").getRow(0).getCell(0).getStringCellValue();
    String passwordata = workbook.getSheet("Gmail_excel").getRow(0).getCell(1).getStringCellValue();
    System.out.println(usernamedata);
}
}
