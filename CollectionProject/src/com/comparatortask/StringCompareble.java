package com.comparatortask;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arraylistdemo.Student;


public class StringCompareble {
	
   public static void main(String[] args) {
	ArrayList<String> ar=new ArrayList<>();
	
	ar.add("pradnya");
	ar.add("neha");
	ar.add("raj");
	ar.add("vinit");
	ar.add("usha");
	
	System.out.println(ar);
	/*/WAP to sort the elements of List that contains String objects.Print ArrayList.Sort using 
Collections.sort(list) method. Print ArrayList.*/

	Collections.sort(ar);
	System.out.println(ar);

	Collections.reverse(ar);
	
	System.out.println(ar);
	
	
	System.out.println("------------------------------------------");
	
	/*Create and add 4 more Employee objects in ArrayList. Print ArrayList. Sort ArrayList using 
	Collections.sort(list) based on name. If name are same then sort on id. Print arrayList. */
	
	List<Employee> elist=new ArrayList<>();
	elist.add(new Employee(2,"Pradnya",25000));
	elist.add(new Employee(3,"Pradnya",30000));
	elist.add(new Employee(1,"Neha",20000));
	elist.add(new Employee(4,"Anita",27000));
	
	for(Employee e:elist) {
		System.out.println(e);
	}
	
	Collections.sort(elist);
	System.out.println("----------------------------------------");
	for(Employee e:elist) {
		System.out.println(e);
	}
	
	System.out.println("--------------------------------------------------");
	
	//Add Profile(state,country) object in Employee object. Do sorting of employees on the country basis.
	
	
	
}
}
