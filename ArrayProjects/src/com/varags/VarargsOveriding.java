package com.varags;

// we can override the method having varargs , array
	class Parent {
		void display(int [] a) {
			System.out.println("In Parent");
		}
		
		void show(String... s) {
			System.out.println("In Parent");
		}
	}

	class Child extends Parent {

		
//		@Override
//		void display(int a) {
//		//	super.display(a);
//			System.out.println("In Child");
//			for(int x: a)
//			{
//				System.out.println(x);
//			}
//		}
	//	
		@Override
		void display(int ... a) {
		//	super.display(a);
			System.out.println("In Child");
			for(int x: a)
			{
				System.out.println(x);
			}
		}
		
		void show(String... s) {
			System.out.println("In Child");
		}

	}

public class VarargsOveriding {
		
		public static void main(String[] args) {
			
			Child c1= new Child();
			int ar[]= {1,2,3};
			c1.display(ar);
			c1.display(1,2,4);
		}

	}

