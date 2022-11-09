package com.xworkz.biscuit;

public class BiscuitTester {
	
public  static void main(String [] args) {
		
		Biscuit cof =new Biscuit();
		cof.eat("biscuits");
		System.out.println("visit to "+cof.fresh);
		
		Biscuit ref = new Biscuit();
	    ref.toGetEnergy("relaxation", ref);
		System.out.println("to get"+ ref.fresh);
		
	    Biscuit temp = new Biscuit();
		temp.toGetEnergy("energy", ref);
		System.out.println("we get "+ temp.fresh);
		
		
		
	}


}
