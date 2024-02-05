package com.assignment.loop;
//6.Write a Java program to find sum of all even numbers between 1 to n. 
import java.util.Scanner;

public class SumOfEvenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n=1,sum=0;
		
		System.out.println("enter num:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2==0) 
			{
				sum=sum+i;
		
			}
		}
			System.out.println("Sum is:" +sum);
		
	}

}
