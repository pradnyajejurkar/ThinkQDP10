package com.demo.conditionalstatement;

import java.util.Scanner;

public class TestEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		     int num;
		     System.out.println("Enter the number:");
		     num=sc.nextInt();
		
		     if(num % 2==0) {
			       System.out.println(num+ " :number is even ");
		      }
		
		     else {
			       System.out.println(num+ " :number is odd");
		      }

		}

	}



