package com.xworkz.inheritance.ecommerce;

public class ECommerce {

	public String name;
	public String purchase;
	
	public void shopping(String purchase) {
		
		System.out.println("Your oreder "+ purchase + " is delivered");
		this.purchase =purchase;
	}
	
	public void presenting(String purchase, ECommerce toSister) {
		
		System.out.println("Presenting the gift....");
		
		shopping(purchase);
		toSister.shopping(purchase);
		
		
		System.out.println("Gift is presented");
		
	}
	
}
