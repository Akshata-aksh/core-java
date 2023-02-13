package com.xworkz.egg.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class EggWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		  System.out.println("Runninng in getRootConfigClasses ");	
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		  System.out.println("Runninng in getServletConfigClasses ");	
		    Class[] ref= {EggConfiguration.class};
			return ref;	}

	@Override
	protected String[] getServletMappings() {
		 System.out.println("Runninng in getServletMappings ");	
		    String[] ref= {"/"};
			return ref;

	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling" );
		configurer.enable();
	}


}
