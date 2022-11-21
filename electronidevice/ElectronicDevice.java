package com.xworkz.inheritanceapp.electronidevice;

public class ElectronicDevice {

	String nameOfDevice;
	public String forDailyUse;
	
	public void watchingmovies(String forDailyUse) {
		
		this.forDailyUse = forDailyUse ;
		System.out.println("Using device is "+ forDailyUse); 
	}
	
	
}
