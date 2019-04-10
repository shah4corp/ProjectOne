package com.arraycollectionfrmwrk.selenium.automation;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CollectionITest{  
    public static void main(String[] arg) 
    { 
        Map<String,String> gfg = new HashMap<String,String>(); 
      
        // enter name/url pair 
        gfg.put("GFG", "geeksforgeeks.org"); 
        gfg.put("Practice", "practice.geeksforgeeks.org"); 
        gfg.put("Code", "code.geeksforgeeks.org"); 
        gfg.put("Quiz", "quiz.geeksforgeeks.org"); 
          
        // using for-each loop for iteration over Map.entrySet() 
        for (Map.Entry<String,String> entry : gfg.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
}
}
