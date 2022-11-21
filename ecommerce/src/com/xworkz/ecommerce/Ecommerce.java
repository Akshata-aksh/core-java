package com.xworkz.ecommerce;

public class Ecommerce {
	
	String name;
	int quantity;
	public String products;
	
	public String shopping (String products)
	{
		this.products = this.products;
		return this.products;
	}
	public String cart(String products) 
	{
		System.out.println("bill " +products);
		this.products = this.products;
		return this.products;
	}
	
	public void tarnsaction(double amount, Ecommerce another ) {
		System.out.println();
		shopping(amount);
		another.cart(amount);
		System.out.println("product is delivered");
	}
	



