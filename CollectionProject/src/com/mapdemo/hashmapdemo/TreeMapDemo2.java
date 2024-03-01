package com.mapdemo.hashmapdemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap=new TreeMap<>();
		
		tmap.put(3,"Java");
		tmap.put(1,".Net");
		tmap.put(8,"C");
		tmap.put(4,"C++");
		tmap.put(6,"Python");
		tmap.put(4,"Angular");
		
		System.out.println(tmap);
		
		//sorted map
		System.out.println("First key:"+tmap.firstKey());
		System.out.println("Last key:"+tmap.lastKey());
		
		SortedMap<Integer, String> s1=tmap.subMap(3, 6);//3 included //6 excluded
		System.out.println(s1);
		
		SortedMap<Integer, String> s2=tmap.headMap(3);//
		System.out.println(s2);
		
		SortedMap<Integer, String> s3=tmap.tailMap(3);
		System.out.println(s3);
		
		System.out.println("--------------------------------------");
		
		//navigable Map
		
		System.out.println("Lower key:"+tmap.lowerKey(4));//strictly less
		System.out.println("Floor key:"+tmap.floorKey(4));//less or than equal to
		
		System.out.println("Higher key:"+tmap.higherKey(4));//strictly higher
		System.out.println("Celling key:"+tmap.ceilingKey(4));//equal to or greater than 
		
		SortedMap<Integer, String> s4=tmap.subMap(3,false, 6,true);//3 (from) included :true
		System.out.println(s4);
		
		SortedMap<Integer, String> s5=tmap.headMap(3,true);//
		System.out.println(s5);
		
		SortedMap<Integer, String> s6=tmap.tailMap(3,false);
		System.out.println(s6);
		
	}

}
