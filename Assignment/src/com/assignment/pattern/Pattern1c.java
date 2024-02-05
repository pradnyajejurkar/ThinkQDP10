package com.assignment.pattern;

import java.util.Scanner;

public class Pattern1c {

	 public static void printPattern1c(int n)
	    {
	        int i, j;
	        for (i = 1; i <= n; i++) {
	        	for (j = 1; j <= n; j++) {
	                System.out.print("@");
	            }
	        	System.out.println();
	        }
	    }
	 
	    
	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
			int num;
			System.out.println("enter num:");
			num=sc.nextInt();
			
	        printPattern1c(num);
	    }
	}