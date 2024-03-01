package com.mapdemo.hashmapdemo;

import java.util.Map;
import java.util.TreeMap;

public class CustomerOrderTreeMap {

	public static void main(String[] args) {
		
    TreeMap<Order,Customer> tmap= new TreeMap<>(new PriceComparator());
		
		tmap.put(new Order(102, "Burger", 500), new Customer(1, "Supriya", 86757646));
		tmap.put(new Order(101, "Fries", 100), new Customer(2, "Anita",98234623));
		tmap.put(new Order(105, "Juice", 250), new Customer(3, "Pravin", 763246342));
		tmap.put(new Order(104, "Pizza", 800), new Customer(1, "Supriya", 86757646));
		tmap.put(new Order(103, "Brownie", 520), new Customer(2, "Anita",98234623));
		
		for(Map.Entry<Order, Customer> e: tmap.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("-----------------------------------------");
		}
	}

}