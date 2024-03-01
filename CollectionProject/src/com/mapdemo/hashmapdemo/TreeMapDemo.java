package com.mapdemo.hashmapdemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;



public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm= new TreeMap<>();
		
		tm.put(90,"Pradnya");
		tm.put(78,null);
		tm.put(56,"Ram");
		tm.put(98,"Mayuri");
		tm.put(59,"Raj");
		
		for(Entry<Integer, String> e:tm.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
			
		}
		System.out.println("-----------------------------------");

		System.out.println(tm);
		
		System.out.println("-----------------------------------------");
		
		Set<Entry<Integer, String>> entries=tm.entrySet();
		
		for(Entry<Integer, String> e:entries) {
			System.out.println(e.getKey()+":"+e.getValue());

		}
		
		System.out.println("-----------------------------------------");

		NavigableMap<Integer, String> ns=tm.descendingMap();
		for(Entry<Integer, String> e:ns.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());

		}
		
		System.out.println("-----------------------------------------");
		NavigableSet<Integer> ns1=tm.navigableKeySet();
		for(Integer i:ns1) {
			System.out.println(i+":"+tm.get(i));
		}
		
		
	}

}
