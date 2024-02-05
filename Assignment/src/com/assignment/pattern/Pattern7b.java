package com.assignment.pattern;

import java.util.Scanner;

public class Pattern7b {


		public static void pattern7b(int rows) {
			int i,j;
			for(i=rows;i>=1;i--) {
				for(j=i;j<=rows;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("enter num:");
			n=sc.nextInt();
			pattern7b(n);
		}
	}
