//yagausyakhwajayaraza
package com.shah.automation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.swing.filechooser.FileNameExtensionFilter;

public class PropertiesReusables {
	private String fileName;
	private static Properties properties;
	private static FileInputStream fip;
	private static FileOutputStream fop;
	private String value;
	
	//constructor to load file and validate whether file is available or not else throw exception
	public PropertiesReusables(String fileName) throws Exception{
		FileInputStream fip = new FileInputStream(fileName);
		Properties properties = new Properties();
	    properties.load(fip);
	    if(properties!=null){
	    	System.out.println("Properties object is available");
	    }
	    else 
	    {
	    	//throws Exception;
	    }
	    }
	//getproperty
	public String getPropertyValue(String key) {
	String value = properties.getProperty(key);
	return value;
	}
	public String getPropertyValue(String key, String defaultValue){
    String vlaue = properties.getProperty(key);
    if (value==null)
    {
    	value = defaultValue;
    	System.out.println("Key is not available with value :" +value);
    }
    else {
		System.out.println("key is available with value :" +value);
	}
    return value;
	}
	public String getPropertyValue(Object key)
	{
		String value = (String) properties.get(key);
		return value;
	}
	public String getPropertyValue(Object key,Object defaultValue)
	{
		String value = (String) properties.get(key);
		if(value==null){
			value = (String) defaultValue;
			System.out.println("key is not having value : "+ value);
		}
		else {
			System.out.println("key is having a value :"+ value);
		}
		return value;
	}
	
	
	//setproperty
	public void setPropertyKeyValue(String key,String value) throws IOException {
	    properties.setProperty(key, value);
		fop = new FileOutputStream(fileName);
	    properties.store(fop, "vlaue mapped to key added to file successfully");
	}
	
	public void removeEntry(String key) throws IOException{
		properties.remove(key);
		fop = new FileOutputStream(fileName);
		properties.store(fop, "file removed successfully");
	}
	public void removeEntry(String key, String value) throws IOException{
		properties.remove(key,value);
		fop = new FileOutputStream(fileName);
		properties.store(fop, "file removed successfully");
	}
	
	public Map<String, String> getAllEntries() {
		Map<String , String> map = new LinkedHashMap<String, String>();
		Set<Object> keys = properties.keySet();
		for(Object key : keys){
			 String key1 = (String) key;
			 String value = properties.getProperty(key1);
			 map.put(key1, value);
		}
		 return map;
	}


	public static void main(String[] args) throws Throwable {
		PropertiesReusables pr = new PropertiesReusables("");
		Map<String, String> entries = pr.getAllEntries();
		
		Set<String> keys = entries.keySet();
		for(String key : keys)
		{
			if (key.equalsIgnoreCase("job")||key.equalsIgnoreCase("practice")) {
				String value = pr.getPropertyValue(key);
		
	}
		}

	}}