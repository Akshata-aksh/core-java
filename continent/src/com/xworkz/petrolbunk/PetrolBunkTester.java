package com.xworkz.petrolbunk;


public class PetrolBunkTester {
public  static void main(String [] args) {
		
		PetrolBunk cof =new PetrolBunk();
		cof.toPrepareCook("HP gas");
		System.out.println("get "+cof.gas);
		
		PetrolBunk ref = new PetrolBunk();
	    ref.toPrepareCook("gas");
		System.out.println("to get"+ ref.gas);


}
}