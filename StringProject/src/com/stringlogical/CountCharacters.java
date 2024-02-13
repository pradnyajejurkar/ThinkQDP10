package com.stringlogical;

public class CountCharacters {

	static int findNoChars(String s) {
		int count=0;
		char ch[]=s.toCharArray();
		for(char c:ch) {
			count++;
		}
		
//		for(int i=0;i<ch.length;i++) {
//			count++;
//		}
				
	 return count;
	}
	
	static void findVowelsConsonants(String s) {
		int vcount=0,ccount=0;
		s=s.toUpperCase();
		char ch[]=s.toCharArray();
		for(char c:ch) 
		{
			
			//omit spaces and .
			if(c==' '| c=='.') 
			
				continue;
				
			if(c=='A'|c=='E'|c=='I'|c=='O'|c=='U') 
			{
				vcount++;
				
			}
			else
			{
				ccount++;
			}
			
		}
		System.out.println("Number of vowels:"+vcount);
		System.out.println("Number of consonants:"+ccount);
	
	}
	public static void main(String[] args) {
	 String str="Programing is fun.Java is fun";
//		 System.out.println("Number of characters in "+str+" is : "+findNoChars(str));
//		 
//		 System.out.println(str.length());
	 
	 	System.out.println(str);
	    findVowelsConsonants(str);
	 
	}

}
