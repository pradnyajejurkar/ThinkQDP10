package com.oops.classobject;

class Customer{
	
	int custid;
	String custname;
	
	public void showDetails() {
		int a=10;
		System.out.println("Customer id:"+custid);
		System.out.println("Customer name:"+custname);
		System.out.println(a);
		
	}
	public void shop() {
		System.out.println(custid);
		//System.out.println(a);local variable access within perticular method wher its is declare 
	}
}



public class TestCustomer {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.showDetails();
		c1.shop();
	}

}
