package com.oops.constructor;

class Demo{
	int a,b;
	String name;
	
	Demo(){
		this(10,20);
		System.out.println("default constructor");
	}
	
	Demo(int a,int b){
		//this();//recursive call to cons
		System.out.println("para constructor 1..");
		this.a=a;
		this.b=b;
		this.name="unknown";
	}
	
	Demo(int a,int b,String name){
		System.out.println("para const 2");
		this.a=a;
		this.b=b;
		this.name=name;
	}
}

public class CountructorChainingDemo {

	public static void main(String[] args) {
		Demo d1=new Demo();

	}

}
