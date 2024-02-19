package com.stringtask;

// WAP to reverse the string word by word keepin first and last as it is 
public class ReverseString {

	public static void revrseString(String st) {
		String s[] = st.split(" ");
		String revst = "";
		revst = s[0]+" ";
		for (int i = 1; i < s.length - 1; i++) {
			for (int j = s[i].length() - 1; j >= 0; j--) {
				revst = revst + s[i].charAt(j);
			}
			revst = revst+" ";
		}
		System.out.println(revst+" "+s[s.length-1]);
	}

	public static void main(String[] args) {
		String st = "I like to learn java";

		System.out.println(st);
		revrseString(st);
	}

}
