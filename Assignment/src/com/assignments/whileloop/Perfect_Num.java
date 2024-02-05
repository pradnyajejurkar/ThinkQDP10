package com.assignments.whileloop;

import java.util.Scanner;

public class Perfect_Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num,i,sum=0;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		//while(i<=num/2) 
		for(i=1;i<num;i++)
		{
			if(num%i==0) 
			{
				sum=sum+i;
			}
			
		}
		if(sum==num) {
			System.out.println(num+" is a perfect number");
		}
		else {
			System.out.println(num+" is not a perfect number ");
			
		}

	}

}
