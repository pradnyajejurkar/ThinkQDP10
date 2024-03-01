package com.mapdemo.hashmapdemo;

import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Double> lhm=new LinkedHashMap<>(16,0.75f,true);
		
		lhm.put("Pradnya", 85.0);
		lhm.put("Onkar", 90.8);
		lhm.put("Amruta", 71.0);
		lhm.put("Pooja", 88.3);
		lhm.put("Mandar", 84.3);
		lhm.put("Gunjan", 75.2);
		
		for(Entry<String,Double> e:lhm.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}

		System.out.println("------------------------------------");
		System.out.println("Marks of pooja:"+lhm.get("Pooja"));
		
		System.out.println("------------------------------------");


		for(Entry<String,Double> e:lhm.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}

		
	}

}
