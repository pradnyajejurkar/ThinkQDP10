package com.crudarray;

public class Book {
	private int bookId;
	private String bookName;
	private String bookAuther;
	private int price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, String bookAuther, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuther = bookAuther;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuther() {
		return bookAuther;
	}

	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuther=" + bookAuther + ", price=" + price
				+ "]";
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
