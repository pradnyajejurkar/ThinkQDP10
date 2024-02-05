package com.assignments.whileloop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sum=0,num,rem;
		
		System.out.println("enter the number: ");
		num=sc.nextInt();
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum of number is:" +sum);

	}

}
