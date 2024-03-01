package com.hashsetdemo;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		
		HashSet<Item> hs=new HashSet<>();
		
		hs.add(new Item(1,"Chips",90.0));
		hs.add(new Item(2,"Milk",50.0));
		hs.add(new Item(3,"Choco",80.0));
		hs.add(new Item(4,"Biscuits",40.0));
		hs.add(new Item(1,"Chips",90.0));
		
		for(Item i:hs) {
			System.out.println(i);
		}
		System.out.println("--------------------");

		for(Item i:hs) {
			System.out.println(i);
		}
	}

}
