package com.tasks.abstractandinterface;
/*Write a Java program to create an abstract class BankAccount with abstract methods deposit() 
and withdraw().
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class 
and implement the respective methods to handle deposits and withdrawals for each account type.*/

abstract class BankAccount {
	private int acc_no;
	private String type;
	protected String ifsc;
	protected double balance;

	public BankAccount() {
		

	}

	public BankAccount(int acc_no, String type, String ifsc, double balance) {
		
		this.acc_no = acc_no;
		this.type = type;
		this.ifsc = ifsc;
		this.balance = balance;
	}

	
	
	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	 abstract void deposit(int amount); 
		
	 abstract void withdraw(int amount);
}

class SavingAccount extends BankAccount{
	 void deposit(int amount)
	 {
		 System.out.println("Saving account amount to deposit:"+amount);
	 }
	
	 void withdraw(int amount) {
		 System.out.println("Saving account amount to withdraw:"+amount);
	 }
	
}

class CurrentAccount extends BankAccount{
	 void deposit(int amount)
	 {
		 System.out.println("current account amount to deposit:"+amount);
	 }
	
	 void withdraw(int amount) {
		 System.out.println("current account amount to withdraw:"+amount);
	 }
	
}



public class BankTest {

	public static void main(String[] args) {
		BankAccount b;
		b=new SavingAccount();
		b.deposit(15000);
		b.withdraw(5000);
		
		b=new CurrentAccount();
		b.deposit(55000);
		b.withdraw(10000);
		
	}

}
