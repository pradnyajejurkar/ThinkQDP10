package com.containment;

public class Vehicle {
	private int license_no;
	private String model;
	private String brand;
	private double price;

	public Vehicle() {

	}

	public Vehicle(int license_no, String model, String brand, double price) {
		this();
		this.license_no = license_no;
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public int getLicense_no() {
		return license_no;
	}

	public void setLicense_no(int license_no) {
		this.license_no = license_no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Vehicle [license_no=" + license_no + ", model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}

}
