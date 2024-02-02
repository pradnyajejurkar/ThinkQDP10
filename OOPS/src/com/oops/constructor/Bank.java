package com.oops.constructor;

public class Bank {
	
	private double bal=1000;
	
	public Bank() {
		this(10);//para constructor
		System.out.println("Default Constuctor");
	}
	
	public Bank(double bal) {
		//this();//default constructor
		this("");
		System.out.println("Parametrised constructor");
		
	}
	public Bank(String name) {
		System.out.println("String constructor");
	}
	
	

}
