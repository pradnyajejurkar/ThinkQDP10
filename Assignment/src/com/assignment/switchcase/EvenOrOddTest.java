package com.assignment.switchcase;

import java.util.Scanner;

public class EvenOrOddTest {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int num=0;
	    
	    System.out.println("Enter the number:");
	    num=sc.nextInt();
	    
	    switch (num%2) {
	    case 0:
	    	 System.out.println(num + " : is a Even Number");
	    	 break;
	    case 1:
	    	 System.out.println(num + " : is a Odd Number");
	    	 break;
	  
	    }
	}
}
