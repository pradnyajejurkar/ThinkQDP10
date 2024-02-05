package com.demo.switchcase;

import java.util.Scanner;

public class Test_switch_case1 {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	
	    int choice;
	    
	    System.out.println("---Welcome to the CCD---");
	    System.out.println("1.Tea\n2.Coffe\n3.Sandwitch\n");
	    
	    System.out.println("Enter your choice:");
	    choice= sc.nextInt();
	    
	    switch(choice) {
	    case 1:
	    	System.out.println("Tea for Rs 30");
	    	break;
	    case 2:
	    	System.out.println("Coffe for Rs 100");
	    	break;
	    case 3:
	    	System.out.println("Sandwitch for Rs 200");
	    	break;
	    default:
	    	System.out.println("This option is not available");
	    	
	    	
	    }
	}

}
