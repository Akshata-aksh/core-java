package com.xworkz.shopabs.ngo;

import com.xworkz.shopabs.shop.Shop;

public abstract class NgoContractPerson implements Shop{
	
	@Override
	public void doBusiness() {
		System.out.println("Do Business of Ngo");
	}

}
