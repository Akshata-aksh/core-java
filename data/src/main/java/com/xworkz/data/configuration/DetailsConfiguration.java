package com.xworkz.data.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.data")
public class DetailsConfiguration {
	
	public DetailsConfiguration() {
		System.out.println("created " + this.getClass().getSimpleName());

	
	}

}
