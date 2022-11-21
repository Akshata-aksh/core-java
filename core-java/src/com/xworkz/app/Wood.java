package com.xworkz.app;

public class Wood {
	
 private int id;
 private  String name;
 
 public Wood() {
	 System.out.println("Wood");
 }
 
 public void setId(int i) {
	 id=i;
	 
 }
 
 public int getId() {
	 return id;
 }
 public void setName(String nm ) {
	 name = nm;
 }
 
 public String getName() {
	 return name;
 }
}
