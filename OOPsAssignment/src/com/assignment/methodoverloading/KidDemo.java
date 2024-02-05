package com.assignment.methodoverloading;

class Kid {
	public void readBook(int bookid) {
		System.out.println("method 1 para");
		System.out.println("bookid:"+bookid);
	}

	public void readBook(int bookid, String bookname) {
		
		System.out.println("method with two para");
		System.out.println("bookid:"+bookid);
		System.out.println("bookname:"+bookname);
	}
	}

public class KidDemo {

	public static void main(String[] args) {
		
		Kid k=new Kid();
		k.readBook(10);
		k.readBook(11, "java");
	}

}
