package com.oops.assignment;

public class Student {

	private int rollno;
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
	private double per;
	private double total;
	private char grade;

	Student() {

	}

	Student(int rollno, String name, int sub1, int sub2, int sub3, int sub4, int sub5) {
		this();
		this.rollno = rollno;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
	}

	public double calPer() {
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		per = (total / 5) ;
		return per;
	}

	public void calGrade() {
		per = calPer();
		System.out.println("percentage:" + per);
		if (per > 75) {
			System.out.println("Grade A");
		} else if (per > 60 && per <= 75) {
			System.out.println("Grade B");
		} else if (per > 35 && per <= 60) {
			System.out.println("Grade C");
		} else {
			System.out.println("fail");
		}
	}
	
	public void comparePer(Student s) {
		this.per=calPer();
		if(this.per==s.per) {
			System.out.println("Both percentage are equal");
		}else if(this.per<s.per) {
			System.out.println(s.name+ " has higher percentage");
		}else {
			System.out.println(this.name+ " has higher percentage");
		}
	}

	public void displayStudent() {
		System.out.println("Student rollno:" + rollno);
		System.out.println("Student name:" + name);
		calGrade();

	}

	public static void main(String[] args) {
		Student s1 = new Student(10, "pradnya", 60, 66, 70, 75, 80);
		s1.displayStudent();

		Student s2 = new Student(20, "neha", 50, 55, 50, 45, 40);
		s2.displayStudent();
		
		s1.comparePer(s2);
	}

}
