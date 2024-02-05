package com.anonymousinnerclass;


/*Task1>>
Create a example of method inner class in which there is an outer class called Shopping Mall which 
consist of method doShoping() . Create a local inner class Cart and add items to Cart and display the
bill*/


class ShoppingMall{
	void doShopping() {
		System.out.println("This is shopping method");
		
		class Cart{
			private int item=10;
			
			void displayBill() {
				System.out.println(item);
			}
		}
		Cart c1=new Cart();
		c1.displayBill();
	}
}

public class ShoppingDemo {

	public static void main(String[] args) {
		ShoppingMall s1=new ShoppingMall();
		s1.doShopping();

	}

}
