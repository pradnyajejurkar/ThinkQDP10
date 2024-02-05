package com.constructor;

public class Library {
	private int id;
	private String name;
	private String category;
	static int bcount;
	static String supplier = "Mr XYZ";

	{
		bcount++;
	}

	public Library() {

		
	}

	public Library(int id, String name, double price, String category) {
		this();
		this.id = id;
		this.name = name;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", category=" + category + ",count="+bcount+"]";
	}

}
