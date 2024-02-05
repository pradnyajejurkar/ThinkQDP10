package com.constructor;

import java.util.Scanner;

public class LibraryTest {

	static Scanner sc = new Scanner(System.in);

	public static void enterBookDetails(Library l) {
		System.out.println("Enter Book id:");
		l.setId(sc.nextInt());

		System.out.println("Enter Book name:");
		l.setName(sc.next());

		System.out.println("Enter Book category:");
		l.setCategory(sc.next());

	}

	public static void main(String[] args) {
      Library l1=new Library();
      enterBookDetails(l1);
      System.out.println(l1);
      
      Library l2=new Library();
      enterBookDetails(l2);
      System.out.println(l2);
      
      System.out.println("Supplier Name:"+Library.supplier);
      System.out.println("Total Books:"+Library.bcount);
      
      
      
     
	}

}
