package com.interfacedemo;

interface Student {
	void show();

	default void display() {
		System.out.println("I am Student");
	}
}

interface Teacher {
	void show();

	default void display() {
		System.out.println("I am Teacher");

	}
}

public class DiamondProblemDemo implements Student, Teacher {

	@Override
	public void show() {
		System.out.println("School name:Heritage School");
	}

	// compulsary override default method causing ambiguity
	public void display() {
		System.out.println("I am in School");
		Student.super.display();
		Teacher.super.display();
	}

	public static void main(String[] args) {
		Student s;
		s = new DiamondProblemDemo();
		s.show();
		s.display();

		Teacher t;
		t = new DiamondProblemDemo();
		t.show();
		t.display();

	}

}
