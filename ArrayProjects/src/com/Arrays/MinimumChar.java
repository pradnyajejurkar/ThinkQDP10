package com.Arrays;

public class MinimumChar {
   public static char findMinChar(char ch[]) {
    	char minimum=ch[0];
    	for(int i=0;i<ch.length;i++) {
    		if(ch[i]<minimum) {
    			minimum=ch[i];
    			
    		}
    	}
    	return minimum;
    }
	
	public static void main(String[] args) {
		char ch[]= {'a','x','z','c','y'};
		System.out.println("Minimum char:"+findMinChar(ch));

	}

}
