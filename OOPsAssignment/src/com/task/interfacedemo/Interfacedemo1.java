package com.task.interfacedemo;

interface Bank {

	// Abstract method

	double getBalance();

	void deposit(double amount);

	void withdraw(double amount);

	// default method
	default void displayAccountType() {
		System.out.println("Account type:Generic");
	}

}

class SavingAccount implements Bank {
	private double bal;

	public SavingAccount(double initialBal) {
		this.bal = bal;
	}

	@Override
	public double getBalance() {
		return bal;
	}

	@Override
	public void deposit(double amount) {
		bal = bal + amount;
	}

	public void withdraw(double amount) {
		if (bal >= amount) {
			bal = bal - amount;
		} else {
			System.out.println("Insufficient funds");
		}
	}

	@Override
	public void displayAccountType() {
		System.out.println("Account type:Saving account");
	}

}

public class Interfacedemo1 {

	public static void main(String[] args) {
		Bank b=new SavingAccount(1000);
		
		b.displayAccountType();
		
		b.deposit(500);
		b.withdraw(200);
		
		System.out.println("final bal:"+b.getBalance());
	}

}
