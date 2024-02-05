package com.assignment.switchcase;

import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		char operator;
		Double num1,num2,result;
		
		System.out.println("Enter the first and second number:");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		
		System.out.println("choose an operator(+,-,*,/ and %):");
		operator=sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			 result=num1 + num2;
			 System.out.println("Result is :" +result );
			 break;
		case '-':
			 result=num1 - num2;
			 System.out.println("Result is :" +result );
			 break;
		case '*':
			 result=num1 * num2;
			 System.out.println("Result is :" +result );
			 break;
		case '/':
			 result=num1 / num2;
			 System.out.println("Result is :" +result );
			 break;
		case '%':
			result=num1 % num2;
			 System.out.println("Result is :" +result );
			 break;
		default:
			System.out.println("Invaild operator");
			 	
	   
		}

	}

}
