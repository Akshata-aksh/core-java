package com.xworkz.inheritanceapp.electronidevice;

public class ElectronicTester {

	public static void main(String[] args) {
		
		ElectronicDevice device = new ElectronicDevice();
		device.watchingmovies("Laptop");
		System.out.println("Watching movies in "+ device.forDailyUse);
		
		Telivision tv = new Telivision();
		tv.watchingmovies("TV");
		System.out.println("Watching movie in "+ tv.forDailyUse);
		
	}
}
