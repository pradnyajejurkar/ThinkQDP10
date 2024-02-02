package com.abstractdemo;

abstract class Bike {
	// instance variable
	private int id;
	private String name;
	private double cost;

	// static variable
	static String brandName;
	static float discount;

	static {
		brandName = "Honda";
	}

	// constructors:to intiliaze instance variable
	// using super in child class

	Bike() {

	}

	public Bike(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public static String getBrandName() {
		return brandName;
	}

	public static void setBrandName(String brandName) {
		Bike.brandName = brandName;
	}

	// abstarct and final cannot come together
	// abstarct and static cannot come together

	abstract void description();

	// static method
	public static float getDiscount() {
		return discount;
	}

	public static void setDiscount(float discount) {
		Bike.discount = discount;
	}

	// final method

	final void display() {
		System.out.println("Brand name:" + brandName);
		System.out.println("discount on all bikes:" + Bike.discount + "%");

		System.out.println("----------------------------------------------");
		System.out.println("Id:" + id);
		System.out.println("Model:" + name);
		System.out.println("Cost:" + cost);
		System.out.println("Discounted cost:" + (cost - ((discount / 100) * cost)));

	}

}

class BasicBike extends Bike {

	private float avg;

	public BasicBike() {
		super();
	}

	public BasicBike(int id, String name, double cost, float avg) {
		super(id, name, cost);
		this.avg = avg;
	}

	void description() {
		System.out.println("this is normal bike");
		System.out.println("Number of gears:4");
		System.out.println("Average:" + avg);
	}

}

class SportsBike extends Bike {

	private int gears;
	private float speed;

	public SportsBike() {
		super();

	}

	public SportsBike(int id, String name, double cost, int gears, float speed) {
		super(id, name, cost);
		this.gears = gears;
		this.speed = speed;
	}

	void description() {
		System.out.println("This is sports bike");
		System.out.println("Number of gears:" + gears);
		System.out.println("Speed:" + speed);
	}

}

public class AbstractDemo2 {

	public static void main(String[] args) {
		Bike b;
		Bike.setDiscount(20);
		b = new SportsBike(101, "Duccati", 108000,6, 300);
		b.display();
		System.out.println("------------------");
		b.description();

		b = new BasicBike(101, "Splender", 400000, 30);
		b.display();

		b.description();

	}

}
