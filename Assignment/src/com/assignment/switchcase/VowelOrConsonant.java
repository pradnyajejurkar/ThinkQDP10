package com.assignment.switchcase;
//. Write a Java program to input any alphabet and check whether it is vowel or consonant 


import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char ch;
		
		System.out.println("Enter the alphabet:");
	
		ch=sc.next().charAt(0);
		
		
		switch(ch) {
		
		case 'a':
		case 'A':
		case 'e':
		case 'E':	
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':	
			System.out.println(ch + " : is a Vowels");
			break;
		default:
			System.out.println(ch + " : is c consonant ");
		}
		
		

	}

}
