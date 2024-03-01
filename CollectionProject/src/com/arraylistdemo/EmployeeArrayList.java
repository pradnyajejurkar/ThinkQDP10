package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeArrayList {

	public static void main(String[] args) {
		List<Employee> elist=new ArrayList<>();
		 
		 elist.add(new Employee(101,"Anita",15000));
		 elist.add(new Employee(103,"Amruta",25000));
		 elist.add(new Employee(104,"Pradnya",18000));
		 elist.add(new Employee(102,"Rushikesh",10000));
		 elist.add(new Employee(107,"Dattaprasad",26000));
		 elist.add(new Employee(105,"Mandar",30000));
		 elist.add(new Employee(106,"Supriya",15000));
		 
		 for(Employee e:elist) {
			 System.out.println(e);
		 }
		 
		 System.out.println("------------------------");
		 Collections.sort(elist,new EmployeeNameComparator());
		 
		// Collections.sort(elist,Collections.reverseOrder(new EmployeeIdComparator()));
		 for(Employee e:elist) {
			 System.out.println(e);
		 }
		 
	}
}
		 
		