package com.assignments.whileloop;

import java.util.Scanner;

public class BouncyNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Enter number you want to check:");
		num=sc.nextInt();
		boolean inc=false,dec=false;
		int rem1,rem2;
		while(num>10) {
			rem1=num%10;
			System.out.println(rem1);
			num/=10;
			rem2=num%10;
			System.out.println(rem2);
			if(rem1>rem2) {
				dec=true;
			}else if(rem1<rem2) {
				inc=true;
			}
			System.out.println(num);
		}

	}

}
