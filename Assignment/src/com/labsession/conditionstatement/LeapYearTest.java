package com.labsession.conditionstatement;
//using ternary operator
// Write a Java program to check whether a year is leap year or not 
import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int year;
	String res;
	System.out.println("Enter the year:");
	year=sc.nextInt();

	
	res=(year%400 ==0) ||  (year%4 ==0 && year%100!=0 ) ? "leap year ":" not a leap year ";
	System.out.println(res);
	/*if(res ==1) {
		System.out.println(year + " is a leap year");
	}
	else
	{
		System.out.println(year + " is not a leap year");*/
	}
	
	}


