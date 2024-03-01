package com.queuedemo;

import java.util.PriorityQueue;

public class Library {

	public static void main(String[] args) {
		PriorityQueue<Book> bpq=new PriorityQueue<>();
		bpq.add(new Book(1,"Secret",900));
		bpq.add(new Book(2,"Hamlet",750));
		bpq.add(new Book(3,"Life",1000));
		bpq.add(new Book(4,"Power of Mind",820));
		
		//System.out.println(bpq);
		for(Book b:bpq) {
			System.out.println(b);
		}
	}

}
