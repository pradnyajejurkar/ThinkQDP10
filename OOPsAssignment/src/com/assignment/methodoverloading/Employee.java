package com.assignment.methodoverloading;

public class Employee {
	private int eid;
	private String empName;
	private double salary;
	private Department dept;
	private Mydate mydate;

	public Employee() {

	}

	public Employee(int eid, String empName, double salary, Department dept,Mydate mydate) {
		this();
		this.eid = eid;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
		this.mydate=mydate;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public void setMydate(Mydate mydate) {
		this.mydate=mydate;
	}
	
	public Mydate getMydate() {
		return mydate;
	}
	

	public String toString() {
		return "Employee [eid=" + eid + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept + ",mydate="+mydate+"]";
	}

}
