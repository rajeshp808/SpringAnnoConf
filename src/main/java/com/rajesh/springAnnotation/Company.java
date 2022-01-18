package com.rajesh.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	public void getDetails() {
		System.out.println(" Company is Automotive");
		autoprod.production();
	}
	@Autowired
	 Product autoprod;

	public Product getOutcome() {
		return autoprod;
	}

	public void setOutcome(Product autoprod) {
		this.autoprod = autoprod;
	}
	
	
}
