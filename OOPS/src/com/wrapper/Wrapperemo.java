package com.wrapper;

public class Wrapperemo {
	public static void main(String[] args) {
		
		//Boxing:primitive to wrapper convert
		
		int num=20;
		Integer i1=Integer.valueOf(num);
		
		Integer i3=num;//valueof- added by compiler  //autoboxing
		
		System.out.println(i1);
		System.out.println(i3);
		
		Integer i2=new Integer(40);
		
		
		//unboxing
		//wrapper to primitive
		
		Float f1=8.4f;
		
		float f=f1.floatValue();
		
		float f2=f1;// .floatValue is added by compiler
		System.out.println(f2);
	}

}
