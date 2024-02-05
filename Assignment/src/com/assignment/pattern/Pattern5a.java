package com.assignment.pattern;

import java.util.Scanner;

public class Pattern5a {

	public static void printPattern5a(int rows)
	{
		int i, j;
		for (i =1; i>=rows; i++) {
			for (j =1; j <= i; j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter num:");
		n=sc.nextInt();
		printPattern5a(n);
	}
}