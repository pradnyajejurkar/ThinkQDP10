package com.mapdemo.hashmapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingMap {

	public static void main(String[] args) {
	
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("India", 91);
		hm.put("UAE", 971);
		hm.put("USA", 1);
		hm.put("Germany", 49);
		hm.put("UK", 24);
		
		//1st way
		
		System.out.println(hm);
		
		//2nd way
		//all the keys

		System.out.println("---------------------------------");
		
		Set<String> keys=hm.keySet();
		for(String k:keys) {
			System.out.println(k+"->"+hm.get(k));
		}
		//using iterator 3rd way
		System.out.println("---------------------------------");
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext()) {
			String k=itr.next();
			System.out.println(k+" :"+hm.get(k));
		}
		
		//4th way using values
		//all the values
		System.out.println("---------------------------------");
		Collection<Integer> pins=hm.values();
		for(Integer i:pins) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------------");
		//5th way---mostly used this way
		Set<Entry<String, Integer>> entries=hm.entrySet();
		for(Entry<String, Integer> e:entries) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		
		System.out.println("---------------------------------");
		//6th way:mostly used this way
		for(Map.Entry<String, Integer> e:hm.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
	}

}
