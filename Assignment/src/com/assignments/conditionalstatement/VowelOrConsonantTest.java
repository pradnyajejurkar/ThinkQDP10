package com.assignments.conditionalstatement;
//Write a Java program to input any alphabet and check whether it is vowel or consonant.

import java.util.Scanner;

public class VowelOrConsonantTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

		        char ch;
		        System.out.println("Enter the alphabet:");
		        ch=sc.next().charAt(0);

		        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'|| ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' ) {
		        	  System.out.println(ch + " is vowel");
		        }
		        else {
		            System.out.println(ch + " is consonant");
		        }
		    }
		}
