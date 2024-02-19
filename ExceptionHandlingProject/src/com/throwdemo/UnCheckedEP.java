package com.throwdemo;

import java.io.IOException;

public class UnCheckedEP {

	
	void method3() {
		int data=50/0;
	}
	
	void method2() {
		method3();
	}
	
	void method1() {
		try {
			method2();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		UnCheckedEP obj=new UnCheckedEP();
		
		obj.method1();
		
	}

}
