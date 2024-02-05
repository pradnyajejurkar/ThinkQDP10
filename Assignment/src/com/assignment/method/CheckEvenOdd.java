package com.assignment.method;

import java.util.Scanner;

public class CheckEvenOdd {
	
	public  static void isEven(int num) {
		
		 if(num%2==0) 
		    {
			System.out.println(num + " is even");
		    }
			if(num%6==0) 
		{
				System.out.println(num+" is divisible by 6");
			}
			else 
			{
				System.out.println(num+" not divisible by 6");
			}
			
			if(num%2!=0)
			{
			System.out.println(num+ " is odd");
			 
			if(num%5==0)
			{
				System.out.println(num +" divisible by 5");
			}
			else 
			{
				System.out.println(num + "not divisible by 5");
			}	
			}
	}
			

			public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n; 
			System.out.println("Enter number:");
			n=sc.nextInt();
			
		   isEven(n);
		}
}



