package com.constructor;

import java.util.Scanner;

public class EmpTest {
	
	static Scanner sc = new Scanner(System.in);

	public static void enterEmpDetails(Employee e) {
		System.out.println("Enter employee id:");
		System.out.println(Employee.eid);

		System.out.println("Enter employee name:");
		e.setEname(sc.next());

		System.out.println("Enter employee salary:");
		e.setEsal(sc.nextDouble());

	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		
		enterEmpDetails(e1);
		
		System.out.println(e1);
		
		Employee e2=new Employee();
		
		enterEmpDetails(e2);
		
		System.out.println(e2);

	}

}
