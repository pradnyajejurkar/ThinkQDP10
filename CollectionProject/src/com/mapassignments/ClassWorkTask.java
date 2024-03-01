package com.mapassignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClassWorkTask {

	public static void main(String[] args) {
	/*1.WAP to add elements to a HashMap without using generics (ie do not use <>) 
		and print content of it. Use Integer as Key and String as Value. 
		In second HashMap add elements of String type as Key and Integer as Value.*/
		
		
		HashMap hm=new HashMap();
		hm.put(1, "Pradnya");
		hm.put(2, "Neha");
		hm.put(3, "Meeta");
		hm.put(4, "Ankita");

		System.out.println(hm);
		
		HashMap hm1=new HashMap();
		hm1.put("Pradnya",2);
		hm1.put("Neha",3);
		hm1.put("Meeta",4);
		hm1.put("Ankita",5);
		
		System.out.println(hm1);

		System.out.println("=====================================================");
		/*2.WAP add elements to HashMap without using generics, 
		0th location use String as key and Integer as value, 
		on 1st location use String as key String and Integer as value.*/
		
		HashMap hm2=new HashMap();
		hm2.put(1, "Pradnya");
		hm2.put("Neha",2);
		
		System.out.println(hm2);
		System.out.println("================================================================");
		/*3.WAP to add elements to a HashMap using generics with Integer as Key and String as value.
		   And 4 key-value Map.Entry*/

		HashMap<Integer, String> hm3=new HashMap<>();
		hm3.put(1, "Pradnya");
		hm3.put(2, "Ram");
		hm3.put(3, "Vijay");
		hm3.put(4, "Shital");
		
		for(Map.Entry<Integer, String> e:hm3.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		System.out.println("==================================================================");
		
		/*4.WAP to create a map using Wrapper class as key and value same as keys’ 
		 data type WAP to count the number of key-value (size) mappings in a map.*/
		
		HashMap<Integer,String> hm4=new HashMap<>();
		hm4.put(1, "Pradnya");
		hm4.put(2, "Neha");
		hm4.put(3, "Vishal");
		hm4.put(4, "Ram");
		
		System.out.println(hm4);
		System.out.println(hm4.size());

	/*5.WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values*/
		
		System.out.println("=================================================================");
		Set<Entry<Integer,String>> entries=hm4.entrySet();
		for(Entry<Integer,String> e:entries)
		{
			System.out.println(e.getKey()+"->"+e.getValue());
		}

	//6.WAP to get only the Keys from a HashMap
		System.out.println("=================================================================");

		Set<Integer> keys=hm4.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()) {
//			Integer k=itr.next();
//			System.out.println(k+" :"+hm.get(k));
			System.out.println(itr.next());

		}
		
		System.out.println("=================================================================");
		//7.WAP to get only the Values from a HashMap
		
		Collection<String> values=hm4.values();
		for(String i:values)
		{
			System.out.println(i);
		}

		
	}

}
