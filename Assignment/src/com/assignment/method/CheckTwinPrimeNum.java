package com.assignment.method;

import java.util.Scanner;

public class CheckTwinPrimeNum {

	static Scanner sc=new Scanner(System.in);
      public static boolean checkPrime(int n) {
		
		int count=0;
		int i;
		for(i=2;i<=n/2;i++) {
			if(n%i==0)
			count++;
		}
		if(count==0)
			return true;
		else
			return false;
	  }
	
	  public static int checkTwinPrime(int n1,int n2) {
		if(checkPrime(n1) && checkPrime(n2))
		return n2-n1;
		return 0;
	  }  
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		 System.out.println("enter the number:");  
		 int num=sc.nextInt();
		
		 boolean status=checkPrime(num);
		 if(status)
			System.out.println(num+" is prime");
		 else
			System.out.println(num+" is not prime");
		
		
		//twin prime 
		 int n1,n2;
		System.out.println("Enter the value of n1 and n2:");
		 n1=sc.nextInt();
	    n2=sc.nextInt();
		System.out.println(checkTwinPrime(n1, n2));
		if(checkTwinPrime(n1, n2)==2) {
			System.out.println("twin prime");
		}
		else {
			System.out.println("not twin prime");
		}
	}

}