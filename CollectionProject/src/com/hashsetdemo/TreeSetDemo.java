package com.hashsetdemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
		ts.add("C++");
		ts.add("Angular");
		ts.add("Java");
		//ts.add(null);
		ts.add("React");
		
		
		
		System.out.println(ts);
		
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
		
		
		System.out.println("====================================");
		
		for(String s:ts) {
			System.out.println(s);
		}
		
		System.out.println("====================================");

		Iterator<String> itr1=ts.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("====================================");

		NavigableSet<String> nm=ts.descendingSet();
		for(String s:nm) {
			System.out.println(s);
		}
		
		Set<String> synchts=Collections.synchronizedSet(ts);
		

	}

}
