package com.xworkz.kal.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
	
	@Autowired
	private String name;
	@Autowired
	private int price;
	@Autowired
	private double gst;
	@Autowired
	private char good;
	@Autowired
	private boolean expiry;
	@Autowired
	private byte productNo;
	@Autowired
	private long mobileNo;
	@Autowired
	private short id;
	@Autowired
	private float quantity;
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", gst=" + gst + ", good=" + good + ", expiry=" + expiry
				+ ", productNo=" + productNo + ", mobileNo=" + mobileNo + ", id=" + id + ", quantity=" + quantity + "]";
	}

	
}
