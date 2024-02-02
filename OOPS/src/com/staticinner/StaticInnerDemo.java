package com.staticinner;

class Outer {
	static int value = 10;
	String msg = "hello";

	void display() {
		System.out.println("Value:" + value);
		System.out.println("Message:" + msg);
	}

	static class Inner {
		static int data = 100;
		String msg1 = "welcome";

		void show() {
			System.out.println("Value:" + value);
//			System.out.println("Message from outer:"+msg);
//			display();

			System.out.println("Data:" + data);
			System.out.println("Inner message:" + msg1);

			Outer o1 = new Outer();
			System.out.println("Message from outer:" + o1.msg);
			o1.display();

		}

		static void print() {
			System.out.println("static inner");
		}
	}
}

public class StaticInnerDemo {

	public static void main(String[] args) {
		
		//Outer.Inner i2=new Outer().new Inner();

		Outer.Inner i1=new Outer.Inner();
		i1.show();
		
		Outer.Inner.print();
		
	}

}
