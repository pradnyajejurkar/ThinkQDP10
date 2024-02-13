package com.task;



public class StudentTest {

	public static void main(String[] args) {
		Student stud[]=new Student[5];
		
		stud[0]=new Student(1,"Pradnya",new double[] {80,82,84});
		stud[1]=new Student(2,"Merra",new double[] {85,81,89});
		stud[2]=new Student(3,"Raj",new double[] {80,70,63});
		stud[3]=new Student(4,"Nikita",new double[] {75,82,84});
		stud[4]=new Student(5,"Rahul",new double[] {80,88,87});
		
	
		for(Student s:stud) {
			
			System.out.println(s);
		}
	}

}
