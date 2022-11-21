package com.xworkz.place;

public class Chamarajanagar {
	public String name;
	public String temple;
	
	public void visit(String temple) {
		
		System.out.println("visit to" + temple);
		this.temple = temple;
			
	}
	public void presenting (String temple, Chamarajanagar cham) {
	visit(temple);
	cham.visit(temple);
	}
}