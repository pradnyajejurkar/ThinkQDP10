package com.merge;

import java.util.Arrays;

public class MergeAlternate {

	static int[] mergeAlternate(int a1[],int a2[]) {
		int len1=a1.length;
		int len2=a2.length;
		int mar[]=new int[len1+len2];
		
		int i,j,index=0;
		for( i=0,j=0;i<len1&&j<len2;i++,j++) {
			mar[index++]=a1[i];
			mar[index++]=a2[j];
		}
		
		while(i<len1) {
			mar[index++]=a1[i++];
		}
		while(j<len2) {
			mar[index++]=a2[j++];
		}
		return mar;
	}
	
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {10,20,30,40,50,60};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int mr[]=mergeAlternate(arr1, arr2);
		
		System.out.println("After complete merge alternate:");
		System.out.println(Arrays.toString(mr));
	}

}
