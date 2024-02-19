package com.stringtask;
//WAP to remove all the duplicate words from a string
public class RemoveDuplicate {

	public static void removeDuplicate(String st) {
		String[] s = st.split(" ");

		int count;
		boolean status;
		for (int i = 0; i < s.length; i++) {
			count = 1;
			status = false;
			
		    for (int j = i - 1; j >= 0; j--) {
				if (s[i]!=null && s[i].equalsIgnoreCase(s[j])) { 
					status = true;
					break;
				}
			}
			if (status == false) {
				for (int k = i + 1; k < s.length; k++) {
					if (s[i]!=null && s[i].equalsIgnoreCase(s[k])) {
						count++;
						s[k]=null;
					}
				}	
			
			if(s[i]!=null) {
				System.out.println(s[i]);
			}
			}	
		}	
	}

	public static void main(String[] args) {
		String st = "A big cat is rolling on a big mat";
		System.out.println(st);

		removeDuplicate(st);
	}

}
