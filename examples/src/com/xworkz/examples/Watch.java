package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class Watch {
 public static void main(String args) {
	 
	 ArrayList<String> watch = new ArrayList<String>();
	 watch.add("Titan");
	 watch.add("Fastrack");
	 watch.add("Sonata");
	 watch.add("Mi");
	 watch.add("Casio");
	 
	 Iterator<String> i = watch.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }
	 

for(String element : watch) {
	System.out.println(element);
}

	 
 }
}
