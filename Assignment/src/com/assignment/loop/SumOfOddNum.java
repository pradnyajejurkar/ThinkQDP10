package com.assignment.loop;
//7.Write a Java program to find sum of all odd numbers between 1 to n.
import java.util.Scanner;

public class SumOfOddNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num,sum=0;
		
		System.out.println("enter num:");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			if(i%2!=0) 
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of Odd Numbers upto " + num + "  =  " + sum);
		
	}

}

	

