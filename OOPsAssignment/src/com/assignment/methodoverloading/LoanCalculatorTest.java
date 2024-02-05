package com.assignment.methodoverloading;

import java.util.Scanner;

class LoanCalculator {
	private double principleAmount;
	private double loanAmount;

	public LoanCalculator() {

	}

	public LoanCalculator(double principleAmount) {
		this();
		this.principleAmount = principleAmount;

	}

	public double getPrincipleAmount() {
		return principleAmount;
	}

	public void setPrincipleAmount(double principleAmount) {
		this.principleAmount = principleAmount;
	}

	public String loanAmount(double rate) {
		loanAmount = principleAmount * (100 + rate);
		return "Housing Loan:" + loanAmount;
	}

	public String loanAmount(double value1, double value2) {
		loanAmount = principleAmount * (value1 + value2 + 100);
		return "Commercial Loan:" + loanAmount;
	}
}
	public class LoanCalculatorTest {

		static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {

			LoanCalculator l1 = new LoanCalculator();

			System.out.println("Enter principle amount:");
			l1.setPrincipleAmount(sc.nextDouble());

			System.out.println(l1.loanAmount(8));
			System.out.println(l1.loanAmount(0.5, 0.4));

		}

	}
