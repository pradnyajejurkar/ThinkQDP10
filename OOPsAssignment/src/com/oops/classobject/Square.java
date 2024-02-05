package com.oops.classobject;

import java.util.Scanner;

/*11)
write a java program to calculate square for given number using no return type ,with return type,
with parameter passing, with parameter and return type.*/
public class Square {
	int square;
	public int calSquare(int n) {
		return n * n;

	}

	public void calSqr(int n) {
		
		square = n * n;
		System.out.println("Square is:" + square);
	}
	
	public int sqrCal(int n) {
		
		square =n*n;
		System.out.println("square:"+square);
		return square;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("enter number:");
		n=sc.nextInt();
		
		Square s1=new Square();
		int square=s1.calSquare(n);
		
		s1.calSqr(n);
		s1.sqrCal(n);
		
		System.out.println("Square:"+square);
	}

}
