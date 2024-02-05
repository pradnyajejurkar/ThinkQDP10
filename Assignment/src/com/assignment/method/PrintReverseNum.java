package com.assignment.method;

import java.util.Scanner;

public class PrintReverseNum {
	public static int findReverse(int n) {
		int rev=0,rem;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the number:");
		num=sc.nextInt();
		
		System.out.println("Reverse is:"+(findReverse(num)));
	}

}
