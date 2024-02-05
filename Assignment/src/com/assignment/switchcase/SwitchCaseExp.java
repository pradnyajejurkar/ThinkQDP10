package com.assignment.switchcase;

import java.util.Scanner;

public class SwitchCaseExp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     
		String country_code;
		
	    System.out.println("Enter country code from ( IND, USA, JPN, NZ, WI)");
		country_code=sc.next();
		
		 switch(country_code) {
		 case "IND":
		           System.out.println(country_code +" refers to INDIA");
		           break;  
		 case "USA":
		           System.out.println(country_code +" refers to UNITED STATES");
		           break;
		 case "JPN":
		           System.out.println(country_code +" refers to JAPAN");
		           break;
		 case "NZ":
		           System.out.println(country_code +" refers to NEW ZEALAND");
		           break;
		 case "WI":
		           System.out.println(country_code +" refers to WEST INDIES");
		           break;
		 default:
		           System.out.println("Invalid choice");
		        }
	}
}