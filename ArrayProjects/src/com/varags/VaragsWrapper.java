package com.varags;

public class VaragsWrapper {

	// promoted to parent class

	public static void display(Object... s) {
		for (Object st : s) {
			System.out.println(st);

		}
	}

	public static void display(Number... s) {
		System.out.println("In number");
		for (Number st : s) {
			System.out.println(st);

		}
	}

	public static void display(Integer... s) {
		System.out.println("In int");
		for (Integer st : s) {
			System.out.println(st);

		}
	}

	public static void main(String[] args) {
		display(7.8f, 6.7f);// float:Number:object
		display('a', 'b', 'c');// Character:object

	}

}
