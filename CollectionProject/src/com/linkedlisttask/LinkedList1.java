package com.linkedlisttask;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(10);
		llist.add(20);
		llist.add(30);
		llist.add(40);
		llist.add(50);

		for (Integer i : llist) {
			System.out.println(i);
		}

		System.out.println("------------------------------------");
//1.WAP to append the specified element to the end of a linked list.
		llist.addLast(60);

		for (Integer i : llist) {
			System.out.println(i);
		}
		System.out.println("------------------------------------");

		// 2.WAP to iterate through all elements in a linked list.

		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}

		System.out.println("------------------------------------");
//3.	WAP to iterate through all elements in a linked list starting at the specified position.
		for (int i = 2; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}

		System.out.println("------------------------------------");
		// 4. WAP to iterate a linked list in reverse order.

		ListIterator<Integer> itr = llist.listIterator(llist.size());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

		System.out.println("------------------------------------");
//5.WAP to insert the specified element at the specified position in the linked list.
		llist.add(2, 70);
		for (Integer i : llist) {
			System.out.println(i);
		}

		System.out.println("------------------------------------");
//6.WAP to insert elements into the linked list at the first and last position.

		llist.addFirst(11);
		llist.addLast(12);
		for (Integer i : llist) {
			System.out.println(i);
		}

		System.out.println("------------------------------------");
//7.WAP to insert the specified element at the front of a linked list.

		llist.addFirst(8);

		for (Integer i : llist) {
			System.out.println(i);
		}

		System.out.println("------------------------------------");
//8.WAP to insert the specified element at the end of a linked list.

		llist.addLast(10);
		for (Integer i : llist) {
			System.out.println(i);
		}

		System.out.println("------------------------------------");
//9.WAP to insert some elements at the specified position into a linked list.

		llist.add(1, 7);
		llist.add(5, 7);

		for (Integer i : llist) {
			System.out.println(i);
		}

		System.out.println("------------------------------------");
//10.WAP to get the first and last occurrence of the specified elements in a linked list.
		// System.out.println(llist.removeFirstOccurrence(10));
		// System.out.println(llist.removeLastOccurrence(10));

		System.out.println(llist.indexOf(7));
		System.out.println(llist.lastIndexOf(7));

		System.out.println("------------------------------------");
		// 11. WAP to display the elements and their positions in a linked list.

		for (int i = 0; i < llist.size(); i++) {
			System.out.println(i + ":" + llist.get(i));
		}

		System.out.println("------------------------------------");
//12.WAP to remove a specified element from a linked list.

		llist.remove(3);

		for (Integer i : llist) {
			System.out.println(i);
		}

		System.out.println("------------------------------------");
		// 13.WAP to remove first and last element from a linked list.

		llist.removeFirst();
		llist.removeLast();

		for (Integer i : llist) {
			System.out.println(i);
		}

		System.out.println("------------------------------------");
//14.	WAP to remove all the elements from a linked list.
		llist.removeAll(llist);
		System.out.println(llist);



	}

}
