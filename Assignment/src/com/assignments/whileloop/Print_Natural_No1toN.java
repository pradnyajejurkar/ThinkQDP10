package com.assignments.whileloop;

import java.util.Scanner;

public class Print_Natural_No1toN {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n,i=1;
		
	    System.out.println("Enter Value till the Natural numbers to be printed :");
		n = sc.nextInt();
		System.out.println("Natural number till "+n+ " are :");
		while(i<=n) 
		{
		System.out.println(i);
		i++;
		}
				
	}
}
		