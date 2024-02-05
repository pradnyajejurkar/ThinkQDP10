package com.oops.classobject;

public class Triangle2 {

	double side1;
	double side2;
	double side3;

	public void printArea(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

		double area = 0.5 * side1 * side2;
		System.out.println("Area is:" + area);
	}

	public void printPerimeter(int side1,int side2,int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

		double perimeter = side1 + side2 + side3;
		System.out.println("Perimeter is:" + perimeter);
	}

	public static void main(String[] args) {
		Triangle2 t1 = new Triangle2();
		

		t1.printArea(3,4,5);
		t1.printPerimeter(3,4,5);
	}

}
