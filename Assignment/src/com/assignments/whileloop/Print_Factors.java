package com.assignments.whileloop;

import java.util.Scanner;

public class Print_Factors {

	public static void main(String[] args) {
		
			int i,num;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter a number ::");
		    num = sc.nextInt();
		     
		      for(i = 2; i< num; i++) {
		         while(num%i == 0) {
		            System.out.println(i+" ");
		            num = num/i;
		         }
		      }
		      if(num >2) {
		         System.out.println(num);
		      }
		   }
		
	}


