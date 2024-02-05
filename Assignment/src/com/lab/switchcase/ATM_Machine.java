package com.lab.switchcase;

import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double bal=10000,amount;
		int choice;
		
		System.out.println("1.Deposit\n2. Withdraw\n3.View Balance");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
		
		      System.out.println("Enter the amount you want deposit:");
		      amount=sc.nextDouble();
		      bal=bal+amount;
		      System.out.println("Total is:" +bal);
		      break;
		
		case 2:
			 
			System.out.println("Enter the amount you want to withdraw");
			amount=sc.nextDouble();
			bal=bal-amount;
			System.out.println("total is:" +bal);
			break;
			
		case 3:
			 
			System.out.println("balance is:" +bal);
			break;
	   default:
		   System.out.println("Invalid choice");
		   

	}

}
}