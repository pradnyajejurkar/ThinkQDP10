package com.oops.classobject;
/*4.
Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
a class named 'Triangle' without any parameter in its constructor.*/

public class Triangle {
	
	double side1;
	double side2;
	double side3;
	
	public void setValues(double side1,double side2,double side3) {
		 this.side1=side1;
		 this.side2=side2;
		 this.side3=side3;
		
	}
	
	public void printArea() {
		double area=0.5*side1*side2;
		System.out.println("Area is:"+area);
	}
	
	public void printPerimeter() {
		double perimeter=side1+side2+side3;
		System.out.println("Perimeter is:"+perimeter);
	}

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.side1=3;
		t.side2=4;
		t.side3=5;
		
		t.printArea();
		t.printPerimeter();
		}

}
