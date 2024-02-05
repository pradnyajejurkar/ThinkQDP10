package com.inheritance.assignment;

class Vehicle {
	private int noOfWheels;
	protected String color;

	public Vehicle() {
		super();
	}

	public Vehicle(int noOfWheels, String color) {
		super();
		this.noOfWheels = noOfWheels;
		this.color = color;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [noOfWheels=" + noOfWheels + ", color=" + color + "]";
	}

}

class Car extends Vehicle {
	private int noOfSeats;

	public Car() {

	}

	public Car(int noOfWheels, String color, int noOfSeats) {
		super(noOfWheels, color);
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		super.toString();
		return "Car:" +super.toString()+" " + noOfSeats ;
	}

}

class Suv extends Car {
	private int engineSize;

	public Suv() {

	}

	public Suv(int noOfWheels, String color, int noOfSeats, int engineSize) {
		super(noOfWheels, color, noOfSeats);
		this.engineSize = engineSize;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		super.toString();
		return "Suv:" + super.toString() + " " + engineSize;
	}

}

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle(4,"red");
		System.out.println(v1);
		
		Car c1=new Car(4,"black",4);
		System.out.println(c1);
		
		Suv s1=new Suv(4,"white",4,8);
		System.out.println(s1);
		
		
		
	}

}
