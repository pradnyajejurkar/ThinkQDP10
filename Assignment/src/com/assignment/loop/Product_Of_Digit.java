package com.assignment.loop;
//9.Write a Java program to calculate product of digits of any number.
import java.util.Scanner;

public class Product_Of_Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num,product=1;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		while(num!=0) {
			
			product=product*(num%10);
			num=num/10;
		}
		
		System.out.println("Product is:" +product);
	}

}
