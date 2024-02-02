package com.oops.classobject;
/*10) Write java Program for arithmetic operation for each operation write separate Method using 
parameter Passing and return type*/

import java.util.Scanner;

public class ArithmeticOp3 {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int mod(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter value of a:");
		a = sc.nextInt();
		System.out.println("Enter value of b:");
		b = sc.nextInt();
		ArithmeticOp3 a1 = new ArithmeticOp3();
		int add=a1.add(a, b);
		int sub=a1.sub(a, b);
		int mul=a1.mul(a, b);
		int div=a1.div(a, b);
		int mod=a1.mod(a, b);
		
		System.out.println("Addition is:"+add);
		System.out.println("Subtraction is:"+sub);
		System.out.println("Multiplication is:"+mul);
		System.out.println("Division is:"+div);
		System.out.println("Modulus is:"+mod);

	}

}
