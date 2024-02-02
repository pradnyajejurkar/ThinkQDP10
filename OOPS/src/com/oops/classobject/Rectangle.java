package com.oops.classobject;

public class Rectangle {

	double length, breadth;

	public void setValue(double length, double breadth) {

		this.length = length;
		this.breadth = breadth;
	}

	public double calArea() {

		double area = length * breadth;
		return area;
	}

	public double calPerimeter() {
		double perimeter = (length + breadth) * 2;
		return perimeter;
	}

	public void displayData() {
		System.out.println("Length is:" + length);
		System.out.println("Breadth is:" + breadth);
		System.out.println("Area is:" + calArea());
		System.out.println("Perimeter:" + calPerimeter());

	}
}
