package com.tasks.finalKeyword;

class Car{
	protected String name;
	protected int capacity;
	
	Car displayDetails() {
		name="Ertiga";
		capacity=7;
		return this;
	}
	
}
class SUV extends Car{
	@Override
	Car displayDetails() {
		name="bolero";
		capacity=10;
		return this;
	}
	void display() {
		System.out.println("Bolero");
	}
}
public class CarTest {

	public static void main(String[] args) {
		Car c;
		SUV s;
		
		Car c1=new Car();
		c=c1.displayDetails();
		System.out.println(c.name+ " "+c.capacity);
		
	
		SUV s1=new SUV();
		c=s1.displayDetails();
		System.out.println(c.name+ " "+c.capacity);
		
				
	}

}
