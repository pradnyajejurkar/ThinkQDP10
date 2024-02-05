package com.oops.classobject;
/*1.
add method displayData inside Student class change
values of id name in that method & also print the changed
values in same method. Call displayData method from
main method and see the output. Observe displayData can
only be called by creating object of Student*/

class StudentData{
	int sid=102;
	String sname="pradnya";
	
	public void displayData() {
		sid=101;
		sname="pqr";
	
		System.out.println("Student id:"+sid);
		System.out.println("Student name:"+sname);
	
	}
	
}


public class StudentInfo {

	public static void main(String[] args) {
		 StudentData sd1=new StudentData();

		 
		 	System.out.println(sd1.sid);
			System.out.println(sd1.sname);
			sd1.displayData();
	}
}

