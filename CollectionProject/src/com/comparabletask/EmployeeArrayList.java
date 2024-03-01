package com.comparabletask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arraylistdemo.Student;

public class EmployeeArrayList {

	public static void main(String[] args) {
	 List<Employee> elist=new ArrayList<>();
	 
	 elist.add(new Employee("Pradnya","pune",25));
	 elist.add(new Employee("Ram","Mumbai",30));
	 elist.add(new Employee("Anita","pune",27));
	 elist.add(new Employee("Neha","Banglore",28));
	 
	 //System.out.println(elist);
	 
	 for(Employee e:elist) {
		 System.out.println(e);
	 }
	 Collections.sort(elist);
	 
	 System.out.println("----------------------");
		for(Employee e:elist) {
			System.out.println(e);
		}
	}

}
