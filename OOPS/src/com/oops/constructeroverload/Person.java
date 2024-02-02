package com.oops.constructeroverload;

public class Person {
	
	private int id;
	private String name;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name=name;
				
	}
	
	public Person(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
}


