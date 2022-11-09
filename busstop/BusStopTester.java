package com.xworkz.inheritanceapp.busstop;

public class BusStopTester {

	public static void main(String[] args) {
		
		BusStop stop = new BusStop();
		stop.toPicUpPassngers(2);
		System.out.println("Yor bus is at platform no "+ stop.noOfPlatform);
		
		KSRBengaluru mejastic = new KSRBengaluru();
		mejastic.toPicUpPassngers(6);
		System.out.println("The Hydrabad going bus is at platform no "+ mejastic.noOfPlatform);
		
	}
}
