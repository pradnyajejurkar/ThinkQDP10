package com.demo.method;

import java.util.Scanner;

public class PalindromeOrNot {

	public static int checkPalindrome(int n) {
		int rev=0;
		 
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		int reverse=checkPalindrome(num);
		
		System.out.println("Reverse of number:" +reverse);
		
		if(num==reverse) 
			System.out.println(num + " is a palindrome");
		else
			System.out.println(num + " is not palindrome");
		}

	}


