package com.assignment.loop;
//14.WAP to accept base and index from user and calculates power
import java.util.Scanner;

public class CalPower {
	
			
		 public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);

			    int base=0,index=0;

			    long result = 1;
			    System.out.println("Enter base:");
			    base=sc.nextInt();
			    System.out.println("Enter Index:");
			    index=sc.nextInt();
			    
			    for (; index != 0; --index) {
			      result=result*base;
			    }

			    System.out.println("Answer = " + result);
			  }
			}


