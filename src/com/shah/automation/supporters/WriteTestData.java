package com.shah.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTestData {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\user\\workspace\\ProjectOne\\src\\com\\shah\\automation\\supporters\\hello.txt");
      /*  Boolean b = file.createNewFile();
	    System.out.println(b);
        FileWriter fwriter = new FileWriter(file);
        BufferedWriter bwriter = new BufferedWriter(fwriter);
        bwriter.write(10000 + " rupees");
        bwriter.newLine();
        bwriter.write("shahnawaz you are gem");
        bwriter.flush();	
	*/
		
		FileReader freader = new FileReader(file);
		BufferedReader breader = new BufferedReader(freader);

		String line1 = breader.readLine();
		System.out.println(line1);
		String line2 = breader.readLine();
		System.out.println(line2);
		
	/*while(breader.ready())
		{
			String text = breader.readLine();
			System.out.println(text);
		}*/
	}
}

