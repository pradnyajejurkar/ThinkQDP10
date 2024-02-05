package com.assignment.method;

import java.util.Scanner;

public class ISBN_Num {

		
		
		public static void main(String args[])
	    {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter number");
	      long num=sc.nextLong();
		System.out.println(checkISBNNum(num));
	    }
		public static int countDigit(long num) {
			int count=0;
			while(num!=0) {
				count++;
				num=num/10;
			}
			return count;
		}
		
		public static boolean checkISBNNum(long num){
			int count=countDigit(num);
			if(count!=0) 
			{
				return false;
			}
			else 
			{
				int i,sum=0,rem;
				for(i=1;i<=10;i++) 
				{
					rem=(int)(num%10);
					sum=sum+(rem*i);
					num=num/10;
				}
				return sum%11==0;
			 }
		}	
			
	}		
		


