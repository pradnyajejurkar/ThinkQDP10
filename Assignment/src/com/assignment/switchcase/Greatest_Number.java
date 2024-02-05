package com.assignment.switchcase;

import java.util.Scanner;

public class Greatest_Number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	   int num1,num2,max;
	   
	   System.out.println("Enter First and second number:");
	   num1=sc.nextInt();
	   num2=sc.nextInt();
	   
	   max=num1>num2?1:2;
	   
	   switch(max) {
	   case 1:
		   System.out.println(num1 + " : is greatest number");
		   break;
	   case 2:
		   System.out.println(num2 + " : is greatest number ");
		   break;
	default:
		  System.out.println("Invaild number");
	   }

	}

}
