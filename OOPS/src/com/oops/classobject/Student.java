package com.oops.classobject;

public class Student {
	//instance variable
	//variable which is inside class but outside method
	//instance variable can be access by any method present in class
	//instance variable have copy per object
	int rollno=101;
	String name="pradnya";
	
	//instance method
	public void learn() {
		System.out.println("student is learning");
	}

	public void show() {
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.learn();
		s1.show();
		
		System.out.println(s1.name);//accessing or calling instance variable
		//Student s2=new Student();
		//s2.show();

	}

}
