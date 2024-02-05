package com.demo.method;

public class Test_method1 {
	
    //userdefined method
	//without return without parameter
	//method declaration
	public static void show() {
		System.out.println("hello");
	 //println()- predefined method
	}
	
	
	//without return with parameter
	public static void add(int a,int b) {
		System.out.println("sum:"+(a+b));
	}
	public static void main(String[] args) {
	
		System.out.println("method demo");
		//call method
		//as it is static method inside same class
		//we can call by using name of method
		show();  //method calling
		int i;
		
		for(i=1;i<=5;i++) {
			show();
		}
		add(10,20);
		 
		int x=10,y=20;
		add(x,y);

	}

}
