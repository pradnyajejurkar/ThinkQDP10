package com.assignments.method;

import java.util.Scanner;

public class SumOffOddNum {

	
	
	public static int calSum2(int num) {
	
    int i,sum=0;
	for(i=1;i<=num;i++) {
		if(i%2!=0) 
		{
			sum=sum+i;
		}
	}
	return sum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		int sum=(calSum2(num));
		 
		System.out.println("sum of 1 to n odd numbers:" + sum);
	}
	}


