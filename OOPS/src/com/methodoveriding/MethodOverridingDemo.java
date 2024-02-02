package com.methodoveriding;

class Person {
	protected String name;

	void display(String name) {
		System.out.println("I am an person:" + name);
	}

	static void show() {
		System.out.println("I am indian");
	}
}

class Employee extends Person {
	protected void display(String name) {
		show();
		System.out.println("I am an employee:" + name);
		System.out.println("Orgnization:HCL");

	}

	static void show() {
		System.out.println("i am indian emp");
	}
}

class Trainee extends Person {
	void display(String name) {
		super.display(name);
		System.out.println("I am an trainee:" + name);
		System.out.println("probation period:3 months");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.display("pradnya");

		Employee e1 = new Employee();
		e1.display("Abc");

		Trainee t = new Trainee();
		t.display("xyz");
	}

}
