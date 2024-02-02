package com.oops.constructor;

public class Book {

	private int bookid;
	private String bookname;
	private double bookprice;
	
	public Book() {
		
	}
	
	public Book(int bookid,String bookname,double bookprice) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookprice=bookprice;
	}
	
	public void setBookid(int bookid) {
		this.bookid=bookid;
	}
	
	public int getBookid() {
		return bookid;
	}
	
	public void setBookName(String bookname) {
		this.bookname=bookname;
	}
	
	public String getBookName() {
		return bookname;
	}
	
	public void setBookPrice(double bookprice) {
		this.bookprice=bookprice;
	}
	
	public double getBookPrice() {
		return bookprice;
	}
	
	//it gives representation of an object
	public String toString() {
		return "Bookid:"+bookid+"\tbookname:"+bookname+"\tbookprice:"+bookprice;
	}
}
