package com.demo.dowhile;

import java.util.Scanner;

public class Test_do_while2 {

	public static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n1,n2,sum;
		char ch;
		do {
		System.out.println("Enter n1: ");
		n1=sc.nextInt();
		System.out.println("Enter n2:");
		n2=sc.nextInt();
		
		sum=add(n1,n2);
		System.out.println("Sum is:"+sum);
		System.out.println("Do you want to continue?? if yes enter y and for stop enter any character:");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		
		System.out.println("Thank you");
		System.out.println("End");
	}

}
