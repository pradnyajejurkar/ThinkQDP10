package com.assignment.pattern;

import java.util.Scanner;

public class Pattern2c {
	public static void printpattern2c(int rows) {
		int i,j,temp=1;
		
		for(i=1;i<=rows;i++) {
			
			for(j=1;j<=rows;j++) {
				System.out.print(temp);
				if(temp==1)
					temp=0; 
				else
			         temp=1;
		}
			System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter num:");
		n=sc.nextInt();
		printpattern2c(n);
	}
	}