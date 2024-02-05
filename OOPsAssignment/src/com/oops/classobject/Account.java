package com.oops.classobject;
/*6) Create a class Account containing following methods :
insert() to insert account data
display() to display account information
deposit() to deposit amount
withdraw() to withdraw amount
checkbalance() to check balance
e.g.
class Account{
int acc_no;
String name;
float amount;
}*/

public class Account {

	int acc_no;
	String name;
	float balance;

	public void insert(int acno, String name1, float bal) {
		acc_no = acno;
		name = name1;
		balance = bal;
	}

	public void display() {
		System.out.println("Account No:" + acc_no);
		System.out.println("Acount Holder Name:" +name);
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
		System.out.println("Balnce after withdraw:"+balance);
	}

	public static void main(String args[]) {
		Account a1=new Account();
		a1.insert(10, "pradnya", 5000);
		a1.display();
		a1.checkbal();
		a1.deposit(500);
		a1.withdraw(200);
		

	}
}