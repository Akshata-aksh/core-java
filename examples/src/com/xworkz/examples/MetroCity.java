package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class MetroCity {

public static void main(String args[]) {
	
	ArrayList<String> metro = new ArrayList<String>();
	metro.add("Mumbai");
	metro.add("Bengaluru");
	metro.add("Chennai");
	metro.add("Kolkata");
	metro.add("Hyderabad");
	metro.add("Pune");
	
	 Iterator<String> i = metro.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }
	 

for(String element : metro) {
	System.out.println(element);
}

}
}
