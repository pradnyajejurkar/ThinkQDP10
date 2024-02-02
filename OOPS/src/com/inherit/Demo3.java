package com.inherit;

import com.inheritance.AccessDemo;

public class Demo3 extends AccessDemo {

	public static void main(String[] args) {
	//	AccessDemo obj=new AccessDemo();
		//obj.a = 10;//private not accessible
		//obj.b = 20;//default
		//obj.c = 30;//protected
		// obj.d = 40;

		//obj.print();
		//obj.print2();
		//obj.print3();
		// obj.print4();
		 
		 Demo3 obj= new Demo3();
			//obj.a=10; // Private is not accessible
			//obj.b=20;// default is not accessible
			obj.c=30; 
			obj.d=40;
			
			//obj.print();
			//obj.print2();
			obj.print3();
			obj.print4();
	}

}
