package com.oops.assignment;

public class Product {

	private int proid;
	private String name;
	private String description;
	private int quantity;
	private double price;
	private double discount;
	private double totalPrice,discountPrice;
	
	
	Product(){
		
	}
	
	Product(int proid,String name,String description,int quantity,double price,double discount){
		this();
		this.proid=proid;
		this.name=name;
		this.description=description;
		this.quantity=quantity;
		this.price=price;
		this.discount=discount;
	}
	
	public double calTotalPrice() {
		totalPrice=quantity*price;
		return totalPrice;
	}
	
	public double calDiscountPrice() {
		discountPrice=discount*quantity;
		return discountPrice;
	}
	
	public void displayProduct() {
		System.out.println("Product id:"+proid);
		System.out.println("Product name:"+name);
		System.out.println("Product description:"+description);
		System.out.println("Product quantity:"+quantity);
		System.out.println("Product price:"+price);
		System.out.println("Product discount:"+discount);
		System.out.println("Total price:"+totalPrice);
		System.out.println("Discount price:"+discountPrice);
	}


	public static void main(String[] args) {
		Product p1=new Product(1,"laptop","Electronic Device",1,20000,15);
		p1.displayProduct();
		p1.calDiscountPrice();
	}

}
