package com.wordslogical;

import java.util.Arrays;

public class SplitString {

	
	static void divideString(String s,int noOfc)
	{
		int len =s.length();
		int ns=len/noOfc;
		if(len%noOfc!=0) {
			System.out.println("Can not divide in equal parts....");
			
		}
		else
		{
			String splitstr[]=new String[ns];
			int index=0;
			for(int i=0;i<s.length();i+=noOfc) {
				splitstr[index]=s.substring(i,i+noOfc);
				index++;
			}
			System.out.println(Arrays.toString(splitstr)); 
		}
	
	}
	
	public static void main(String[] args) {
		String arr[]= {"I", "am", "very", "smart"}; //12
		
		System.out.println(Arrays.toString(arr));
		String st=String.join("", arr);
		//System.out.println(st);
		
		int noOfChars=3;
		divideString(st, noOfChars);

	}

}
