package com.comparatortask;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;
   
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	public int compareTo(Employee e) {
	//	return this.name.compareTo(e.name);
		
		if(this.id==e.id) 
			return 0;
			else if(this.id>e.id)
				return -1;
			else
				return 1;
		
	}

}
