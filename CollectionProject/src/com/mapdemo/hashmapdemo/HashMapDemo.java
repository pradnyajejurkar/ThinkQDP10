package com.mapdemo.hashmapdemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Double> smap=new HashMap<>();
		
		System.out.println(smap.put("Supriya", 89.0));
		System.out.println(smap);
		System.out.println(smap.put("Supriya", 91.0));
		System.out.println(smap);
		
		//smap.put(null,null);
		smap.put("Pradnya", 85.0);
		smap.put("Onkar", 90.8);
		smap.put(null,null);
		smap.put("Amruta", 71.0);
		//smap.put(null,null);
		smap.put("Mandar", 84.3);
		smap.put("Gunjan", 75.2);
		
		System.out.println(smap);
		
		
		
	}
}
