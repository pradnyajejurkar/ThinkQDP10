package com.demo.forloop;

public class Test_loop5 {

	public static void main(String[] args) {
	  
		char ch;
		
		System.out.println("Alphabets form(a-z)are:");
		
		for(ch='a';ch<='z';ch++) {
			System.out.println(ch+ "  " +(int)ch);
		}
			System.out.println("-----");
			int i;
			for(i=65;i<=122;i++) {
				System.out.println((char)i+ " " +i );
			}

	}

}
