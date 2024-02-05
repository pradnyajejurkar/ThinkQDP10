package com.oops.constructorIIb;

public class C {
	 int i;
	 {
		 System.out.println("IIB-1");
		 i=100;
	 }
	 {
		 System.out.println("IIB-2");
		 System.out.println(i);
		 i=200;
	 }
	 public static void main(String args[]) {
		 System.out.println("main");
		 C c=new C();
		 
		 System.out.println(c.i);
		 //o/p- main IIB-1 IIB-2 100 200
	 }
}
