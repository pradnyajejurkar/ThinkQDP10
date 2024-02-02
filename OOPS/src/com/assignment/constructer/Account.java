package com.assignment.constructer;

public class Account {
	//public long acc_no;
	//public String customerName;
	
	 long acc_no=102;
	 String customerName="geeta";
	
	/*public Account() {
		
	}*/
	public Account() {
		System.out.println("i am in default constructer");
	}
	
	public Account(long acc_no,String customerName) {
		this.acc_no=acc_no;
		this.customerName=customerName;
		System.out.println("i am parameterized constructer");

	}
	
}	