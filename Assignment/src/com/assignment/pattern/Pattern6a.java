package com.assignment.pattern;

import java.util.Scanner;

public class Pattern6a {


		public static void printPattern6a(int n)
			{
				int i, j;
				char ch  = 'A';
				for (i = 0; i <n; i++) {
					for (j = 0; j <= i; j++) {
						
						System.out.print(ch++ );
						
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
				printPattern6a(n);
			}
				
			}