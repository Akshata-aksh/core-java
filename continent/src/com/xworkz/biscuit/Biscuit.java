package com.xworkz.biscuit;


public class Biscuit {
	public String name;
	public String fresh ;
	
	public void eat(String fresh) {
		
		System.out.println("visit to" + fresh);
		this.fresh = fresh;
			
	}
	public void toGetEnergy(String fresh, Biscuit ref) {
	eat(fresh);
	ref.eat(fresh);
	}


}
