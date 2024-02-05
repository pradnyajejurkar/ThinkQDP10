package com.assignments.conditionalstatement;
//Write a Java program to find maximum between two numbers.

import java.util.Scanner;
public class MaximumNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	        int num1,num2;
			System.out.println("Enter the Number1 : ");
			num1 = sc.nextInt();
			
			System.out.println("Enter the Number2 : ");
			num2 = sc.nextInt();
			
			if(num1>num2) {
					System.out.println("Maximum Number is " +num1);
					
			}else if(num1<num2) {
					System.out.println("Maximum Number is " +num2);
					
			}else
					System.out.println("Both are Equal " +num1);
			}
		}
