package com.assignment.pattern;

import java.util.Scanner;

public class Pattern5b {
		public static void pattern5b(int rows) {
			int i,j;
			char ch='A';
			for(i=rows;i>=1;i--) {
				for(j=rows;j>=i;j--) {
					System.out.print(ch++);
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("enter num:");
			n=sc.nextInt();
			pattern5b(n);
		}

	}