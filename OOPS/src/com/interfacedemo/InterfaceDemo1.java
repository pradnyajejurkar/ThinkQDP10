package com.interfacedemo;

interface Payment {

	void pay(double amount);
}

class Cake implements Bakery, Payment {

	@Override
	public void bake() {
		System.out.println("Variety:ButterScotch,Pineapple,Chocolate");

	}

	public void displayRates() {
		System.out.println("Pineapple:300");
		System.out.println("Chocolate:400");
	}

	public void minOrder() {
		System.out.println("500g");
	}

	public void pay(double amount) {
		System.out.println("payment done:" + amount);
	}
}

class Biscuit implements Bakery {
	public void bake() {
		System.out.println("Variety:Almond,chcochips");
	}
	public void minOrder() {
		System.out.println("250g");
	}
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		Bakery b;
		b=new Cake();
		b.bake();
		b.minOrder();
		
		b=new Biscuit();
		b.bake();
		b.minOrder();
	}

}
