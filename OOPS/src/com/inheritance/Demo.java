package com.inheritance;


class Flower{
	void m1() {
		System.out.println("m1 method");
	}
	
	static void m2() {
		System.out.println("m2 method");
		
	}
	void m4() {
		System.out.println("m4 method");
		
	}
}

class Rose extends Flower{
	void m1() {
		System.out.println("child m1 method");
		
	}
	void m3() {
		System.out.println();
		
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flower f;
		f=new Rose();
		f.m1();
	//	f.m3();
		f.m4();
		
		Flower.m2();
		
		
	}

}
