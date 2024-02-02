package com.interfacedemo;

//default method: backword compatiblity and mutable

interface Operations{
	void area();
	default void volume() {
		System.out.println("Volume method for 3D shapes");
		show();
		display();
	}
	
	static void info() {
		System.out.println("Geometry shapes");
		display();
	}
	
	static double getPi() {
		return 3.147;
	}
	
	private void show() {
		System.out.println("made for:Abc");
	}
	
	//can be called static and default method
	private static void display() {
		System.out.println("Pan no:fgh45655k");
	}
}

class Square implements Operations{
	int side;
	
	Square(){
		
	}
	
	Square(int side){
		this.side=side;
	}
	@Override
	public void area() {
		System.out.println("Area of square is:"+(side*side));
	}
}

class Cube implements Operations{
	int side;
	
	Cube(){
		
	}
	
	Cube(int side){
		this.side=side;
	}
	
	@Override
	public void area() {
		System.out.println("Area of Cube is:"+(6*side*side));
	}
	
	@Override
	public void volume() {
		System.out.println("Volume of Cube is:"+(side*side*side));
	}
}

public class defaultMethodDemo {

	public static void main(String[] args) {
		Operations.info();
		
		System.out.println("Value of pi:"+Operations.getPi());
		Operations o;
		o=new Square(8);
		o.area();
		o.volume();

		o=new Cube(4);
		o.area();
		o.volume();
	}

}
