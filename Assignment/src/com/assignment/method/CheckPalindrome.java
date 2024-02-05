package com.assignment.method;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static int checkPalindorme(int n) {
		int rev=0;
		while(n!=0) {
			rev =rev*10+n%10;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		int reverse=checkPalindorme(num);
		if(num==reverse)
			System.out.println(num+ "is palindrome");
		else
			System.out.println(num+ " is not palindorme");
	}

}
