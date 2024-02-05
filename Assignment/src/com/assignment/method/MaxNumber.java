package com.assignment.method;

import java.util.Scanner;

public class MaxNumber {
	
	public static int maxNum(int a,int b) {
		return (a>b)?a:b;
		
	}

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Maximum number is:" +maxNum(x, y));

	}

}
