package com.assignments.whileloop;

import java.util.Scanner;

public class NumPrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			int i = 2,num;
			boolean flag = false;		
			System.out.println("Enter the Number:");
			num = sc.nextInt();		
			while(i<=num/2) {			
			if(num%i == 0) {
			flag = true;
			break;
			}
			i++;
			}		
			if (!flag)
				  System.out.println(num + " is a prime number.");
				    else
				      System.out.println(num + " is not a prime number.");
				sc.close();
			}	  
		

	}


