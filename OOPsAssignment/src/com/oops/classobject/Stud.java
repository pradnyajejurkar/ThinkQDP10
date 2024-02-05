package com.oops.classobject;
/*2.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
Assign the value of roll_no as '2' and
that of name as "John" by creating an object of the class Student.*/

/*3.
Assign and print the roll number, phone number and address of two 
students having names "Sam" and "John" respectively by creating two objects of 
class 'Student'.*/
class StudentNew {

	String name;
	int roll_no;
	String contact_no;
	String address;

	public void showData() {

		System.out.println("Name: " + name);
		System.out.println("Roll_no: " + roll_no);
		System.out.println("contact number: " + contact_no);
		System.out.println("Address: " + address);
		System.out.println("--------------------------------");
	}

}

public class Stud {

	public static void main(String[] args) {
		StudentNew s = new StudentNew();
		s.name = "Sam";
		s.roll_no = 2;
		s.contact_no = "7548126422";
		s.address = "Pune";

		StudentNew s1 = new StudentNew();
		s1.name = "John";
		s1.roll_no = 3;
		s1.contact_no = "7548124251";
		s1.address = "Mumbai";

		s.showData();
		s1.showData();

	}

}
