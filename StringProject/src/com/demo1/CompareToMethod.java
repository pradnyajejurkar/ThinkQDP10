package com.demo1;

public class CompareToMethod {

	public static void main(String[] args) {
		
		//compare lexicograpically
		//compares the unicode of char
		
		//if two string content are exactly same=0
		
		String s1="Abha";
		String s2="Clay";
		
		System.out.println(s1.compareTo(s2));//-2
		System.out.println(s2.compareTo(s1));//
		
		String s3="Rahul";
		String s4="Rahul";
		
		System.out.println(s3.compareTo(s4));//-2
		System.out.println(s4.compareTo(s3));
		
		

	}

}
