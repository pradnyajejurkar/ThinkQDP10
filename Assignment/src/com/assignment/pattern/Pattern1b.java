package com.assignment.pattern;

import java.util.Scanner;

public class Pattern1b {

	public static void printpattern1b(int rows) {
		int i,j;
		
		for(i=rows;i>=1;i--) {
			
			for(j=1;j<=i;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r;
		System.out.println("enter rows:");
		r=sc.nextInt();
		printpattern1b(r);
	}
	}