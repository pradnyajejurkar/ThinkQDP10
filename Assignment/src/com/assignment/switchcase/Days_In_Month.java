package com.assignment.switchcase;

import java.util.Scanner;

//. Write a Java program print total number of days in a month using switch case 

public class Days_In_Month {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	 	int month;
	 	
	 	System.out.println("Enter month number from 1 to 12(1= Jan and 12= Dec) :");
	 	month=sc.nextInt();
	 	
	 	switch(month) {
	 	case 1:
	 	case 3:
	 	case 5:
	 	case 7:
	 	case 8:
	 	case 10:
	 	case 12:
	 		   System.out.println("\n31 days in this month");
	 		   break;
	 	case 4:
	 	case 6:
	 	case 9:
	 	case 11:
	 			System.out.println("\n30 days in this month");
	 			break;
	 	case 2:
	 			System.out.println("\nEither 28 or 29 days in this month ");	
	 			break;
	 	
	 	default:
	 		    System.out.println("\n please enter vaild number between 1 to 12");
	 		
	 	}
	}

}
