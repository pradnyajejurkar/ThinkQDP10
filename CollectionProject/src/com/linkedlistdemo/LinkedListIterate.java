package com.linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterate {

	public static void main(String[] args) {
		LinkedList<String> fruits=new LinkedList<>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pinapple");
		fruits.add("Watermelon");
		fruits.add("Orange");

		System.out.println(fruits);
		
		//normal for loop
		for(int i=0;i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}

		System.out.println("---------------------------");
		//enahanced for loop
		for(String f:fruits) {
			System.out.println(f);
		}

		System.out.println("--------------------------");
		
		//list iterator:forword
		
		ListIterator<String> litr=fruits.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("--------------------------");
		
		//list iterator:backword
		
		ListIterator<String> lit=fruits.listIterator(fruits.size());
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		//list iterator decending
		System.out.println("--------------------------");

		Iterator<String> itr= fruits.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
