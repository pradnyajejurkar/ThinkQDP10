package com.custom;

import java.util.Scanner;

public class InputMarks {

	static void inputMarks()
	{
		Scanner sc=new Scanner(System.in) ;
		try {	
		System.out.println("Enter marks:");
		double marks=sc.nextDouble();
		
		if(marks<0 || marks>100)
			throw new InvalidMarksException("Marks should be between 0 and 100");

			System.out.println("Marks:"+marks);
			}
		
		catch(InvalidMarksException e) {
			System.out.println(e);
		}finally {
			sc.close();
		}
		
		}

	public static void main(String[] args) {
		inputMarks();
	}
}
