package com.mapdemo.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentDemo {

	public static void main(String[] args) {
	 ArrayList<Student> slist=new ArrayList<>();
	 
	 slist.add(new Student(1,"Pradnya",88.9f));
	 slist.add(new Student(1,"Neha",70.0f));
	 slist.add(new Student(2,"vishal",50.9f));
	 slist.add(new Student(3,"Raj",33.9f));
	 
	 for(Student s:slist) {
		 System.out.println(s);
	 }
	 
	 System.out.println("--------------------------------");
	 
	 HashMap<String, String> hm=new HashMap<String, String>();
	 
	 Iterator<Student> itr=slist.iterator();
	 
	 while(itr.hasNext()) {
		 Student s=itr.next();
		 if(s.getPer()>35) {
			 hm.put(s.getName(), "pass");
		 }
		 else {
			 hm.put(s.getName(), "fail");
		 }
	 }
	
	   for(Map.Entry<String, String> me:hm.entrySet()) {
		   System.out.println(me.getKey()+":"+me.getValue());	   }
	}

}
