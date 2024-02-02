package com.assignment.constructer;

public class AccountTest {

	public static void main(String[] args) {
		//Q-2,3
		Account a1 = new Account();
		System.out.println(a1.acc_no);
		System.out.println(a1.customerName);

		 //Q-4,5
		Account a2 = new Account(104,"neha");
		System.out.println(a2.acc_no);
		System.out.println(a2.customerName);
	

		 //Q-6
		Account a3 = new Account(100,"meeta");
		System.out.println(a3.acc_no);
		System.out.println(a3.customerName);
		
		//Q-7
		Account a4 = new Account(105,"nikita");
		System.out.println(a4.acc_no);
		System.out.println(a4.customerName);
		
		Account a5 = new Account(106,"nita");
		System.out.println(a5.acc_no);
		System.out.println(a5.customerName);
		
	}

}
