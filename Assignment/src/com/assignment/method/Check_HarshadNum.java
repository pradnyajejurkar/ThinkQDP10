package com.assignment.method;

import java.util.Scanner;

public class Check_HarshadNum {

	public static boolean checkHarshadNum(int n) {
		int sum=0,rem=0;
		int originalnum=n;
		while(n!=0) {
			rem=n%10;
			sum=sum+(n%10);
			n=n/10;
		}
		return(originalnum%sum==0);
			
		 
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		boolean status=checkHarshadNum(num);
		if(status) {
			System.out.println(num + " is a harshad number");
		}else {
			System.out.println(num + " is not a harshad number");
		}
}
}