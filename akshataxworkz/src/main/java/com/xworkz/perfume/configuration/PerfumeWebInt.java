package com.xworkz.perfume.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class PerfumeWebInt extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public PerfumeWebInt() {
System.out.println("created" + this.getClass().getSimpleName());	
}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		  System.out.println("Runninng in getRootConfigClasses ");	
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		  System.out.println("Runninng in getServletConfigClasses ");	
		  return new  Class[]{PerfumeConfiguration.class};
	}

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
