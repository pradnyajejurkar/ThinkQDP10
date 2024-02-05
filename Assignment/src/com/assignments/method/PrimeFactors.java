package com.assignments.method;

import java.util.Scanner;

public class PrimeFactors {

	
	
	/*public static int isprime(int n){

	      for(int i = 2; i<=n/2; i++){
	        if(n%i==0)
	          return 0;
	        }
	      return 1;
	   }
	
	public static void primeFactors(int n)
	   {

	      for(int i = 2; i<= n; i++){
	          if(isprime(i)==1){
	            
	             while(n%i==0){
	                System.out.print(i + " ");
	                n /= i;
	             }
	          }
	       }

	   }*/
	
	public static void primeFactors(int n)
	  {

	    while (n % 2 == 0) {
	        System.out.print(2 + " ");
	        n /= 2;
	    }

	    for (int i = 3; i <=n/2; i++) {
	    	while (n % i == 0) { 
	    		System.out.print(i + " "); 
	    		n /= i; 
	    		}
	    	} if (n > 2)
	     System.out.print(n);
	  }

	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n=sc.nextInt();
	     primeFactors(n);
	   }
	}


