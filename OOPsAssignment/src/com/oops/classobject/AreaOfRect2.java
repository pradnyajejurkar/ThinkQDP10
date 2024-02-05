package com.oops.classobject;
/*7.
Write a program to print the area of a rectangle by creating a class named 'Area' taking 
the values of its length and breadth as parameters of its constructor and having a 
method named 'returnArea' which returns the area of the rectangle.
Length and breadth of rectangle are entered through keyboard.*/

import java.util.Scanner;

class RectA{
	
	double length, breadth;

	public void setValue(double length, double breadth) {

		this.length = length;
		this.breadth = breadth;
	}
	
	public double returnArea() {
		
		return length*breadth;
	}
}
public class AreaOfRect2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double length, breadth;
		System.out.println("Enter length of rectangle:");
		length = sc.nextDouble();
		System.out.println("Enter breadth of rectangle:");
		breadth = sc.nextDouble();
		
		RectA r=new RectA();
		r.setValue(length, breadth);
		

		System.out.println("Area is:" +r.returnArea());
	}

}
