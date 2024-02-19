package com.custom;

import java.util.Scanner;

public class InputRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		if(num>99999) {
			throw new OutOfRangeException("the range of number is out of bound");
		}
		}		
		catch(InvalidNameException e)
		{
			System.out.println(e);
		}
		finally {
			sc.close();
		}
	
	}

}
