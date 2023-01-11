package com.xworkz.kal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.kal")
public class ProductConfiguration {

	public ProductConfiguration() {
		
	}
	@Bean
	public String name() {
		return "Nishma";
	}
	
	@Bean
	public int price() {
		return 500;
	}
	
	@Bean
	public double gst() {
		return 200.00;
	}
	@Bean
	public char good() {
		return 'G';
	}
	@Bean
	public boolean expiry() {
		return true;
	}
	@Bean
	public byte productNo() {
		return 20;
	}
	@Bean
	public long mobileNo() {
		return 9383883888L;
	}
	
	@Bean
	public short id() {
		return 234;
	}
	@Bean
	public float quantity (){
		return 9.5f;
	}
	
	

	
	
	

}
