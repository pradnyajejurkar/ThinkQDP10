package com.hashsetdemo;

import java.util.HashSet;

public class HashSetDemo2 {

public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<>();
		hs.add("C++");
		hs.add("Angular");
		hs.add("Java");
		hs.add("Spring");
		hs.add("React");
		
		System.out.println(hs);
		
		
		HashSet<String> hs1= new HashSet<>();
		hs1.add("Java");
		hs1.add("C++");
		hs1.add("SQL");
		hs1.add("HTML");
		
		
		System.out.println(hs1);
		
		//Mathmatical oper
		//union
		
//		hs.addAll(hs1);
//		System.out.println(hs);
		
		//difference
//		hs.removeAll(hs1);
//		System.out.println(hs);
		
		//intersection
		hs.retainAll(hs1);
		System.out.println(hs);
		
		
}
}