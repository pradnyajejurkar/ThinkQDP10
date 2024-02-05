package com.assignment.methodoverloading;

/*3. Create class Person which has attributes (name, gender, age, Address).
Address is class which has attributes (city, state, country). Display Persons
data
Note. Containment using constructor and getter/setter*/
public class Address {

	private String city;
	private String state;
	private String country;

	public Address() {

	}

	public Address(String city, String state, String country) {
		this();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
