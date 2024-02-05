package com.assignments.conditionalstatement;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
			int num1,num2;
			char operation;
			
			System.out.println("Enter first and second number: ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			System.out.println("Enter any operation from(+,-,/,*,%) : ");
			operation=sc.next().charAt(0);
			
			if(operation == '+') 
			{
				System.out.println("Your answer is = " +(num1+num2));
				
			}
			else if(operation == '-') 
			{
				System.out.println("Your answer is = " +(num1-num2));
			}
			else if(operation == '/')
			{
				System.out.println("Your answer is = " +(num1/num2));
			}
			else if(operation == '*')
			{
				System.out.println("Your answer is = " +(num1*num2));
			}
			else if(operation == '%')
			{
				System.out.println("Your answer is = " +(num1%num2));
			}
		
				
		
	}		
			
}			
			
			
			
			
		
		     
		
	

