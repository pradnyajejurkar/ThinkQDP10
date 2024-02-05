package com.assignment.method;

import java.util.Scanner;

public class ProfitLoss {
 
	 public static int calProfit(int sp,int cp) {
	   int profit;
	   profit=sp-cp;
	   //System.out.println("profit is:");
	   return profit;
	   
	 }
	 
	 public static int calLoss(int sp,int cp) {
		 int loss;
		 loss=cp-sp;
		 return loss;
	 }
		 
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
			int sellprice,costprice;
			
			System.out.println("Enter the cost price:");
			costprice=sc.nextInt();
			System.out.println("Enter the selling price:");
			sellprice=sc.nextInt();
			
			if(sellprice>costprice) {
				 System.out.println("profit is: " +calProfit(sellprice,costprice));
			   }else { 
			     System.out.println("loss is: " +calLoss(sellprice,costprice));
			 }
	
	   }
	}


