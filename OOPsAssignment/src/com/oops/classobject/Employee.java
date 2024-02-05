package com.oops.classobject;

public class Employee {

	int eid;
	String ename;
	double esal;
	String designation;
	double hra,da;

	public void setData(int eid, String ename, double esal, String designation) {

		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.designation = designation;

	}

	public double calHra() {
		return esal * 0.1;

	}

	public double calDa() {
		return esal * 0.15;
	}

	public double calBasicSal() {
		 hra = calHra();
		 da = calDa();
		return esal - hra - da;
	}
	
	public void displayDetails() {
		
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Salary:"+esal);
		System.out.println("Designation:"+designation);
		System.out.println("Hra is:"+calHra());
		System.out.println("Da is:"+calDa());
		System.out.println("Basic Salary:"+calBasicSal());
		
	}

}