package com.mapdemo.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class logicalQue {

	static void createMap(ArrayList<String> names) {
		HashMap<String ,Integer> hm=new HashMap<>();
		for(String n:names) {
			if(hm.containsKey(n)) {
//				int count=hm.get(n);
//				count++;
//				hm.put(n, count);
//				
				hm.put(n, hm.get(n)+1);
				
			}
			else
			{
				hm.put(n, 1);
			}
		}
		for(Map.Entry<String, Integer> en: hm.entrySet()) {
			System.out.println(en.getKey()+":"+en.getValue());
		}
	}
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("pradnya");
		list.add("neha");
		list.add("rita");
		list.add("pradnya");
		list.add("neha");
		list.add("pradnya");
		list.add("jiya");
		list.add("Sujata");
		
		createMap(list);
	}

}
