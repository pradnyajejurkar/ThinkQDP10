package com.oops.classobject;

import java.util.Scanner;

/*9) Write java Program for arithmetic operation for each operation write separate Method using 
parameter Passing*/
public class ArithmeticOp2 {
	int ans;

	public void add(int a, int b) {
		ans = a + b;
		System.out.println("Addition is:" + ans);
	}

	public void sub(int a, int b) {
		ans = a - b;
		System.out.println("Subtraction:" + ans);

	}

	public void mul(int a, int b) {
		ans = a * b;
		System.out.println("Multiplication is:" + ans);
	}

	public void div(int a, int b) {
		ans = a / b;
		System.out.println("Division is:" + ans);
	}

	public void mod(int a, int b) {
		ans = a % b;
		System.out.println("Modulus is:" + ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter value of a:");
		a = sc.nextInt();
		System.out.println("Enter value of b:");
		b = sc.nextInt();
		ArithmeticOp2 a1 = new ArithmeticOp2();
		a1.add(a,b);
		a1.sub(a,b);
		a1.mul(a,b);
		a1.div(a,b);
		a1.mod(a,b);

	}

}
