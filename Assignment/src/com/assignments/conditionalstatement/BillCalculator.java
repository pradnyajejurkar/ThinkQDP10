package com.assignments.conditionalstatement;

import java.util.Scanner;

public class BillCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int quantity;
		double price=50,total=0,totalbill=0;
		
		System.out.println("Please enter quantity of product:");
		quantity=sc.nextInt();
		
		total=quantity*price;
		
		if(quantity<=10) {
			  System.out.println("This is total with no discount");
			 totalbill=total;
		}
		    else if(quantity<=25) {
			  System.out.println("This is total with 5% discount");
			  totalbill=total-(0.05*total);
		    }
		    else if(quantity<=50) {
	           System.out.println("This is total with 10% discount");
	           totalbill=total-(0.1*total);
	        }
	        else {
		   
			System.out.println("This is total with 20% discount");
		    totalbill=total-(0.2*total);
	        }
		    
		    System.out.println("total is:" +total);
		    System.out.println("total bill to pay:" +totalbill);
	}  

	}


