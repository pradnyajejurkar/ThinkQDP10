package com.assignments.conditionalstatement;

import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 	
		int sp,cp,profit,loss;
		
		System.out.println("Enter the cost price:");
		cp=sc.nextInt();
		
		System.out.println("Enter the selling price:");
		sp=sc.nextInt();
		
		if(sp > cp) {
			
				profit= sp-cp;
				System.out.println("Profit is : " +profit);
		}
		else if(sp < cp) {
			
				loss= cp-sp;
				System.out.println("Loss is : " +loss);
		}
		else {
				System.out.println("There is No Profit No Loss");
			
		}

	}

}
