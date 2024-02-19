package com.throwdemo;

import java.util.Scanner;

public class VotingDemo {

	static void enterAge() {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter your age:");
	   int age=sc.nextInt();
	   try {
	   if(age<0) {
		   throw new RuntimeException("Invalid age: age is greater than 0" );
	   }
	   else
	   {
		   if(age>=18) {
			   System.out.println("you can vote");
		   }else
		   {
			   System.out.println("cannot vote");
		   }
	   }
	   }
	   catch(Exception e) {
		   System.out.println(e);
	   }
	}
public static void main(String[] args) {
	
	enterAge();
}
}