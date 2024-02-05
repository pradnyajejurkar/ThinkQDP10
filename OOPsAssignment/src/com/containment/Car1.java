package com.containment;

public class Car1 extends Vehicle {
	private int carno;
	private String color;
	private int noofWheel;

	public Car1() {

	}

	public Car1(int license_no, String model, String brand, double price, int carno, String color, int noofWheel) {
		super(license_no,model,brand,price);
		this.carno = carno;
		this.color = color;
		this.noofWheel = noofWheel;
	}

	public int getCarno() {
		return carno;
	}

	public void setCarno(int carno) {
		this.carno = carno;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoofWheel() {
		return noofWheel;
	}

	public void setNoofWheel(int noofWheel) {
		this.noofWheel = noofWheel;
	}

	
	public String toString() {
		return "Car1:"+super.toString() +" " +carno + " " + color + " " + noofWheel ;
		
	}
	
	public static void main(String[] args) {
		Car1 c1=new Car1(10,"tata","altroz",20000,41,"red",4);
		System.out.println(c1);
	}

}
