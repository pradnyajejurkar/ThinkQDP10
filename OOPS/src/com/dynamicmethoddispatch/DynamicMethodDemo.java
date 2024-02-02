package com.dynamicmethoddispatch;

class Bank {

	protected double rate;

	public void geRateOfInterest() {
		rate = 9;
		System.out.println("rate of interest is:" + rate);
	}

}

class SBIBank extends Bank {
	public void geRateOfInterest() {
		rate = 8.5;
		System.out.println("SBI rate of interest is:" + rate);

	}
}

class HDFCBank extends Bank {
	public void geRateOfInterest() {
		rate = 9.5;
		System.out.println("HDFC rate of interest is:" + rate);

		
	}
}

public class DynamicMethodDemo {

	public static void main(String[] args) {
		Bank b;
		b=new SBIBank();
		b.geRateOfInterest();
		
		b=new HDFCBank();
		b.geRateOfInterest();
	}

}
