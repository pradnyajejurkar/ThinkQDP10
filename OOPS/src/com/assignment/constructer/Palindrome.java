package com.assignment.constructer;

import java.util.Scanner;

public class Palindrome {
	int num;

	public Palindrome() {

	}

	public Palindrome(int num) {
		this.num = num;
	}

	public boolean checkPalindrome() {
		int rev=0,rem,temp=num;
		int original=num;
		while(temp!=0) {
			
			rev=rev*10+temp%10;
		temp/=10;
		}
	
		if(original==rev)
		        return true;
			return false;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Enter the number:");
		num = sc.nextInt();

		Palindrome p1=new Palindrome(num);
		
		
		if(p1.checkPalindrome()) {
			System.out.println(p1.num+" is palindrome");
		}
		else {
			System.out.println(p1.num+" is not a palindrome");
		}
	}
}