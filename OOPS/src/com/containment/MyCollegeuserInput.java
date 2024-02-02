package com.containment;

import java.util.Scanner;

public class MyCollegeuserInput {
	Scanner sc=new Scanner(System.in);
	public void enterStudentDetails(Student s) {
		System.out.println("enter student id:");
		s.setSid(sc.nextInt());
		System.out.println("enter student name:");
		s.setSname(sc.next());
		System.out.println("enter student marks:");
		s.setMarks(sc.nextDouble());
//		
//		Course c=new Course();
//		System.out.println("enter course id:");
//		c.setCid(sc.nextInt());
//		System.out.println("enter course name:");
//		c.setCname(sc.next());
//		System.out.println("enter course marks:");
//		c.setFees(sc.nextDouble());
//		
//		s.setCourse(c);
		
		s.setCourse(new Course());
		System.out.println("enter course id:");
		s.getCourse().setCid(sc.nextInt());
		System.out.println("enter course name:");
		s.getCourse().setCname(sc.next());
		System.out.println("enter course marks:");
		s.getCourse().setFees(sc.nextDouble());
		
	}
	
	public static void main(String[] args) {
		
	}
}
