package com.assignment.method;

import java.util.Scanner;

public class AlternateNum {

	public static boolean isPrime(int num) {
	if(num==0 || num==1) 
	{
		return false;
	}
	else 
	{
		int i;
	    for(i=2;i<=num/2;i++) 
	    {
		if(num%i==0) 
		{
			return false;
	    }
	 }
	    return true;
	
	} 

	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		boolean flag = true;
		int num1=2,count=0;
		while(count<10) 
		{
			if(isPrime(num1)) 
			{
				if(flag) 
				{
					System.out.println(num1);
					count++;
					flag=false;
				}
				else
				{
					flag=true;
				}
				
			}num1++;
		}
	 }

	}
