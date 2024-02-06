package com.varags;

public class VaragsOverloading {

	static void display(int... a1) {
		System.out.println("In Int");
		for (int x : a1) {
			System.out.println(x);
		}
	}

	static void display(int a1)
	{
		System.out.println("In int single");
		System.out.println(a1);
	}
	
	static void display(double... d1) {
		System.out.println("In double");
		for (double x : d1) {
			System.out.println(x);
		}
	}
	
	static void displayMe(int x,char...ch) {
		System.out.println(x);
		for (char c : ch) {
			System.out.println(c);
		}
	}
	
	static void displayMe(char x,int...ch) {
		System.out.println(x);
		for (int c : ch) {
			System.out.println(c);
		}
	}
	
	static void show(Integer... i1) {
		System.out.println("In wrapper int");
		
		}
	
	
	static void show(Character ...c1) {
		System.out.println("in wrapper char");
	}

	public static void main(String[] args) {
	   display(4,5,6);
	   System.out.println("--------------------------");
	   display(4.5,5.4,6.0);
	   System.out.println("--------------------------");
	   display('A','c','d');
	   System.out.println("--------------------------");
	   
	   
	   //displayMe(60,20,30,80);
	   displayMe('a', 4,5,2);
	   displayMe(8, 's','f','e');
	   
	   
	   System.out.println("---------------------------");
	   show(4,5,6);
	   
	   display(3);
	   

	}

}
