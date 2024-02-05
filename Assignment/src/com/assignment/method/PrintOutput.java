package com.assignment.method;

import java.util.Scanner;

public class PrintOutput {

	public static int printOutput(int n) {
		int rem,rev=0,res;
		int originalnum=n;
		while(n!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		res=originalnum-rev;
		if(res>0)
			return res;
		else
			return 0;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		System.out.println("Output:"+(printOutput(num)));
	}

}
