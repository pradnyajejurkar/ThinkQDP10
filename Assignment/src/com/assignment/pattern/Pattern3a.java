package com.assignment.pattern;

import java.util.Scanner;

public class Pattern3a {

	public static void printPattern3a(int n)
		{
			int i, j;
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= i; j++) {
					
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
			printPattern3a(n);
		}
	}
