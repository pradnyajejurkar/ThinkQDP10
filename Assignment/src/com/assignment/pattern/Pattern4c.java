package com.assignment.pattern;

import java.util.Scanner;

public class Pattern4c {

	
		public static void pattern4c(int rows) {
			int i,j;
			for(i=rows;i>=1;i--) {
				for(j=rows;j>=i;j--) {
					System.out.print(j + " " );
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("enter num:");
			n=sc.nextInt();
			pattern4c(n);
		}

	}