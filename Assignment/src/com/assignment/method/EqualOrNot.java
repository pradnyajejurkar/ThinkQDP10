package com.assignment.method;

import java.util.Scanner;

public class EqualOrNot {

	//void
	public static void numEqual(int num1,int num2 ) {
	      if(num1==num2) {
	    	  System.out.println("Number are equal");
	      }else {
	    	  System.out.println("number are not equal");
	      }
	    	  
	      
	}
	/*int
	public static String numEqualOrNot(int num1,int num2) {
		return (num1==num2)?"equal":" not eqaul";*/
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n1,n2;
		System.out.println("Enter the two numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		//numEqualOrNot(n1,n2);
		numEqual(n1,n2);
		

	}

}
