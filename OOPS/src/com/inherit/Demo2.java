package com.inherit;

import com.inheritance.AccessDemo;

public class Demo2 {

	public static void main(String[] args) {
		AccessDemo obj=new AccessDemo();
		//obj.a = 10;//private not accessible
		//obj.b = 20;//default
		//obj.c = 30;//protected
		//obj.d = 40;

//		obj.print();
//		obj.print2();
//		obj.print3();
		obj.print4();

	}

}
