package com.xworkz.coffeeShop.coffee;

public class Coffee {
	private String name;
	   private	String labourName[];
		private String location;
		private long mobileNumber;
		
		public Coffee(String name, String [] labourName, String location , long mobileNumber  ) {
		this.name =name;
		this.labourName =labourName;
		this.location = location;
		this.mobileNumber=mobileNumber;
		
		
		
		}
		public void displayDetails() {
		
		System.out.println(" Name: "+ this.name);
		System.out.println("Labour Name: "+ this.labourName+ "Location: "+this.location +": "+ this.mobileNumber);
		for(int i=0; i<labourName.length;i++) {
			System.out.println("Labour name" +this.labourName[i]);
		}
		
		}	
	 

}
