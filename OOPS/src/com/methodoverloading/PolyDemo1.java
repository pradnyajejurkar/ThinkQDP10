package com.methodoverloading;

class Shape {

	public void area(int side) {
		System.out.println("Area of square:" + (side * side));

	}

	void area(int length, int breadth) {
		System.out.println("Area of rectangle:" + (length * breadth));

	}

	protected void area(float radius) {
		System.out.println("Area of circle:" + (3.14 * radius * radius));
	}

}

public class PolyDemo1 {
	public static void main(String[] args) {
		Shape s = new Shape();

		s.area(4);
		s.area(4, 8);
		s.area(7.5f);
		System.out.println("---------------");
		PolyDemo1.main(90);
	}	
		public static void main(int data) {
			System.out.println("Overloaded main");
			System.out.println("Data:"+data);
		
	}

}
