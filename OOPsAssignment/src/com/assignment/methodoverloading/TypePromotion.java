package com.assignment.methodoverloading;

public class TypePromotion {

	static void display(int a, double b) {
		System.out.println("Method A");
		System.out.println("Ans:" + (a + b));
	}

	static void display(int a, double b, double c) {
		System.out.println("Method B");
		System.out.println("Ans:" + (a + b + c));
	}

	static void display(int a, float b) {
		System.out.println("Method C");
		System.out.println("Ans:" + (a + b));
	}

	static void display(char a) {
		System.out.println("Method D");
		System.out.println(a);
	}

	public static void main(String args[]) {
		TypePromotion t1 = new TypePromotion();
		// t1.display(8);// ambigutiy

		t1.display(7, 4.0);
		t1.display(6, 4.5, 1.2);
		t1.display('A');
		t1.display(100, 20.67f);
	}
}
