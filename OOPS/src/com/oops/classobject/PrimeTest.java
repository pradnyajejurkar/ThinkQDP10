package com.oops.classobject;

public class PrimeTest {

	public static void main(String[] args) {
	  PrimeNum p1=new PrimeNum(7);
	  
	  
	  if(p1.checkPrime()) 
		  System.out.println(p1.num +"is prime number");
		  else
			  System.out.println(p1.num + "is not prime number");
	  }
	}


