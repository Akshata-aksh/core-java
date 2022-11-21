package com.xworkz.inheritanceapp.documentory;

public class Tester {

	public static void main(String[] args) {
		
		Documentory doc = new Documentory();
		doc.wildlife("Bear Grill");
		System.out.println(doc.nameOfTheDocumentorer +" He done a documentory on tiger reserve");
		
		GandhadGudi gudi = new GandhadGudi();
		gudi.wildlife("Puneet Raj Kumar");
		System.out.println("GandhadGudi is documentory done by "+ gudi.nameOfTheDocumentorer);
		
		
	}
}
