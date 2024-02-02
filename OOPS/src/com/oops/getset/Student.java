package com.oops.getset;

public class Student {

	private int sid;
	private String sname;
	private double marks;

	public void setDetails(int sid, String sname, double marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}

	public void showDetails() {
		System.out.println("Student id:" + sid);
		System.out.println("Student name:" + sname);
		System.out.println("Student sal:" + marks);
	}
}
