package com.assignmnet;

public class ReplaceVowels {
static String replaceV(String s) {
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				ch[i]='@';
			}
		}
		System.out.println(ch);
		String s1=new String(ch);
		return s1;
	}
	

	static void convertString(String s) {
		
		char ch[]=s.toCharArray();
		String str="";
		for(int i = 0; i <s.length(); i++)  {
			if(Character.isUpperCase(s.charAt(i))) {
				str+=Character.toLowerCase(s.charAt(i));
			}
			else if(Character.isLowerCase(s.charAt(i))){
				str+=Character.toUpperCase(s.charAt(i));
			}
			else {
				str+=s.charAt(i);
			}
		}
		System.out.println("The Final String=  " +str);
	}
		
	public static void main(String[] args) {
		
//		String str="Programing is fun.Java is fun";
//		System.out.println(str);
//		
//		replaceV(str);
		 String s = "JaVa"; 
		 
		 convertString(s);
	}

}


