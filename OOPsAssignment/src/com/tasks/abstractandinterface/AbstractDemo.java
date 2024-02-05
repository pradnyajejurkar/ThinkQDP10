package com.tasks.abstractandinterface;
/*Write a Java program to create an abstract class Shape with abstract methods calculateArea()
 and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods 
to calculate the area and perimeter of each shape.
*/

abstract class Shape {
	abstract void calculateArea();

	abstract void calculatePerimeter();
}

class Cricle extends Shape {
	private double radius;

	public Cricle() {

	}

	public Cricle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {

		double area=3.14*radius*radius;
		System.out.println("Area of cricle:"+area);
	}

	@Override
	public void calculatePerimeter() {
		double peri=2*3.14*radius;
		System.out.println("Perrimeter of circle:"+peri);

	}

}

class Triangle extends Shape{
	protected double height;
	protected double width;
	
	public Triangle() {
		
	}
	
	
	
	public Triangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}



	@Override
	void calculateArea() {
		double area=0.5*height*width;
		System.out.println("Area of traingle is:"+area);
		
		
	}

	@Override
	void calculatePerimeter() {
		double peri=
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
