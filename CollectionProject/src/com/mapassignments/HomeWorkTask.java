package com.mapassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HomeWorkTask {

	public static void main(String[] args) {
//1.WAP to copy all of the mappings from the specified HashMap to another map	

		HashMap<Integer, String> hm1=new HashMap<>();
		hm1.put(1,"Pradnya");
		hm1.put(2,"Neha");
		hm1.put(3,"Meeta");
		hm1.put(4,"Ankita");
		
		
		HashMap<Integer, String> hm2=new HashMap<>();
		hm2.put(4,"Pooja");
		hm2.put(5,"Neeta");
		hm2.put(6,"Raj");
		hm2.put(8,"Anita");
		
		hm1.putAll(hm2);
		System.out.println(hm1);
		
		System.out.println("==============================================");
		
		//2.WAP to test a HashMap is empty or not
		System.out.println(hm1.isEmpty());
		
		System.out.println("==============================================");
       //3.	WAP to test if a HashMap contains a mapping for the specified key	
		System.out.println(hm1.containsKey(1));
		System.out.println(hm1.containsKey(0));
		
		System.out.println("==============================================");

      //4.WAP to search for an element from HashMap using key
		System.out.println(hm1.get(2));
		
		System.out.println("==============================================");
      //5.WAP to test if a HashMap contains a mapping for the specified value
		System.out.println(hm2.containsValue("Raj"));
		
		System.out.println("==============================================");
	   //6.	WAP to remove an element from HashMap using key
		
		System.out.println(hm1.remove(2));
		System.out.println(hm1);
		
		System.out.println("==============================================");
		//7.WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
		
		Set<Integer> s=hm2.keySet();
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext()) {
			for(int k=5;k<hm2.size();k++) {
				k=itr.next();
				
				System.out.println(hm2.remove(k));
				
				System.out.println(k+":"+hm2.get(k));
			}
		}
		
	}

}
