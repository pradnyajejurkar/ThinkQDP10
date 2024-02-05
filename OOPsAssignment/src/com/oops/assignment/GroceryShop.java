package com.oops.assignment;

import java.util.Scanner;

public class GroceryShop {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void enterItemDetails(Item i)
	{
		System.out.println("Enter item id:");
		i.setItemid(sc.nextInt());
		//i.setItemid(101);
		
		System.out.println("Enter item name:");
		i.setItemname(sc.next());
		
		System.out.println("Enter item cost:");
		i.setCost(sc.nextDouble());
		
		System.out.println("Enter the quantity:");
		i.setQty(sc.nextInt());
		
	}
	
public static void main(String[] args) {
		
		Item i1= new Item();
		enterItemDetails(i1);
		
	
		Item i2= new Item();
		enterItemDetails(i2);
		
		
//		System.out.println("Enter the discount on groceryshop:");
//		double disc= sc.nextDouble();
		System.out.println("-----------------------------");
		System.out.println(i1);
		System.out.println("Amount to pay:"+i1.calDiscountedPrice(10));
		System.out.println(i2);
		System.out.println("Amount to pay:"+i2.calDiscountedPrice(20));
		
	  
		i1.compareCost(i2);
	}
}


	