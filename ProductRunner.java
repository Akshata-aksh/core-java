package com.xworkz.kal.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.kal.bean.Product;

public class ProductRunner {
	
	public static void main(String args[]) {
		
ApplicationContext app=new AnnotationConfigApplicationContext(Product.class);
		
		System.out.println(Arrays.toString(app.getBeanDefinitionNames()));
		
		
		Product  ref = app.getBean(Product.class); 
		System.out.println(ref);

	}

}
