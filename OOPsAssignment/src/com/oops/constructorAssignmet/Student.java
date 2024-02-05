package com.oops.constructorAssignmet;

public class Student {

	private int id;
	private String name;

	public Student() {
		
	}

	public Student(int id, String name) {
		//this();
		super();
		this.id = id;
		this.name = name;
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

	public static void main(String[] args) {
		//this();
		Student s1=new Student();
		Student s2=new Student();
		
		s1.setId(11);
		s2.setId(21);
		
		System.out.println("Student id:" +s1.getId());
		System.out.println("Student id:" +s2.getId());
	}

}
