package com.oops.classobject;

public class FoodTest {

	public static void main(String[] args) {
		
		Food f1=new Food();
		Food f2=new Food();
		Food f3=new Food();
		
		f1.setfood(101,"pav bhaji",180);
		f2.setfood(102,"cake",500);
		f3.setfood(103,"biryani",250);
		
		f1.showFood();
		f2.showFood();
		f3.showFood();
		
	}

}
