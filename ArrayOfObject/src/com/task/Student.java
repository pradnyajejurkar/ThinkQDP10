package com.task;

import java.util.Arrays;

public class Student {
	private int sid;
	private String sname;
	private double marks[];

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, double[] marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}
	
	public double calPer() {
		double totalMarks=0;
		for(double mark:marks) {
			totalMarks+=mark;
		}
		
		return totalMarks/marks.length;
	}

//	public void displayDetails() {
//		System.out.println("Student id:"+sid);
//		System.out.println("Student name:"+sname);
//		System.out.println("Percentage:"+calPer() + "%");
//	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", marks=" + Arrays.toString(marks) + ",Percentage=" +calPer();
	}

}
