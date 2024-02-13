package com.stringlogical;

public class StringIntern {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		
		System.out.println("------------------");
		
		String s3=new String("java");
		s3=s3.intern();
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String str2="java";
		str2=str2.concat("Programs"); //here object is created in heap which is then stored in scp
		System.out.println(str2);
		System.out.println(str2.hashCode());

		String str3="javaprograms";
		System.out.println(str3.hashCode());
		
		System.out.println("--------------------------");
		
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
	}

}
