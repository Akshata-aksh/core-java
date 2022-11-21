package com.xworkz.inheritance;

import javax.security.auth.Subject;

import com.xworkz.inheritance.sweet.Sweet;
import com.xworkz.inheritance.sweet.sugar.Sugar;

public class SweetTester {
	
	public static void main(String[] args) {
	
		Sweet sweet = new Sweet();
		sweet.madeUpOf("Boondi");
		System.out.println(sweet.ingredients);
		
		Sugar sugar - new Sugar();
		sugar.madeUpOf("kaju");
		System.out.println(sugar.ingredients);
	}

}
