package com.assignments.conditionalstatement;
//Write a Java program to check whether a character is uppercase or lowercase alphabet.
import java.util.Scanner;

public class Lower_UpperTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	   
	  char ch;
	  
	  System.out.println("Enter the alphabet:");
	  ch=sc.next().charAt(0);
	  
	  if(ch >= 'a' && ch <= 'z') {
		  System.out.println(ch + " :This is Lowercase alphabet");
	  }
	  else {
		  System.out.println(ch + " :This is Uppercase alphabet");
	  }

	}

}
