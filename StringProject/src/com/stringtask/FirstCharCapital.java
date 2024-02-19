package com.stringtask;

import java.util.Arrays;

//WAP to make the first character of every word in a string as capital
public class FirstCharCapital {

	public static void firstCharCapital(String st) {
		
		String [] s=st.split(" ");
		String str="";
		for(int i=0;i<s.length;i++) {
			
			if(s[i].charAt(0)>='a' && s[i].charAt(0)<='z') {
				str=str+(char)(s[i].charAt(0)-32);
				
				}
				for(int j=1;j<s[i].length();j++) {
					str=str+s[i].charAt(j);
				}
				s[i]=str;
				str=str+" ";	
			}
		    System.out.println(str);
		}
		
	public static void main(String[] args) {
		String st = "a big cat is rolling on a big mat";
		System.out.println(st);

		firstCharCapital(st);
	}

}
