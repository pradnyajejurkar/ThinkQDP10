package com.assignment.pattern;

import java.util.Scanner;

public class Pattern2a {

	public static void printpattern2a(int num) {
			int i,j;
			
			for(i=1;i<=num;i++) {
				
				for(j=1;j<=num;j++) {
					if(j%2==0)
						System.out.print("0 ");
					else
				         System.out.print("1 ");
			}
				System.out.println();
		}
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("enter num:");
			n=sc.nextInt();
			printpattern2a(n);
		}
		}