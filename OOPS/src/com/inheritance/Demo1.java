package com.inheritance;

public class Demo1 {
	
	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
		//obj.a = 10;//private is not accessible
		obj.b = 20;
		obj.c = 30;
		obj.d = 40;

		//obj.print();
		obj.print2();
		obj.print3();
		obj.print4();
	}

}