package com.demo.switchcase;

import java.util.Scanner;

public class Test_switch_case2 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
		char choice;
	    
	    System.out.println("---Welcome to the CCD---");
	    System.out.println("A.Tea\nB.Coffe\nC.Sandwitch\n");
	    
	    System.out.println("Enter your choice:");
	    choice= sc.next().charAt(0);
	    
	    switch(choice) {
	    case 'a':
	    case 'A':
	    	System.out.println("Tea for Rs 30");
	    	break;
	    case 'b':
	    case 'B':
	    	System.out.println("Coffe for Rs 100");
	    	break;
	    case 'c':
	    case 'C':
	    	System.out.println("Sandwitch for Rs 200");
	    	break;
	    default:
	    	System.out.println("This option is not available");
	    	
	    	
	    }
	}

}

	


