package com.oops.constructorIIb;

public class B {
	{
	 System.out.println(1);
	}

	public B() {
		System.out.println(2);
	}
	public static void main(String[] args) {
		System.out.println(3);
		
		B b=new B();
		//o/p- 3 1 2
	}

}
