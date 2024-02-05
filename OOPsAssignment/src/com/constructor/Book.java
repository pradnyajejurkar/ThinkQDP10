package com.constructor;

public class Book {

	private int id;
	private String name;
	private double price;
	private String category;
	private double discPrice;

	Book() {

	}

	Book(int id, String name, double price, String category) {
		this();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double calDiscountedPrice(double disc) {
		discPrice = price - ((price * disc) / 100);
		return discPrice;
	}

	public void compareDiscountCost(Book b1) {
		if (this.discPrice == b1.discPrice)
			System.out.println("Both have same price");
		else if (this.discPrice < b1.discPrice)
			System.out.println(b1.name + " has higher price");
		else
			System.out.println(this.name + " has higher price");
	}

	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

}
