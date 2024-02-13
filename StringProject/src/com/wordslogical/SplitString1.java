package com.wordslogical;

import java.util.Arrays;

public class SplitString1 {

	static void divideStringAddHash(String s,int noOfc)
	{
		int len =s.length();
		//int ns=len/noOfc;
		if(len%noOfc!=0) {
			//remaining char
			int x=noOfc-(len%noOfc);
			for(int i=0;i<x;i++) {
				s=s+"#";
				//s=s.concat("#");				
			}
		}
			
		
			//System.out.println(s);
		    len =s.length();
		    int ns=len/noOfc;
		    
			String splitstr[]=new String[ns];
			int index=0;
			for(int i=0;i<s.length();i+=noOfc) {
				splitstr[index]=s.substring(i,i+noOfc);
				index++;
			}
			System.out.println(Arrays.toString(splitstr)); 
		}
	
	

	
	public static void main(String[] args) {
     String arr[]= {"I", "am", "very", "smart"}; //12
		
		System.out.println(Arrays.toString(arr));
		String st=String.join("", arr);
		
		int noOfChars=5;
		divideStringAddHash(st, noOfChars);
	}
	

}
