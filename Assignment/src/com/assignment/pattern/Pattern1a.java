package com.assignment.pattern;

import java.util.Scanner;

public class Pattern1a {

	public static void printpattern1a(int rows) {
			int i,j;
			
			for(i=1;i<=rows;i++) {
				
				for(j=1;j<=i;j++) {
					System.out.print("1 ");
				}//inner loop ends
				System.out.println();
			}//outer loop ends
		}//method ends
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int r;
			System.out.println("enter rows:");
			r=sc.nextInt();
			printpattern1a(r);
		}

}


	