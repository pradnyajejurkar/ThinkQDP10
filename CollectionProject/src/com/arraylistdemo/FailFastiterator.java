package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FailFastiterator {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
	      
        al.add("Shreyash");
		al.add("Akshta");
		al.add("Mandar");
		al.add("Gunjan");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("Mandar")) {
				//int index=al.indexOf("Mandar");
				al.add("Rahul");//java.util.ConcurrentModificationException
				//itr.remove();
				//al.set(index, "Md");
			}
		}
		 System.out.println(al);
		
		ListIterator<String> litr=al.listIterator();
		while(litr.hasNext()) {
			if(litr.next().equals("Mandar")) {
				
				//al.add("Rahul");//java.util.ConcurrentModificationException
				litr.add("Rahul");
			}
		}
		 System.out.println(al);
	}
		
	}


