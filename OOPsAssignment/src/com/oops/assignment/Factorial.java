package com.oops.assignment;

import java.util.Scanner;

public class Factorial {
	int num;

	Factorial() {

	}

	Factorial(int num) {
		this.num = num;
	}

	public long calFact() {
		long fact = 1;
		int i;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		Factorial f1=new Factorial(num);
		
		
		System.out.println("factorial of number : " +f1.calFact());
	}
	}


