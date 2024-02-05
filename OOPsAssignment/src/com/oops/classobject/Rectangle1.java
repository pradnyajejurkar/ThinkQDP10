package com.oops.classobject;
/*6.
Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by 
creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth 
passed as parameters to its constructor.*/



class Rect1 {

	int length, breadth;

	public void setValue(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getArea()  {

		int area = length * breadth;
		return area;
	}

	public int getPerimeter() {
		int perimeter = (length + breadth) * 2;
		return perimeter;
	}

}

public class Rectangle1 {

	public static void main(String[] args) {
		
		Rect1 r1 = new Rect1();
		Rect1 r2 = new Rect1();
		
		r1.setValue(4, 5);
		r2.setValue(5, 8);
		
		System.out.println("Area is:" +r1.getArea());
		System.out.println("Perimeter is:"+r2.getPerimeter());
	}


	

}
