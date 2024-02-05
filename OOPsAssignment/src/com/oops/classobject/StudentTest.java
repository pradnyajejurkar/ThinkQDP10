package com.oops.classobject;
//4) Write a program for class and object : (main outside class)
//5) Write a program for class and object : (initialization through reference)
//Note : Initializing object simply means storing data into object
/*10. add id,name in student class. assign value to id name there
itself and in main method print values. Then change value
of instance variables and again print the values. Observe
you cannot access id directly without creating object. Also
2 objects have 2 seperate set of data*/

public class StudentTest {

	public static void main(String[] args) {

		Student s1=new Student();
		Student s2=new Student();
		
		//anonymous object
		new Student();
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		
		s1.sid=103;
		s1.sname="geeta";
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		
		s2.sid=104;
		s2.sname="nikita";
		

		System.out.println(s2.sid);
		System.out.println(s2.sname);
	
		

	}

}
