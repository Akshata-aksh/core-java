package com.xworkz.poly;

import com.xworkz.poly.polyapp.CsEngineer;
import com.xworkz.poly.polyapp.EcEngineer;
import com.xworkz.poly.polyapp.Engineer;

public class EngineerTester {
	
	public static void main(String args[]) {
		
		/*Polymorphism
		 1) compiletime polymorphism - method overloading
		 2) runtime polymorphism   - method overriding - only changes in implementation */
		
		Engineer ecEngineer = new EcEngineer();
		
		Engineer engineer = new CsEngineer();
		
		ecEngineer.solveProblems();
		
		
		
	}

}
