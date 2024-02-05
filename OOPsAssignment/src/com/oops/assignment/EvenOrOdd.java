package com.oops.assignment;

import java.util.Scanner;

public class EvenOrOdd {

	int num;

	public EvenOrOdd() {

	}

	public EvenOrOdd(int num) {

		this.num = num;
	}

	public boolean checkEvenAndOdd() {

		return num % 2 == 0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=sc.nextInt();
	
		EvenOrOdd e1=new EvenOrOdd(num);
		
		if(e1.checkEvenAndOdd())
			System.out.println(e1.num+" is even number");
		else
		    System.out.println(e1.num+" is odd number");
	}

}
