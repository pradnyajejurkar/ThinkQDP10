package com.basic.assignments;

public class PrintVowels {

	public static boolean checkVowels(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || 
				ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		char ch[]= {'p','r','a','d','n','y','a'};
		
		for(int i=0;i<ch.length;i++) {
			if(checkVowels(ch[i])) {
				System.out.println(ch[i]+ " ");
			}
		}

	}

}
