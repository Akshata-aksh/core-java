package com.xworkz.inheritance.flowers;

public class Flower {
	
	String name;
	public String colour;
	
	public  void toGetFlower(String colour) {
	System.out.println("To decorate the god");
			this.colour =colour;
		}
		
		public void presenting(String colour, Flower togod) {
			
			System.out.println("Presenting the flower....");
			
			toGetFlower(colour);
			togod.toGetFlower(colour);
			
			
			System.out.println("flower is presented");
			
		}
		
	
	}
	


