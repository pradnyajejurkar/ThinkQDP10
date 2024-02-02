package com.oops.constructor;

public class BookTest {

	public static void main(String[] args) {
		Book b1=new Book(101,"lets learn java",500);
		
		System.out.println(b1);
		//System.out.println(b1.toString());

		System.out.println("hello"+10);
		System.out.println("hello"+10+20);
		System.out.println(10+20+"hello");
		//System.out.println("hello"+10-20);
		System.out.println("hello"+10*20);
		System.out.println(10-20+"hello");
	}

}
