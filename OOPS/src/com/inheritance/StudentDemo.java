package com.inheritance;

class Student{
	private int sid;
	private String sname;
	
	public Student() {
		super();
	}
	
	public Student(int sid,String sname) {
		this.sid=sid;
		this.sname=sname;
	}
	
	public void setSid(int sid) {
		this.sid=sid;
	}
	
	public int getSid() {
		return sid;
	}
	
	public void setSname(String sname) {
		this.sname=sname;
	}
	
	public String getSname() {
		return sname;
	}
	public String toString() {
		return "Student:"+sid+" "+sname;
	}
}

class SchoolStudent extends Student{
	private String course;
	protected double fees;
	
	public SchoolStudent() {
		
	}
	
	public SchoolStudent(int sid,String sname,String course,double fees) {
		super(sid,sname);
		this.course=course;
		this.fees=fees;
	}
	
	public void setCourse(String course) {
		this.course=course;
	}
	
	public String getCourse() {
		return course;
	}
	
	public String toString() {
		return "SchoolStudent:"+getSid()+" "+getSname()+" "+getCourse()+" "+fees;
}
	
}
class CollegeStudent extends Student{
	private String clgname;
	protected String branch;
	
	public CollegeStudent() {
		super();
		
	}
	public CollegeStudent(int sid, String sname,String clgname,String branch) {
		super(sid, sname);
		this.clgname=clgname;
		this.branch=branch;
	}
	
	public void setClgname(String clgname) {
		this.clgname=clgname;
		
	}
	public String getClgname() {
		return clgname;
	}
	public String toString() {
		return "CollegeStudent:"+getSid()+" "+getSname()+" "+clgname+" "+branch	;
	
}
}
public class StudentDemo {

	public static void main(String[] args) {
		SchoolStudent s1=new SchoolStudent(101,"pradnya","abc",450000);	
		
		System.out.println(s1);
		
		CollegeStudent c1= new CollegeStudent(101,"pradnya","xyz","It");
		//c1.toString();
		System.out.println(c1);
	}

}


