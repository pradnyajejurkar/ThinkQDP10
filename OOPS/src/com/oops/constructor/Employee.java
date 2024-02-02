package com.oops.constructor;

public class Employee {
	
	private int eid;
	private String ename;
	private double esal;
	
	public Employee() {
		System.out.println("default constructer invoked");
	}

	//there can be only default cons
	
	public Employee(int eid) {
		System.out.println("parameterised constructer:"+eid);
	}
	
	public void show() {
		System.out.println("show method");
	}
}
