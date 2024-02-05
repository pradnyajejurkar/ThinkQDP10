package com.labsession.conditionstatement;

import java.util.Scanner;

public class Electricity_Bill {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
		int unit;
		float bill_amt=0;
		
		System.out.println("Enter the Units consumed by user:");
		unit=sc.nextInt();
		
		if(unit<=50) {
			bill_amt=100+(unit*2);
		}
		else if(unit<=80) {
			bill_amt=100+(50*2)+(unit-50)*3;
		}
		else if (unit<=100) {
			bill_amt=100+(50*2)+(30*3)+(unit-80)*4;
		}
		else if(unit>100) {
			bill_amt=100+(50*2)+(30*3)+(20*4)+(unit-100)*7;
		}
		System.out.println("Total Electricity Bill : "+bill_amt);

	}

}
