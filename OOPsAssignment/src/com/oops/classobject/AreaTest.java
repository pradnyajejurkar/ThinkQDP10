package com.oops.classobject;

import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length, breadth;
		System.out.println("Enter length of rectangle:");
		length = sc.nextInt();
		System.out.println("Enter breadth of rectangle:");
		breadth = sc.nextInt();
		
		Area A1=new Area();
		A1.setDim(length, breadth);
		A1.getArea();
		A1.displayData();

	}

}
