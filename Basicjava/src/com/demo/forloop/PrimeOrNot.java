package com.demo.forloop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int i,num,count=0;
		
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			if(num%i==0) 
			{  
				count++;
			}
		}
          if(count==2) {
        	  {
        		  System.out.println(num + " is prime");
        	  }
          }
        	  else
        	  {
        		  System.out.println(num + " is not");
        	  }
          }
	}


