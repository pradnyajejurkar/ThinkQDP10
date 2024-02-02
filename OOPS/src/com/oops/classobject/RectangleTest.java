package com.oops.classobject;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double length, breadth;
		System.out.println("Enter length of rectangle:");
		length = sc.nextDouble();
		System.out.println("Enter breadth of rectangle:");
		breadth = sc.nextDouble();
		
		Rectangle r1 = new Rectangle();
		r1.setValue(length, breadth);

		r1.displayData();

	}

}
