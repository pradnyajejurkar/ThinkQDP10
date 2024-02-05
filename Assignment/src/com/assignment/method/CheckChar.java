package com.assignment.method;

import java.util.Scanner;

public class CheckChar {

	public static void charCheck(char ch) {
			
	if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
		System.out.println(ch + " is Alphabet "); 

		
	else if (ch >= '0' && ch <= '9') 
		System.out.println(ch + " is Digit "); 

	else
		System.out.println(ch + " is Special Character "); 
	} 
 
	public static void main(String[] args) { 
		char c; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charcter:");
		c=sc.next().charAt(0);
		charCheck(c); 
		} 
	} 

	 
