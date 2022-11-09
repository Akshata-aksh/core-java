package com.xworkz.inheritanceapp.busstop;

public class BusStop {

	public int noOfPlatform;
	
	public void toPicUpPassngers(int noOfPlatform) {
		
		this.noOfPlatform = noOfPlatform;
		System.out.println("Your bus ready to go....");
	}
}
