package com.assignments.conditionalstatement;

import java.util.Scanner;

//Write a Java program to accept two integers and check whether they are equal or not.
public class NumberEqualOrNot {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	       int num1,num2;
	       System.out.println("Enter the first number: " );
	       num1=sc.nextInt();
	       
	       System.out.println("Enter the second number: " );
	       num2=sc.nextInt();
	       
	       if( num1 == num2) {
	    	    System.out.println("number are equal");
	    	    
	       }
	       else {
	    	    System.out.println("number are not equal");
	       }

	}

}
