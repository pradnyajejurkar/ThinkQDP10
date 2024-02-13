package com.stringlogical;

public class StringPalindrome {

	static boolean checkPalindrome(String s) {
		//using temporary string
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
			return true;
		else
			return false;
	}
	
	//or
	static boolean checkPalindrome2(String s) {
		//without temporary string
		s=s.toLowerCase();
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--) {
		 
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
		
		
	}
	public static void main(String[] args) {
		String str="Malayalam";
		
		System.out.println(str);
		//if(checkPalindrome(str))
		if(checkPalindrome2(str))
			System.out.println(str+ " is palindrome");
		else
			System.out.println(str+ " is not palindrome");
	}

}
