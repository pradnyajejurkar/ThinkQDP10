package com.constructor;

public class Account {

	private int acc_no;
	private String name;
	private float balance;
	static String bankName;
	static int rateOfInterest;
	static int acc_count;

	{
		acc_count++;
	}

	public Account() {

	}

	public Account(int acc_no, String name, float balance) {
		this();
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
	}

	public void insert(int acno, String name1, float bal) {
		acc_no = acno;
		name = name1;
		balance = bal;
	}

	public void display() {
		System.out.println("Account No:" + acc_no);
		System.out.println("Acount Holder Name:" + name);
	}

	public void checkbal() {
		System.out.println("Account Balance is:" + balance);
	}

	public void deposit(int deposit) {
		balance = balance + deposit;
		System.out.println("Balance after deposit:" + balance);

	}

	public void withdraw(int withdraw) {
		balance = balance - withdraw;
		System.out.println("Balnce after withdraw:" + balance);
	}
}
