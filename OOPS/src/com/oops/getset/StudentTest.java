package com.oops.getset;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.setDetails(101, "pradnya", 75);
		s.showDetails();

		s.setSid(102);
		s.setSname("neha");
		s.setMarks(80);

		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getMarks());
	}

}
