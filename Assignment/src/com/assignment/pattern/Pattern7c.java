package com.assignment.pattern;

import java.util.Scanner;

public class Pattern7c {
	public static void pattern7c(int rows) {
		int i,j;
		
		for(i=rows;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(i=2;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);      
        System.out.println("Number of rows ");         
        int rows = sc.nextInt(); 
        pattern7c(rows);
	    }
	}

