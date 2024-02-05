package com.anonymousinnerclass;

/*Task2>>
Create an interface Payment and implement pay() method in varoius ways eg UPI, Credit card etc using
Anonymous inner class*/


interface Payment{
	void pay();
		
}

class UPI implements Payment{
	
	public void pay() {
	System.out.println("Payment done using UPI");
	}
}

class CreditCard implements Payment{
	public void pay() {
		System.out.println("Payment done using CreditCard");
		}
}


public class PaymentDemo {

	public static void main(String[] args) {
		Payment p=new Payment() {

			@Override
			public void pay() {
				System.out.println("Payment done");
				
			}
			
		};
		p.pay();

}
}