package com.assignment.method;

import java.util.Scanner;

public class CheckNegativeOrPositive {
	
	static Scanner sc=new Scanner(System.in);
	
		
	public static void countNum() {
			
		int num;
		char ch;
		
		int positvecount=0,negativecount=0,zerocount=0;
		do {
			System.out.println("Enter the number:");
			num=sc.nextInt();
			if(num>0) {
				System.out.println(num+ " number is negative");
				positvecount++;
			}else if(num<0) {
				System.out.println(num+ " number is negative");
				negativecount++;
			}else {
				System.out.println(num+ " number is zero");
				zerocount++;
			}
			System.out.println("Do you want to continue? if yes then enter y or stop enter any char");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("Positive count:" +positvecount);
		System.out.println("Negative count:" +negativecount);
		System.out.println(" Zero count:" +zerocount);
	}

	public static void main(String[] args) {
		countNum();
	}
}		

