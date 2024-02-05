package com.assignments.conditionalstatement;
/* . Write a Java program to input electricity consumption unit and calculate totalelectricity billaccording to the given 
condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit 
above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill*/

import java.util.Scanner;

public class ElectricityBill {

	 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	        
			int unit;
			float amt,surcharge,bill_amt;
			System.out.println("Enter The Electricity Unit : ");
			unit=sc.nextInt();
			
				if(unit<=50)
				{			
					amt = unit*0.50f;
				}
				else if(unit<=150)
				{
					amt = 25+((unit - 50)* 0.75f);
				}
				else if(unit<=250)
				{
					amt = 100 +((unit -50) *1.20f);
				}
				else
				{
					amt =220+(( unit-50)*1.50f);
				}
		 
				surcharge = amt*0.2f;
				bill_amt = amt+surcharge;
				System.out.println("Total Electricity Bill : "+bill_amt);
			
		
}
}
	


