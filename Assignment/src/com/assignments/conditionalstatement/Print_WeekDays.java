package com.assignments.conditionalstatement;
//Write a Java program to input week number and print week day.

import java.util.Scanner;

public class Print_WeekDays {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
		int num;
		System.out.println("Enter the week number (1-7) :");
		num=sc.nextInt();
		
		if(num == 1) {
			System.out.println("This is a Sunday");
		}
		else if(num ==2) {
			System.out.println("This is a Monday");
		}
		else if(num ==3) {
			System.out.println("This is a Tuesday");
			
		}
		else if(num ==4) {
			System.out.println("This is a Wednesday");
		}
		else if(num ==5) {
			System.out.println("This is a Thursday");
		}
		else if(num ==6) {
			System.out.println("This is a Friday");
		}
		else if(num ==7) {
			System.out.println("This is a Saturday");
        }
		else{
			System.out.println("Enter 1 t0 7...");
		}
			
		}
}
