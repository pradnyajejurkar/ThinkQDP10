package com.stringtask;

import java.util.Arrays;

public class FindMostRepetedWords {

	static void findMostRepetedWords(String s) {
		
		String [] st=s.split(" ");
		
		int count=0;
		int maxcount[]=new int[5];
		int maxindex=0;
		String max[]=new String[5];
		int index=0;
		boolean status;
		for (int i = 0; i < st.length; i++) {
			count = 1;
			status = false;

			for (int j = i - 1; j >= 0; j--) {
				if (st[i].equalsIgnoreCase(st[j])) { // if(s[i].equalsIgnoreCase(s[j]))
					status = true;
					break;
				}
			}
			if(!status) {
				
				for(int k=i+1;k<st.length;k++) {
					if(st[i].equals(st[k])) //if(s[i].equalsIgnoreCase(s[k]))
						count++;
				 }
			if(count>1) {
				maxcount[maxindex++]=count;
				max[index++]=st[i];
				
			}
			
		}
	}
		for(int i=0;i<index;i++) {
			System.out.println(max[i]+" ");
		}
	
}
	
	public static void main(String[] args) {
		String str="I like to learn java the java is easy to learn";
		
		System.out.println(str);

		findMostRepetedWords(str);
	}

}
