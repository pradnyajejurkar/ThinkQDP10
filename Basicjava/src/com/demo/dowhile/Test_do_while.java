package com.demo.dowhile;
//write a program to print 1 to 10 numbers
public class Test_do_while {

	public static void printNo() {
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	
	public static void displayNo(int n) {
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNo();
		System.out.println("\n---");
		displayNo(50);
	}

}
