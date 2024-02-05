package com.task.interfacedemo;
/*Create an online shopping which has various modes to paythe Bill
If paid through cash.. no discount
Paytm ... above 1000,, cashback 500
Credit card .. any amount : 20% discount
Debit card.... above 5000 : 20% discount
Try to the pay bill using different modes*/

interface OnlinePayment {
	double getDiscount(double amount);

}

class Cash implements OnlinePayment {

	public double getDiscount(double amount) {
		System.out.println("You are not applicable for any discount");
		return amount;
	}

}

class Paytm implements OnlinePayment {

	@Override
	public double getDiscount(double amount) {
		if (amount < 1000)
			return amount;
		else {
			return (amount - 500);
		}

	}
}

class CreditCard implements OnlinePayment {

	@Override
	public double getDiscount(double amount) {

		return 0.2;
	}

}

class DebitCard implements OnlinePayment {

	public double getDiscount(double amount) {
		if (amount < 5000) {
			return amount;
		} else {
			double total = amount - (amount * 0.2);
			return total;
		}
	}

}

public class Interfacedemo2 {
	public void paymentMode(OnlinePayment p, double amt) {
		double dis = p.getDiscount(amt);

		System.out.println("Amount to pay:" + dis);
	}

	public static void main(String[] args) {
		Interfacedemo2 obj = new Interfacedemo2();

		OnlinePayment p;
		p = new Cash();
		obj.paymentMode(p, 4000);

		p = new CreditCard();
		obj.paymentMode(p, 1000);

		p = new DebitCard();
		obj.paymentMode(p, 3000);
		obj.paymentMode(p, 7000);

		p = new Paytm();
		obj.paymentMode(p, 700);
		obj.paymentMode(p, 1000);

	}

}
