package com.interfacedemo;

interface Movable
{
	void move();
	
}

interface Printable extends Movable
{
	void displayMsg();
}

class Printer implements Printable
{

	@Override
	public void move() {
		System.out.println("Laser printer is printing at high speed");
		
	}

	@Override
	public void displayMsg() {
		System.out.println("printer are wifi connected");
		
	}

}
class Car implements Movable
{

	@Override
	public void move() {
		System.out.println("car is moving in 60 km/hr");
		
	}
	
}
public class ExtendsInterface {

	public static void main(String[] args) {
		Movable m;
		m=new Car();
		m.move();
		
		m=new Printer();
		m.move();
	
		System.out.println("---------------------------------");
		Printable p;
		p=new Printer();
		p.move();
		p.displayMsg();
		
		
	}

}
