package com.assignment.method;

import java.util.Scanner;

public class SwappingOfNum {

	public static void swap(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}
	public static void main(String[] args) {
	
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		num1=sc.nextInt();
		System.out.println("Enter num2:");
		num2=sc.nextInt();
		System.out.println("after swapping");
		swap(num1,num2);
		
	}

}