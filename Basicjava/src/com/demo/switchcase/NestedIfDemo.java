package com.demo.switchcase;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
		System.out.println("-----Welcome to Myntra-----");
		System.out.println("1.Men\n2.Women\n3.Kids");
		System.out.println("Enter you choice:");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("----Welcome to the Mens section-----");
			System.out.println("1.Footwear\n2.Cloths\n3.Wallet");
			System.out.println("Ente your choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("you selected footwear");
				break;
			case 2:
				System.out.println("you selected cloths");
				break;
			case 3:
				System.out.println("you selected wallet");
				break;
				
			default:
				System.out.println("invalid choice");
			}
		
	         break;  //
		case 2:
			System.out.println("----Welcome to the Womens section-----");
			System.out.println("1.Jewellery\n2.Sarees\n3.Dresses");
			System.out.println("Ente your choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("you selected Jewellery");
				break;
			case 2:
				System.out.println("you selected Sarees");
				break;
			case 3:
				System.out.println("you selected Dresses");
				break;
			
			default:
				System.out.println("invalid choice");
			}
			break;
		 case 3:
			 System.out.println("----Welcome to the Kids section-----");
				System.out.println("1.Books\n2.Toys");
				System.out.println("Ente your choice:");
				choice=sc.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("you selected Books");
					break;
				case 2:
					System.out.println("you selected Toys");
					break;
				}
			
		        default:
				    System.out.println("Invalid choice");
				
		  }			
	}
}
	


