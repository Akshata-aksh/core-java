package com.xworkz.wild;

public class WildLifeSanctuaryTester {
public  static void main(String [] args) {
		
	WildLifeSanctuary cof=new WildLifeSanctuary();
			cof.life("Mekong");
			System.out.println("river name "+cof.animal);
			
			WildLifeSanctuary ref = new WildLifeSanctuary();
		    ref.life("Yellow river");
			System.out.println("river "+ ref.animal );


	}


}
