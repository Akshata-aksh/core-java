package com.xworkz.place;

public class ChamarajanagarTester {
	
	public  static void main(String [] args) {
		
		Chamarajanagar ref =new Chamarajanagar();
		ref.visit("Chamundeshwari temple");
		System.out.println("visit to "+ref.temple);
		
		Chamarajanagar cham = new Chamarajanagar();
	    cham.presenting("Hanuman", cham);
		System.out.println("visit to"+ cham.temple);
		
		Chamarajanagar temp = new Chamarajanagar();
		temp.presenting("mall", cham);
		System.out.println("visit to "+ temp.temple);
		
		
		
	}

}