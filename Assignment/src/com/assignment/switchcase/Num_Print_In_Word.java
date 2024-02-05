package com.assignment.switchcase;

import java.util.Scanner;

public class Num_Print_In_Word {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number between (1-5):");
		num=sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Invaild number");
		}
		
		

	}

}
