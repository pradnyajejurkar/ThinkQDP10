package com.assignmet.nestedloop;

import java.util.Scanner;

public class findReverse {

	public static int findReverse(int n) {
		
		int i,rev=0,rem;
		for(i=1;i<=n;i++) {
		while(n!=0) {
			rem=n%10;
			rev=rev*10+n%10;
			n=n/10;
		}
		}
		return rev;
		
	}
	public static void printReverse(int min,int max) {
	
		for(int i=min;i<=max;i++) {
	
			System.out.println(i +"="+(findReverse(i)));
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Revrse of number between 151 to 159:");	
	     printReverse(151,159);;
	}

}
