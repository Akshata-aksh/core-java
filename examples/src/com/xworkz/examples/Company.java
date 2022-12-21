package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {

  public static void main(String args) {
	
	ArrayList<String> soft = new ArrayList<String>();
	soft.add("Infosys");
	soft.add("Quest");
	soft.add("Capgemin");
	soft.add("TCS");
	soft.add("Wipro");
	soft.add("Microsoft");
	soft.add("Tremplin");
	soft.add("Oracle");
	soft.add("IBM");
	soft.add("Google");
	soft.add("Nokia");
	soft.add("CSC");
	soft.add("Cadence");
	soft.add("Infotech");
	soft.add("HTMT");
	soft.add("HCL");
	soft.add("L&T");
	soft.add("Mphasis");
	soft.add("LG");
	soft.add("acer");
	
	 Iterator<String> elem = soft.iterator();
	 while(elem.hasNext()) {
		 System.out.println(elem.next());
	 }
	 

for(String element : soft) {
	System.out.println(element);
}

}
}