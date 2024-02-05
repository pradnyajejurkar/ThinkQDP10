package com.containment;

public class Car {

	private int CarNo;
	private String brand;
	private String model;
	private Driver driver;

	Car() {

	}

	Car(int CarNo, String brand, String model, Driver driver) {
		this();
		this.CarNo = CarNo;
		this.brand = brand;
		this.model = model;
		this.driver = driver;
	}

	public void setCarNo(int CarNo) {
		this.CarNo = CarNo;
	}

	public int getCarNo() {
		return CarNo;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setDriver(Driver driver) {
		this.driver=driver;
	}
	
	public Driver getDriver() {
		return driver;
	}
	
	public String toString() {
		return "Car:"+CarNo+" "+brand+" "+model+" "+driver;
	}

}
