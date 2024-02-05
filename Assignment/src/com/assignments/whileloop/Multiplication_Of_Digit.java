package com.assignments.whileloop;

import java.util.Scanner;

public class Multiplication_Of_Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num,mul=1;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		while(num!=0) {
			
			mul=mul*(num%10);
			num=num/10;
		}
		
		System.out.println("mul is:" +mul);
	}

}
