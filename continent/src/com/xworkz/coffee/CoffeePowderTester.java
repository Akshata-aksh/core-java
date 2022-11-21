package com.xworkz.coffee;
public class CoffeePowderTester {
public  static void main(String [] args) {
		
		CoffeePowder cof =new CoffeePowder();
		cof.visit("coffee shop");
		System.out.println("visit to "+cof.fresh);
		
		CoffeePowder ref = new CoffeePowder();
	    ref.toGetCoffee("relaxation", ref);
		System.out.println("to get"+ ref.fresh);
		
		Levista temp = new Levista();
		temp.toGetCoffee("energy", ref);
		System.out.println("we get "+ temp.fresh);
		
		
		
	}


}
