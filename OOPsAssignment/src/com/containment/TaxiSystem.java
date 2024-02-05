package com.containment;

import java.util.Scanner;

public class TaxiSystem {
	Scanner sc = new Scanner(System.in);

//	public void enterCarDetails(Car c) {
//		System.out.println("Enter car no:");
//		c.setCarNo(sc.nextInt());
//		System.out.println("Enter car brand");
//		c.setBrand(sc.next());
//		System.out.println("Enter car model");
//		c.setModel(sc.next());
//		
//		c.setDriver(new Driver());
//		System.out.println("Enter Driver id:");
//		c.getDriver().setDriverid(sc.nextInt());
//		System.out.println("Enter Driver name:");
//		c.getDriver().setName(sc.next());
//		System.out.println("Enter Driver adhar no:");
//		c.getDriver().setAdharNo(sc.nextInt());
//		System.out.println("Enter Driver salary:");
//		c.getDriver().setSalary(sc.nextDouble());
//		

	// }

	public void enterCarDetails(Car c, Driver d) {
		System.out.println("Enter car no:");
		c.setCarNo(sc.nextInt());
		System.out.println("Enter car brand");
		c.setBrand(sc.next());
		System.out.println("Enter car model");
		c.setModel(sc.next());

		System.out.println("Enter Driver id:");
		d.setDriverid(sc.nextInt());
		System.out.println("Enter Driver name:");
		d.setName(sc.next());
		System.out.println("Enter Driver adhar no:");
		d.setAdharNo(sc.nextInt());
		System.out.println("Enter Driver salary:");
		d.setSalary(sc.nextDouble());

		c.setDriver(d);
	}

	public static void main(String[] args) {
		TaxiSystem obj = new TaxiSystem();
		// Car c1=new Car();
		// obj.enterCarDetails(c1);
		// System.out.println(c1);

		Car c2 = new Car();
		Driver d = new Driver();
		obj.enterCarDetails(c2, d);
		System.out.println(c2);

	}

}
