package com.inheritance.assignment;

class Bank {
	private double pAmount;
	protected double rateOfInterest;

	public Bank() {
		super();
	}

	public Bank(double pAmount, double rateOfInterest) {
		this.pAmount = pAmount;
		this.rateOfInterest = rateOfInterest;
	}

	public void setPAmount(double pAmount) {
		this.pAmount = pAmount;
	}

	public double getPAmount() {
		return pAmount;
	}

	public void getIntersetRate() {
		System.out.println("Interest Rate:" + rateOfInterest);
	}

	@Override
	public String toString() {
		return "Bank [pAmount=" + pAmount + ", rateOfInterest=" + rateOfInterest + "]";
	}

}

class SavingAccount extends Bank {
	public SavingAccount() {

	}

	public SavingAccount(double pAmount, double rateOfInterest) {
		super(pAmount, rateOfInterest);

	}

	@Override
	public void getIntersetRate() {

		System.out.println("Interest Rate:" + rateOfInterest);
	}

}

class CurrentAccount extends Bank {
	public CurrentAccount() {

	}

	public CurrentAccount(double pAmount, double rateOfInterest) {
		super(pAmount, rateOfInterest);
	}

	@Override
	public void getIntersetRate() {

		System.out.println("Interest Rate:" + rateOfInterest);
	}

}

public class BankTest {

	public static void main(String[] args) {
		Bank b1 = new Bank(10000, 0.02);
		b1.getIntersetRate();

		SavingAccount s1 = new SavingAccount(15000, 0.03);
		s1.getIntersetRate();

		CurrentAccount c1 = new CurrentAccount(12000, 0.05);
		c1.getIntersetRate();
	}

}
