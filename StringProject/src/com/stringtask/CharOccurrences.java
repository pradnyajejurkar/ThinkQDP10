package com.stringtask;

import java.util.Arrays;

public class CharOccurrences {

	static void charOccurences(String s) {
		int count;
		for (int i = 0; i < s.length(); i++) {
			count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			System.out.println(s.charAt(i) + ":" + count);
		}
	}
	
	static void allcharOccurences(String s) {
		char ch[]=s.toCharArray();
		int count;
		boolean status;

		for (int i = 0; i < ch.length; i++) {
			count = 1;
			status = false;

			for (int j = i - 1; j >= 0; j--) {
				if (ch[i] == ch[j]) {
					status = true;
					break;
				}
			}

			if (status == false) {
				for (int k = i + 1; k < ch.length; k++) {
					if (ch[i] == ch[k])
						count++;
				}

				System.out.println(ch[i] + "-->" + count);

			}

		}

	}
	
	
	static void findDuplicate(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)!=' '){
					if(s.charAt(i)==s.charAt(j))
						System.out.println(s.charAt(i) + ": is duplicate");
						
					}
					
				}
			}
		}
		
	
	 static void removeSpaces(String s) {
		 s=s.trim();
		 System.out.println(s);
	 }
	 
//	 static void toggleCases(String s) {
//		 for (int i = 0; i < s.length(); i++) {
//			 if(s.charAt(i)>=16 && s.charAt(i)<=122){
//				 s=s.toUpperCase();
//			 if(s.charAt(i)>=65 && s.charAt(i)<=90){	 
//				 s=s.toLowerCase();
//			 }
//		 }
//			 
//	 }
//	 }	 
	 
	 static void reverseString(String s) {
			
			String rev="";
			for(int i=s.length()-1;i>=0;i--) {
				rev=rev+s.charAt(i);
			}
			System.out.println(rev);
	 }
	 
	 static char highestfrequencyChar(String str) {
	     int count[]=new int[256];
		 char ans = ' ';
	        int maxCount = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            count[c]++;
	            if (count[c] > maxCount) {
	                maxCount = count[c];
	                ans = c;
	            }
	        }
	        return ans;
	    }

			
	        
	
	 
	public static void main(String[] args) {
		String s=" pradnya jejurkar";
		
		//highestfrequencyChar(s);
		
		 char maxChar = highestfrequencyChar(s);
	        System.out.println("Max occurring character is: " + maxChar);
		//charOccurences(s);
		//allcharOccurences(s);
		
		//removeSpaces(s);
		
		//findDuplicate(s);
		//toggleCases(s);
		
		//reverseString(s);
	
	}

}
