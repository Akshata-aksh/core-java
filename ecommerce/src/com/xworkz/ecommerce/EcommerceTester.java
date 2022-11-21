package com.xworkz.ecommerce;


public class EcommerceTester {
	
	public static void main(String args[]) {
		
		Ecommerce eco = new Ecommerce();
		eco.shopping("Computer");
		System.out.println("purchasing " +eco.products);
		Ecommerce another = new Ecommerce();
		another.shopping("mouse");
		System.out.println("purchasing "+ another.products);
	}

}
