package com.queuedemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		//default capacity-16
		//increse by power of 2
		//maintains insertion order
		
		ArrayDeque<Book> adq=new ArrayDeque<>();
		adq.add(new Book(1,"Secret",900));
		adq.add(new Book(2,"Hamlet",750));
		adq.add(new Book(3,"Life",1000));
		adq.add(new Book(4,"Power of Mind",820));
		
		//adq.add(null);
		
		for(Book b:adq) {
			System.out.println(b);
		}
		
		System.out.println("--------------------------");
		System.out.println(adq.removeLast());
		System.out.println("--------------------------");
		
		for(Book b:adq) {
			System.out.println(b);
		}
		
		System.out.println("--------------------------");
		System.out.println(adq.offerFirst(null));

	}

}
