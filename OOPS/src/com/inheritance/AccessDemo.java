package com.inheritance;

public class AccessDemo {

	private int a;
	int b;
	protected int c;
	public int d;

	private void print() {
		System.out.println("Private method");
	}

	void print2() {
		System.out.println("default method");
	}

	protected void print3() {
		System.out.println("protected method");
	}

	public void print4() {
		System.out.println("public method");
	}

	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
		obj.a = 10;
		obj.b = 20;
		obj.c = 30;
		obj.d = 40;

		obj.print();
		obj.print2();
		obj.print3();
		obj.print4();
	}
}
