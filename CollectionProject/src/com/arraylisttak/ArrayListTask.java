package com.arraylisttak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTask {

	public static void main(String[] args) {
		/*
		 * 1. WAP to add elements to arraylist without using generics (no <>) and print
		 * content of it where Integer is used. In second arraylist String is used.
		 */
		/*
		 * 2. WAP add elements to arraylist without using generics, 0th location keep
		 * Integer, 1st location String now print each element and display contents.
		 */
		/* 3. WAP to use add operation of ArrayList */
//7.	WAP to create a new ArrayList, add some colors (string) and print the collection.		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(2, 30);
		al.add("red");
		System.out.println(al);

		ArrayList al2 = new ArrayList();
		al2.add("red");
		al2.add("green");
		al2.add("purple");
		al2.add(2, "pink");
		System.out.println(al2);

		List<String> a3 = new ArrayList<>();

		a3.add("Shreyash");
		a3.add("pradnya");
		a3.add("Mandar");
		a3.add("Gunjan");

		System.out.println(a3);

		ArrayList<String> list = new ArrayList<>();
		list.add("Shreyash");
		list.add("pradnya");
		list.add("Mandar");
		list.add("Gunjan");

		System.out.println(list);

		/* 4. WAP to print all elements of ArrayList using iterator */
		Iterator<String> itr = al2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------------------");
		/* 5.WAP to iterate through all elements in an ArrayList using for loop */
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("--------------------------");
		// 6.WAP to iterate through all elements in an ArrayList using for each
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------------");

		// 8.WAP to remove element from ArrayList
		System.out.println(al2.remove("green"));
		System.out.println(al2);

		System.out.println("-------------------------");
		// 9.WAP to remove all elements from ArrayList
		// al.removeAll(al2);

		System.out.println("-------------------------");
		// 10.WAP to retain all elements from ArrayList

		al.retainAll(al2);
		System.out.println(al);

		System.out.println("-------------------------");
		// 11.WAP to know how many elements in ArrayList

		System.out.println(list.size());

		System.out.println("-------------------------");
		// 12.WAP to test an ArrayList is empty or not
		System.out.println(list.isEmpty());

		System.out.println("-------------------------");
		// 13.WAP to empty ArrayList
		al2.clear();
		System.out.println(al2);

		System.out.println("-------------------------");
		// 14.WAP to search an element from ArrayList
		System.out.println(a3.contains("Mandar"));

		System.out.println("-------------------------");
		// 15.WAP to search the specified collection in this collection
		System.out.println(a3.containsAll(list));

		System.out.println("-------------------------");
		// 16.WAP to retrieve an element (at a specified index) from a given ArrayList

		System.out.println(list.get(0));

		System.out.println("-------------------------");
		// 17.WAP to insert an element into the ArrayList at the first position
		list.add(1, "ram");
		System.out.println(list);

		System.out.println("-------------------------");
		// 18.WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using
		// iterator)
		ArrayList<Integer> al4 = new ArrayList<>();
		for (int i = 0; i <= 50; i++) {
			al4.add(i);
		}

		Iterator<Integer> itr1 = al4.iterator();
		System.out.println(al4);
		while(itr1.hasNext()) {
		   Integer a = itr1.next();

		    if (a % 2 == 0) {
			System.out.println(a);

		}
		}
		System.out.println("-------------------------");
		// 19.WAP to match two collections

		ArrayList<Integer> id1 = new ArrayList<>();
		id1.add(1);
		id1.add(2);
		id1.add(3);
		id1.add(4);

		System.out.println(id1);

		ArrayList<Integer> id2 = new ArrayList<>();
		id2.add(1);
		id2.add(2);
		id2.add(3);
		id1.add(4);

		System.out.println(id2);

		Collections.sort(id1);
		Collections.sort(id2);

		boolean isEqual = id1.equals(al2);
		System.out.println(isEqual);

		// 20. WAP to check if collection is empty

		System.out.println(id1.isEmpty());

		System.out.println("-------------------------");
		// 21. WAP to convert collection into array
		// String lang[]= {"Java","C","Python","Angular"};
		ArrayList<String> ali = new ArrayList<>();
		ali.add("Java");
		ali.add("C");
		ali.add("Python");
		ali.add("Angular");

		System.out.println(ali);
		ali.toArray();
		System.out.println("-------------------------");
		// 22.	WAP of swap two elements in an ArrayList
	   Collections.swap(ali, 1, 2);
	   System.out.println(ali);
	   
	   System.out.println("-------------------------");
	//23.WAP to replace the second element of an ArrayList with the specified element	
	 ali.set(1, "C++");
	 System.out.println(ali);
	   
	}

}
