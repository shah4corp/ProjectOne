package com.arraycollectionfrmwrk.selenium.automation;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("Rameshsoft");
		arrayList.add("10");
		arrayList.add("Going");
		arrayList.add("786");
		System.out.println(arrayList);
       ArrayList arrayList1 = new ArrayList<>();
       arrayList1.add("going home");
       arrayList1.add("69");
       System.out.println(arrayList1);
       LinkedList linkedList = new LinkedList();       
       linkedList.add("10");
		linkedList.add("Going");
		linkedList.add("786");
//       linkedList.addFirst("going to get job");
	   linkedList.set(1, "integer");
	   linkedList.removeLast();
	   System.out.println(linkedList);

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
