package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArrayList {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"Shreyash",90.5));
		slist.add(new Student(1,"Shreyash",90.5));
		slist.add(new Student(2,"Rahul",80.5));
		slist.add(new Student(3,"Shreyash",90.8));
		slist.add(new Student(4,"Onkar",97.5));
		slist.add(new Student(5,"Raj",94.2));
		
		//System.out.println(slist);
		
		for(Student s:slist) {
			System.out.println(s);
		}

		Collections.sort(slist);
		System.out.println("----------------------");
		for(Student s:slist) {
			System.out.println(s);
		}
		
		
	}
	
	
	}


