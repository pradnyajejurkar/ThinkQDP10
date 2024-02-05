package com.assignment.method;

import java.util.Scanner;

public class Num_PerfectOrNot {

	public static boolean isPerfect(int num) {
		
		int i,sum=1;
		for(i=2;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			return true;
		}else {
				return false;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter the number:");
		n=sc.nextInt();
		
		boolean status=isPerfect(n);
		
		if(status) {
			System.out.println(n + " is perfect number");
		}else {
			System.out.println(n + " is not perfect number");
				
			}
		}
			
}
