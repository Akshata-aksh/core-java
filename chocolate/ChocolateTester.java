package com.xworkz.inheritanceapp.chocolate;

public class ChocolateTester {

	public static void main(String[] args) {
		
		Chocolate chocolate =new Chocolate();
		chocolate.madeUpOf("Carmel and nuts");
		System.out.println("The chocolate is madeup of "+ chocolate.sweet);
		
		DairyMilk dairyMilk = new DairyMilk();
		dairyMilk.madeUpOf("Fruits and nuts");
		System.out.println("It is made up of "+ dairyMilk.sweet);
		
		
	}
}
