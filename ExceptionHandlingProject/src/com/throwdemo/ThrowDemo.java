package com.throwdemo;

import java.util.Scanner;

public class ThrowDemo {

	static void enterMarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		
		System.out.println("Enter marks:");
		double marks=sc.nextDouble();
		
		
		//explicitly we are throwing an exception
		//we need to create instance of exception
		//using try and catch bolck we can haddled exception
		
		try {
		if(marks<0 || marks>100) {
			throw new RuntimeException("Invalid Marks: marks should be between 0 and 100");
		}
		else
		{
			if(marks>=33) {
				System.out.println(name+" has cleared the exam");
			}
			else
			{
				System.out.println(name+" has failed!!");
			}
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest code");
	}
	
	public static void main(String[] args) {
		enterMarks();
	}

}
