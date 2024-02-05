package com.assignment.method;

import java.util.Scanner;

public class HighestNum {
	
		public static int checkDigit(int num){
		int rem,highest=0;

		while(num>0)
		{
		  rem=num%10;
		  if(highest<rem)
		  {
		  highest=rem;
		}
		num/=10;
	     }
		return highest;
	}	
		public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number: ");
		   int num=sc.nextInt();
		   int highest =checkDigit(num) ;
		
		
		
	
		System.out.println("The highest digit is:" +highest);
		}
	  }
		


