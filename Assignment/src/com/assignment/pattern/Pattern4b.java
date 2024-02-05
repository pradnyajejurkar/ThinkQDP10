package com.assignment.pattern;

import java.util.Scanner;
public class Pattern4b {

		public static void printPattern4b(int rows)
		{
			int i, j;
			for (i = 1; i <=5; i++) {
				for (j = rows; j >=i; j--) {
					
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
			printPattern4b(n);
		}
	}