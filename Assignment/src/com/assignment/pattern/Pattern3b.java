package com.assignment.pattern;

import java.util.Scanner;

public class Pattern3b {
	
		public static void printPattern3b(int n)
		{
			int i, j;
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= n ; j++) {
			}
				for (j = 1; j <= i; j++) {
					System.out.print(i + " ");
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
			printPattern3b(n);
		}
}