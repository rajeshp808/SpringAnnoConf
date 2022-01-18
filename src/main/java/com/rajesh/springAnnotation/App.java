package com.rajesh.springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App {
	public static void main(String[] args) {
		
		
		
		System.out.println( "Annotation Configuration App Starts" );
		 // Here we are not using xml based configuration but instead we used annotation based config.
		ApplicationContext factory= new AnnotationConfigApplicationContext(Config.class); 
		 
		 Company cmp=(Company) factory.getBean(Company.class);
		 cmp.getDetails();
		 
		//Below is similar to above getBean configuration 
		// Product prod = (Product) factory.getBean(Product.class);;
		//	prod.production();
		 
		 //Autowire configuration is done company class
		
		 
		 
		 
		 
	}
	

}
