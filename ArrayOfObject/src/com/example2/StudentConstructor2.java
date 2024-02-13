package com.example2;

public class StudentConstructor2 {

	static void countStudentCourseWise(Student st[],Course ct[]) {
		int count;
		for(Course c:ct) {
			count=0;
			for(Student s:st) {
				if(s.getCourse().equals(c)) {
					count++;
				}
			}
			System.out.println(c+ " -> "+count);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
	 Course ct[]=new Course[3];
	 ct[0]=new Course(1,"java");
	 ct[1]=new Course(2,".net");
	 ct[2]=new Course(3,"python");
	 
	 Student stud[]=new Student[4];
	 
	 stud[0]=new Student(101,"pradnya",new double[] {67.5,78.9,89.5},ct[0]);
	 stud[1]=new Student(102,"priya",new double[] {67,78,89},ct[1]);
	 
//	 double m3[]= {91,79,89};
//	 stud[2]= new Student(103,"Manit",m3,new Course(1, "java"));
	 stud[2]=new Student(103,"raj",new double[] {68.5,73.9,80.5},ct[0]);
		
	 
//		double m[]= {67.7,78.5};
//		double m[]= new double[] {67.6,90.4};

	 
	 stud[3]=new Student();
	 stud[3].setSid(104);
	 stud[3].setSname("merra");
	 stud[3].setMarks(new double[] {89.5,85,90.3});
	 stud[3].setCourse(ct[2]);
	 
	 for(Student s:stud) {
			System.out.println(s);
		}
	 
	 System.out.println("------------------------------------------");
	 
	 ct[0].setCname("FullStack");
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
		System.out.println("---------------------------------------------------------");
		countStudentCourseWise(stud, ct);
	}

}
