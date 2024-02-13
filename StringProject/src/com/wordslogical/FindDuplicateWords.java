package com.wordslogical;

public class FindDuplicateWords {

	static void findDuplicateWords(String st) {
        String []s=st.split(" ");
		
		int count;
		boolean status;
		for(int i=0;i<s.length;i++) {
			count=1;
			status=false;
			
			for(int j=i-1;j>=0;j--) {
				if(s[i].equals(s[j])) { //if(s[i].equalsIgnoreCase(s[j]))
				status=true;
				break;
			}
		  }
		if(!status) {
			
			for(int k=i+1;k<s.length;k++) {
				if(s[i].equals(s[k])) //if(s[i].equalsIgnoreCase(s[k]))
					count++;
			 }
			if(count>1) {
			System.out.println(s[i]+"-> " +count);
			}
			}
		}
	}
	public static void main(String[] args) {
		String st = "A big cat is rolling on a big mat";
		System.out.println(st);

		findDuplicateWords(st);
	}

}
