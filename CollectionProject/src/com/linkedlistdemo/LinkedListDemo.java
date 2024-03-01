package com.linkedlistdemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		LinkedList<String> comp=new LinkedList<>();
		
		//System.out.println(comp.getFirst());gives noSuchElementexception
		
		System.out.println(comp.peekFirst());//null
		
		//System.out.println(comp.remove());gives noSuchElementexception
		
		System.out.println(comp.poll());//null
		
		comp.add("Tcs");
		comp.add("Hcl");
		System.out.println(comp.offerFirst("Capgemini"));
		comp.add(1,"Dell");
		comp.addLast("Wipro");
		
		System.out.println(comp);
		
		System.out.println(comp.element());
		//System.out.println(comp.		
}
}
