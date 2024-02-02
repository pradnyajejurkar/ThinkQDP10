package com.oops.constructor;

public class Customer {
	
	private int custid;
	private String custname;
	private String custemail;
	private String custcontact;
	
	public Customer() {
	}
	
	//add customer
	public Customer(String custname,String custemail,String custcontact) {
		this.custname=custname;
		this.custemail=custemail;
		this.custcontact=custcontact;
	}
	
	//update Customer
	public Customer(int custid,String custname,String custemail,String custcontact) {
		this.custid=custid;
		this.custname=custname;
		this.custemail=custemail;
		this.custcontact=custcontact;
}
}