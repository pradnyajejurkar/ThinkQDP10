package com.oops.classobject;

public class Book {
	
	int bookid;
	String bookname;
	double bookprice;
	
	public void setDetails(int bid,String bname,double bprice) {
		bookid=bid;
		bookname=bname;
		bookprice=bprice;
		
	}
	
	public void showDetails() {
		System.out.println("Book Id:"+bookid);
		System.out.println("Book Name:"+bookname);
		System.out.println("Book Price:"+bookprice);
		System.out.println("------------------------");
		
	}
	

}
