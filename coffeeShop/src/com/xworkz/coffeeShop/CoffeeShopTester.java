package com.xworkz.coffeeShop;

import com.xworkz.coffeeShop.coffee.Coffee;
import com.xworkz.coffeeShop.coffee.CoffeeShop;

public class CoffeeShopTester {
	public static void main(String args[]){
	
	String labourName[] = {"ram", "sham", "akash", "veer", "suresh"};
	Coffee coffee = new Coffee("Brahmalingeshwara", labourName, "Vidyagiri bagalkot", 9484774747L);
    CoffeeShop coff = new CoffeeShop();
	coff.price =10;
	boolean isFilter = coff.filter(coffee);
	System.out.println("Allow to the coffee shop"+isFilter);
	
	String labourName1[] = {"akshata", "bhagya","pallavi", "savita", "ritika"};
	Coffee coffee1 = new Coffee("Coffee point", labourName1, "Rajajinagar Bangalore", 947474747474L);
	CoffeeShop cof = new CoffeeShop();
	cof.price = 15;
	boolean isFilter1 = cof.filter(coffee1);
	System.out.println("Allow to the coffee shop"+isFilter1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}