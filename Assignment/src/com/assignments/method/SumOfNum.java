package com.assignments.method;

import java.util.Scanner;

public class SumOfNum {

	
	
	public static int calSum1(int n) {
		int i,sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+i;
	   }
		return sum;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		int sum=(calSum1(num));
		 
		System.out.println("sum of 1 to n natural numbers:" + sum);
	}
	}


