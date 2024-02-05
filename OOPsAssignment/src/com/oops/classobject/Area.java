package com.oops.classobject;
/*1.Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
 * First method named as11 'setDim' takes length and breadth of rectangle as parameters and the second 
 * method named as 'getArea' returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard.*/

public class Area {

	int length, breadth;

	public void setDim(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getArea() {
		int area = length * breadth;
		return area;
	}
	
	public void displayData() {
		System.out.println("Length is:" + length);
		System.out.println("Breadth is:" + breadth);
		System.out.println("Area is:"+getArea());
}
}

