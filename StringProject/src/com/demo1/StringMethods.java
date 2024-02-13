package com.demo1;

public class StringMethods {

	public static void main(String[] args) {
		String str="java is fun.";
		System.out.println(str.length());//gives length of hole string =12
		
		//charAt
		
		System.out.println(str.charAt(1));//gives 1st index=a
		
		System.out.println(str.charAt(str.length()-1));//last char= .
		
		//concat, +
		
		String s1="Hello";
		String s2="World";
		
		//2 diff object will be created "HelloWorld" in heap only
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//substring
		
		System.out.println(str.substring(1));//prints from till length
		System.out.println(str.substring(1, 6));// print from 1 to 5
		
		
		//contains
		
		System.out.println(str.contains("ava"));
		System.out.println("or1");
		
		String w1="hi";
		String w2="Hi";
		
		System.out.println(w1==w2);//false
		System.out.println(w1.equals(w2));//false
		
		System.out.println(w1.equalsIgnoreCase(w2));
		
		//upper case
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		//indexOf,lastIndexOf
		
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		
		System.out.println(str.indexOf("fun"));
		
		//isEmpty
		
		String str1="  ";
		System.out.println(str1.isBlank());//return true
		System.out.println(str1.isEmpty());//return false: length=4
		
		//trim
		
		String st=" java  ";
		System.out.println(st+st.length());
		
		st=st.trim();
		System.out.println(st+st.length());
		
		//replace
		
		System.out.println(st.replace('a', 'z'));//replace occurence of each char
		System.out.println(st);//not replace hole string
	}

}
