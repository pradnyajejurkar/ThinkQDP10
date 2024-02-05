package com.labsession.conditionstatement;
import java.util.Scanner;
// Write a Java program to find maximum between three numbers
public class MaxNum {

	
      public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
			
			 int num1,num2,num3;
			 System.out.println("Enter the Number1 : ");
			 num1 = sc.nextInt();
					
			System.out.println("Enter the Number2 : ");
			num2 = sc.nextInt();
			
			System.out.println("Enter the Number3:");
			num3= sc.nextInt();
					
			if(num1>num2 && num1>num3) {
					System.out.println("Maximum Number is " +num1);
							
			}else if(num2>num1 && num2>num3) {
					System.out.println("Maximum Number is " +num2);
							
			}else 
			{
				System.out.println("Maximum number is: " +num3);
			}
					
				
      }
	}


