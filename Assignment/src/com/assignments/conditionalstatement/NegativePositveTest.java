package com.assignments.conditionalstatement;

import java.util.Scanner;

//Write a Java program to check whether a number is negative, positive or zero 

public class NegativePositveTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	     int num;
	     System.out.println("Enter the number:");
	     num=sc.nextInt();
	     
	     if(num > 0) {
	    	 System.out.println(num + " number is positive");
	     }else if(num < 0) {
	    	 System.out.println(num + " number is negative");
	    	
	     }else {
	    	 System.out.println(num + " number is zero");
	     }
	

	}

}
