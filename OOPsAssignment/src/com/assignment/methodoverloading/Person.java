package com.assignment.methodoverloading;
/*3. Create class Person which has attributes (name, gender, age, Address).
Address is class which has attributes (city, state, country). Display Persons
data
Note. Containment using constructor and getter/setter*/

public class Person {

	private String name;
	private String gender;
	private int age;
	private Address address;

	public Person() {

	}

	public Person(String name, String gender, int age, Address address) {
		this();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + "]";
	}

}
