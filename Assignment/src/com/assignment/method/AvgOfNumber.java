package com.assignment.method;

import java.util.Scanner;

public class AvgOfNumber {

	
	public static double calAvg(double num1,double num2,double num3) {
		return(num1+num2+num3)/3;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n1,n2,n3;
		System.out.println("Enter the first number:");
		n1=sc.nextDouble();
		System.out.println("Enter the second number:");
		n2=sc.nextDouble();
		System.out.println("Enter the third number:");
		n3=sc.nextDouble();
		
		System.out.println("Average of three numbers :" +calAvg(n1,n2,n3));
		

	}

}
