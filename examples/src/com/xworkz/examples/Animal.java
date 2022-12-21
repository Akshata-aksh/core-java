package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Iterator;


public class Animal {
 public static void main(String args[]) {
	 
	 ArrayList<String> anim = new ArrayList<String>();
	 anim.add("Elephant");
	 anim.add("Dog");
	 anim.add("Cat");
	 anim.add("Camel");
	 anim.add("Pig");
	 anim.add("Cow");
	 anim.add("Goat");
	 anim.add("Giraffe");
	 anim.add("Lion");
	 anim.add("Tiger");
	 anim.add("Rabbit");
	 
	 Iterator<String> i = anim.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }
	 

for(String element : anim) {
	System.out.println(element);
}
 }
}


