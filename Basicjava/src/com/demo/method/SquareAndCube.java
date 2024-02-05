package com.demo.method;

import java.util.Scanner;

public class SquareAndCube {
	
		public static int square(int n) {
			return n*n;
		}
	   
		public static int cube(int n) {
			return n*n*n;
		}
	
		//create method which shows cube of number
		public static void showCubes(int range) {
		  int i;
		  for(i=1;i<=range;i++) {
			  System.out.println(i+"="+cube(i));
		  }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		System.out.println("Square is:"+square(num));
		System.out.println("cube is:"+cube(num));
		
		showCubes(10);
	}

}
