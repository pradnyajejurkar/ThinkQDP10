package com.assignments.method;

import java.util.Scanner;

public class SumOfEvenOdd {
	
	public static int sumofEven(int n) {
		return n*(n+1);
		
	}
	public static int sumofOdd(int n) {
		return n*n;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 int n;
		  
		 System.out.println("Enter the number:");
		 n=sc.nextInt();
		 
		 int evenSum=sumofEven(n);
		 int oddSum=sumofOdd(n);
		 
		 System.out.println("Sum of " +n+ "even numbers is:" +evenSum);
		 System.out.println("Sum of " +n+ " numbers is:" +oddSum);
		 
	}
}
