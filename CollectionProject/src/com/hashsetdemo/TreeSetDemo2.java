package com.hashsetdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
	  
		TreeSet<Integer> ts=new TreeSet<>();
		
		ts.add(90);
		ts.add(56);
		ts.add(78);
		ts.add(12);
		ts.add(64);
		ts.add(80);
		
		System.out.println(ts);
		System.out.println("First:"+ts.first());
		System.out.println("Last:"+ts.last());
		
		System.out.println(ts.headSet(64));//64 not included
		System.out.println(ts.tailSet(64));//64 included
		SortedSet<Integer> s1=ts.subSet(12, 78);
		System.out.println(s1);
		
		//navigable set
		
		System.out.println("Lower:"+ts.lower(64));
		System.out.println("floor:"+ts.floor(64));
		
		System.out.println("Higher:"+ts.higher(64));
		System.out.println("Celling:"+ts.ceiling(64));
		System.out.println(ts.headSet(64, true));
		System.out.println(ts.tailSet(64, false));
		System.out.println(ts.subSet(12, true, 78, true));
}

}
