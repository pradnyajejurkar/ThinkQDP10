package com.containment;

public class Driver {
	private int driverid;
	private String name;
	private int adharNo;
	private double salary;

	public Driver() {

	}

	public Driver(int driverid, String name, int adharNo, double salary) {
		this();
		this.driverid = driverid;
		this.name = name;
		this.adharNo = adharNo;
		this.salary = salary;
	}

	public int getDriverid() {
		return driverid;
	}

	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Driver [driverid=" + driverid + ", name=" + name + ", adharNo=" + adharNo + ", salary=" + salary + "]";
	}

}
