package com.assignment.method;

import java.util.Scanner;

public class FactorialOfNum {
   static Scanner sc=new Scanner(System.in); 
	public static long calFact(int n)  {
		long fact=1;
		int i ;
		for(i=1;i<=n;i++) {
		fact=fact*i;
		}
		return fact;
		
	}
	
	
	public static void main(String[] args) {
 
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		long res=calFact(num);
		
		System.out.println("factorial of number : " + num + " is " +res);
	}
    
}
