package com.oops.classobject;

public class PrintTest {

	
	//instance method
	public void printMsg(String name) {
		System.out.println("Good mornig "+name);
	}
	public static void main(String[] args) {
		System.out.println("main");
		
		//object
		//non-refrence
		new PrintTest().printMsg("pradnya");
		
		//with refrence
		PrintTest p1=new PrintTest();
		p1.printMsg("neha");

	}

}
