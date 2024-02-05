package com.constructor;

public class Employee {
	static int eid;
	private String ename;
	private double esal;

	{
		eid++;
	}

	public Employee() {

	}

	public Employee(int eid, String ename, double esal) {
		this();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public static int getEid() {
		return eid;
	}

	public static void setEid(int eid) {
		Employee.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
