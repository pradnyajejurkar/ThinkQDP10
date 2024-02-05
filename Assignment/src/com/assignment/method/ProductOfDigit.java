package com.assignment.method;

import java.util.Scanner;

public class ProductOfDigit {

	public static int calProduct(int n) {
		int product=1;
		
		while(n!=0) {
			product=product*(n%10);
			n=n/10;
		}
		return product;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		System.out.println("product is:" +(calProduct(num)));

	}

}
