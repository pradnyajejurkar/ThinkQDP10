package com.demo.forloop;

import java.util.Scanner;

public class Fact_Of_Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num,i,fact=1;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		for(i=num;i>=1;i--) 
		{
			fact=fact*i;
		}
       System.out.println("Factorial result = " +fact);
	}

}
