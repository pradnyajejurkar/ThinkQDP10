package com.oops.classobject;
/*3. create another method in Student class setCustomData(int
customId, String customName) These 2 variables are local
variables. Call setCustomData from main method using
Student object and assign any values to customId,
customName from main method. Observe your values are
overwritten in id and name instance variables. Then print
id and name in main method.*/

public class Student3 {
	
	int sid=101;
	String sname="pradnya";
	
	public void setCustomData(int customId,String customName) {
		sid=customId;
		sname=customName;
		
		System.out.println("customId:"+sid);
		System.out.println("Book Name:"+sname);
	}
	
	

	public static void main(String[] args) {
		Student3 s3=new Student3();
		s3.setCustomData(102,"neha");
		
		}

}
