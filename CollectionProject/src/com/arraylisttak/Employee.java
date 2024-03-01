package com.arraylisttak;
/*1.	WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. 
 * Sysout and see both variable memory space is printed. 
 * This is because toString is not overriden but if you would have done this for 
 * Integer then beautiful output would have been printed.*/



public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e1) {
		if(this.id==e1.id) 
			return 0;
			else if(this.id>e1.id)//decreasing order
				return -1;
			else
				return 1;
}
}

