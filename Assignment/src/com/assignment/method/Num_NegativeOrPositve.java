package com.assignment.method;

import java.util.Scanner;

public class Num_NegativeOrPositve {

	public static void numTest(int num) {
		if(num>0) {
			System.out.println(num+ " number is positive");
		}
		else if (num<0){
			System.out.println(num+ " number is negative");
		}else {
			System.out.println(num + " number is zero");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("enter the number:");
		n=sc.nextInt();
		
		numTest(n);

	}

}
