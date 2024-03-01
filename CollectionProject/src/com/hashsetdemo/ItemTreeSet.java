package com.hashsetdemo;

import java.util.Comparator;

import java.util.TreeSet;

 class ItemComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		if(o1.getCost()==o2.getCost()) 
			return o1.getName().compareTo(o2.getName());
			else
				return (int) (o2.getCost()-o1.getCost());
		}
	}
 public class ItemTreeSet{
	public static void main(String[] args) {
     TreeSet<Item> hs=new TreeSet<>(new ItemComparator());
		
		hs.add(new Item(1,"Chips",90.0));
		hs.add(new Item(2,"Milk",50.0));
		hs.add(new Item(3,"Choco",80.0));
		hs.add(new Item(4,"Biscuits",40.0));
		hs.add(new Item(1,"Chips",90.0));
		
		for(Item i:hs) {
			System.out.println(i);
		}
	}
	}
	


