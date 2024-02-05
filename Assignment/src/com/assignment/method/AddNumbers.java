package com.assignment.method;

import java.util.Scanner;

public class AddNumbers {

	public static int checkSum(int num1,int num2,int num3) {
		int sum=1;
		sum=num1+num2+num3;
		 return sum;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Enter three numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		
		
		//System.out.println(checkSum(n1,n2,n3));
	    System.out.println("Sum is:"+(checkSum(n1,n2,n3)));
	 int sum=checkSum(n1,n2,n3);
	   if(sum>100) 
		System.out.println("Hello");
	
	   else 
		System.out.println("hii");
	
	}		
	}	

