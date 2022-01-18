package com.rajesh.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Company getTemp() {
		
		return new Company();
	}
	@Bean
	public Product getRel() {
		//greatness of this Annotation spring configuration is Release class is loosely coupled here
		// next time if I want to another kind of class instance for Product, we just have to return another class here
		return new Release();
	}
}
