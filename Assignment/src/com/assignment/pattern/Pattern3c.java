package com.assignment.pattern;

import java.util.Scanner;

public class Pattern3c {

	public static void printPattern3c(int n)
		{
			int i, j;
			int num = 1;
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= i; j++) {
					
					System.out.print(num + " ");
					num++;
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
			printPattern3c(n);
		}
			
	}
