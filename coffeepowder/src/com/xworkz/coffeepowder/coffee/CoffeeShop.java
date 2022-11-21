package com.xworkz.coffeepowder.coffee;


public class CoffeeShop {
public int price;
	
	public boolean filter(Coffee coffee) {
		boolean isFilter=false;
		if(price == 10) {
			System.out.println("amount is paid");
			if(coffee!= null) {
				this.coffee = coffee;
				System.out.println("");
				this.coffee.displayDetails();
				isFilter = true;
				System.out.println();
			}
			else {
				System.out.println();
			}
		}
		return isFilter;
				
		

		
	}

}


