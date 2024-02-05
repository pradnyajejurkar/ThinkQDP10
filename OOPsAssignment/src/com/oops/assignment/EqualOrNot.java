package com.oops.assignment;

import java.util.Scanner;

public class EqualOrNot {
	
	int n1,n2;
	
	EqualOrNot(){
		System.out.println("default const");
		
	}
	
	EqualOrNot(int n1,int n2){
		System.out.println("para const");
		this.n1=n1;
		this.n2=n2;
	}
	
	public void numEqual() {
	      if(n1==n2) {
	    	  System.out.println("Number are equal");
	      }else {
	    	  System.out.println("number are not equal");
	      }
	}	  

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the 1st number:");
		num1=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		num2=sc.nextInt();
		
		EqualOrNot e1=new EqualOrNot();
		e1.numEqual();
	}

}
