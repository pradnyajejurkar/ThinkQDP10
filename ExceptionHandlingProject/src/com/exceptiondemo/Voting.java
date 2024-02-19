package com.exceptiondemo;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the age :");
		    int age=sc.nextInt();
		
		    if(age>=18) 
		    {
			   System.out.println("vote");
		    }
		    else
		    {
		    	System.out.println("Cannot vote");
		    }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
			System.out.println("in finally block");
		}
		System.out.println("voting close....");
	}

}
