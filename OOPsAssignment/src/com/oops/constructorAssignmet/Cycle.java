package com.oops.constructorAssignmet;

public class Cycle {

	int acc_no;
	int noOfWheels;
	
	public Cycle() {
		System.out.println("I am default constructor");
	}
	
	public Cycle(int acc_no,int noOfWheels) {
		this();
		System.out.println("I am another constructor");
		this.acc_no=acc_no;
		this.noOfWheels=noOfWheels;
		
	}
	
	public static void main(String[] args) {
		Cycle c1=new Cycle();//o/p-I am default constructor
		
		Cycle c2=new Cycle(101,2);

	}

}
