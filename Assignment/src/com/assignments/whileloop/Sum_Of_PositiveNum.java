package com.assignments.whileloop;

import java.util.Scanner;

//Java program to find the sum of positive numbers
public class Sum_Of_PositiveNum {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);	
 
		  int sum = 0,num;

		  	System.out.println("Enter a number:");
		    num = sc.nextInt();
			   
		    while (num >= 0) {
		      sum = sum+num;

		      System.out.println("Enter a number");
		      num = sc.nextInt();
		    }
			   System.out.println("Sum = " + sum);
		}
	}


