package com.constructor;

import java.util.Scanner;

public class BookTest {

	static Scanner sc = new Scanner(System.in);

	public static void enterBookDetails(Book b) {
		System.out.println("Enter Book id:");
		b.setId(sc.nextInt());

		System.out.println("Enter Book name:");
		b.setName(sc.next());

		System.out.println("Enter Book price:");
		b.setPrice(sc.nextDouble());

		System.out.println("Enter Book category:");
		b.setCategory(sc.next());

	}

	public static void main(String[] args) {

		Book b1 = new Book();
		enterBookDetails(b1);

		System.out.println("Enter discount:");
		double dis = sc.nextDouble();

		double amount = b1.calDiscountedPrice(dis);
		System.out.println(b1);

		System.out.println("Amount to pay:" + amount);

		Book b2 = new Book();
		enterBookDetails(b2);

		System.out.println("Enter discount:");
		double dis1 = sc.nextDouble();
		b2.calDiscountedPrice(dis1);

		amount = b2.calDiscountedPrice(dis1);
		System.out.println(b2);
		System.out.println("Amount to pay:" + amount);

		b1.compareDiscountCost(b2);
	}
}
