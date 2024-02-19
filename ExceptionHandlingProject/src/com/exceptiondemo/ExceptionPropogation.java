package com.exceptiondemo;

import java.io.IOException;

public class ExceptionPropogation {
	// unchecked

	void method() {
		int data = 50 / 0;

	}

	void method2() {
		method();
	}

	void method3() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// checked

	void m() throws IOException {
		throw new IOException("Invalid input");
	}

	void m1() throws IOException {
		m();
	}

	void m2() {
		try {
			m1();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		ExceptionPropogation ep = new ExceptionPropogation();

		ep.method3();

		System.out.println("Normal flow");
		
		System.out.println("-------------");
		
		ep.m2();
	}

}
