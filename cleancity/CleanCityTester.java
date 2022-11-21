package com.xworkz.inheritanceapp.cleancity;

public class CleanCityTester {

	public static void main(String[] args) {
		
		CleanCity city = new CleanCity();
		city.gotCertified(2021);
		System.out.println("Mudhol city is got a award as clean city in the year "+ city.awardGivenInYear);
		
		Mysore mysore = new Mysore();
		mysore.gotCertified(2011);
		System.out.println("It is awarded as clean city in the year "+ mysore.awardGivenInYear);
	}
}
