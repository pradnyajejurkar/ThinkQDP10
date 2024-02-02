package com.oops.classobject;

public class BookTest {

	public static void main(String[] args) {
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		
		b1.setDetails(101, "abc", 350);
		b2.setDetails(102, "xyz", 550);
		b3.setDetails(103, "pqr", 450);
		
		b1.showDetails();
		b2.showDetails();
		b3.showDetails();
		
		

	}

}
