package com.assignment.constructer;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setDetails(101, "pradnya", 45000);
		e1.showDetails();
		
		e1.setEsal(50000);
		e1.setEid(101);
		System.out.println(e1.getEsal());
		System.out.println(e1.getEid());
	}

}
