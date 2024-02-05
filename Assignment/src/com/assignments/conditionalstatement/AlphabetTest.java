package com.assignments.conditionalstatement;
/* Write a Java program to input any character and check whether it is alphabet, digit or 
special character*/
 

import java.util.Scanner;

public class AlphabetTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
      char ch;
	  System.out.println("Enter any char : ");
	  ch=sc.next().charAt(0);
	  if(( ch >= 'a' && ch <= 'z' )||( ch >= 'A' && ch <= 'Z' ))
	  {
	   System.out.println(ch+ " is Alphabet ");
	  }
	  else if( ch >= '0' && ch <= '9' )
	  {
	   System.out.println(ch+ " is Digit");
	  }
	  else
	  {
	   System.out.println(ch+ " is spacial Character ");
	  }
	 }
	}


	


