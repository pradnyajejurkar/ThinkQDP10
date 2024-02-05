package com.assignment.pattern;

import java.util.Scanner;

public class Pattern2b {

	public static void printpattern2b(int rows) {
		int i,j;
		
		for(i=1;i<=rows;i++) {
			
			for(j=1;j<=i;j++) {
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
		int r;
		System.out.println("enter rows:");
		r=sc.nextInt();
		printpattern2b(r);
	}
	}
