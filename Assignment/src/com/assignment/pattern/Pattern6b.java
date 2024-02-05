package com.assignment.pattern;

import java.util.Scanner;

public class Pattern6b {

	public static void printPattern6b(int rows) {
	        	
	        int i,j;
	        for (i = 0; i <= rows; i++) 
	        {
	            for (j = 0; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }
	 
	            System.out.println();
	        }
	}

		    public static void main(String[] args) {
	    
	    
	        Scanner sc= new Scanner(System.in);      
	        System.out.println("Number of rows ");         
	        int rows = sc.nextInt(); 
	        printPattern6b(rows);
		    }
	}
