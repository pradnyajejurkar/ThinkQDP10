package com.assignment.pattern;

import java.util.Scanner;

public class Pattern7a {
	
 public static void Pattern7a(int rows) {
	 
	 	int i,j;
        for (i = 1; i <= rows; i++) 
        {
            for (j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
 }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
     
            System.out.println("Number of rows");
            int rows = sc.nextInt();
            Pattern7a(rows);
            
    }
}