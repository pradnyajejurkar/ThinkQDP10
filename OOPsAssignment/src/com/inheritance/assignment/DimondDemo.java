package com.inheritance.assignment;

interface Student{
	
	 
	
	void show(); 
		
	default void display() {
		System.out.println("I am s student");
	}
}

interface Teacher {
	void show();
	
	default void display() {
		System.out.println("I am a teacher");
	}
}


public class DimondDemo implements Teacher,Student{
	
	 public void show() {
		 System.out.println("this is heritage schhol");
	 }

	 public void display() {
			System.out.println("I am in school");
			Student.super.display();
			Teacher.super.display();
		}
	public static void main(String[] args) {
		
		Student s;
		s=new DimondDemo();
		s.show();
		s.display();
		
		Teacher t;
		t=new DimondDemo();
		t.show();
		t.display();

	}

}
