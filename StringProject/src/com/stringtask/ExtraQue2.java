package com.stringtask;

public class ExtraQue2 {

	
	public static void revrseString(String st) {
		String s[] = st.split(" ");
		
		String rev="";
		for(int i=st.length()-1;i>=0;i--) {
			rev=rev+st.charAt(i);
			
		}
		
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		String st = "Edabit";

		System.out.println(st);
		revrseString(st);
	}

	

}
