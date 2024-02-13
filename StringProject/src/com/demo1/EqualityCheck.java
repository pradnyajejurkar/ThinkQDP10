package com.demo1;

public class EqualityCheck {

	public static void main(String[] args) {
//		int i1=20;
//		int i2=20;
//		
//		System.out.println(i1==i2);
		
		String s1="java";
		String s2="java";
		
		//compare reference to object
		System.out.println(s1==s2);
		
		//compare content
		System.out.println(s1.equals(s2));

		System.out.println("------------------------");
		
		String s3=new String("java");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
