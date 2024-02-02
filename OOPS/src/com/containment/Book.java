package com.containment;

public class Book {

	private int bid;
	private String bname;
	private Author author;
	
	public Book() {
		
	}

	public Book(int bid, String bname, Author author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + "]";
	}
	
	
}
