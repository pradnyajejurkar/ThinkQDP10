package com.example2;

public class StudentConstructor {

	public static void main(String[] args) {
		
		
		Student stud[]=new Student[4];
		
		
		//anonums object
		stud[0]=new Student(101,"pradnya",new double[] {67.5,78.9,89.5},new Course(1,"java"));
		stud[1]=new Student(102,"priya",new double[] {67,78,89},new Course(2,".net"));
		stud[2]=new Student(103,"raj",new double[] {68.5,73.9,80.5},new Course(1,"java"));
		
		stud[3]=new Student();
		stud[3].setSid(104);
		stud[3].setSname("merra");
		stud[3].setMarks(new double[] {89.5,85,90.3});
		stud[3].setCourse(new Course(2,".net"));
		
		for(Student s:stud) {
			System.out.println(s);
		}
		
		stud[0].getCourse().setCname("fullstack");
		
		System.out.println("----------------------");
		for(Student s:stud) {
			System.out.println(s);
		}
		

	}

}
