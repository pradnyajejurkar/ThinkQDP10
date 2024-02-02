package com.oops.classobject;

class Calculator{
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
}



public class CalTest {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		int add=c1.add(10, 20);
		int sub=c1.sub(10, 20);
		int mul=c1.mul(10,20);
		int div=c1.div(10,20);
		
		System.out.println("Addition is:"+add);
		System.out.println("Subtraction is:"+sub);
		System.out.println("Multiplication is:"+mul);
		System.out.println("Division is:"+div);

	}

}
