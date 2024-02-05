package com.assignment.methodoverloading;

public class PersonData {

	public static void main(String[] args) {
		Address a1=new Address("Pune","Maharashtra","India");
		Address a2=new Address("Mumbai","Maharashtra","India");
		Address a3=new Address("Nagpur","Maha","IND");
		
		Person p1=new Person("Pradnya","Female",27,a1);
		Person p2=new Person("Nikhil","male",28,a2);
		Person p3=new Person("Nikita","Female",29,a3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
