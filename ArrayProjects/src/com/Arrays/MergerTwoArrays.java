package com.Arrays;

import java.util.Arrays;

//Merge the two arrays as follows
//ar1={1,2,3}
// ar2={4,5,6,7,8}
//o/p: mar1={1,4,2,5,3,6,7,8}
// mar2={1,5,3,7,8}


public class MergerTwoArrays {

	static int[] mergeAlternate(int arr1[],int arr2[]) {
		int len1=arr1.length;
		int len2=arr2.length;
		
		int mar1[]=new int[len1+len2];
		
		int i ,j,index=0;
		
		for(i=0,j=0;i<len1&&j<len2;i++,j++) {
			mar1[index++]=arr1[i];
			mar1[index++]=arr2[j];
		}
		
		while(i<len1) {
			mar1[index++]=arr1[i++];
		}
		
		while(j<len2) {
			mar1[index++]=arr2[j++];
		}
		
		return mar1;
	}
	
	
	static int[] mergeAlternateSkip(int ar1[],int ar2[]) {
		int len1=ar1.length;
		int len2=ar2.length;
		
		int maxLength=Math.max(len1, len2);
		int mar2[]=new int[maxLength];
		
		int i=0,index=0;
		
		while(index<maxLength) {
			if(i<ar1.length) {
				mar2[index++]=ar1[i++];
			}
			if(i<ar2.length) {
				mar2[index++]=ar2[i++];
			}
		}
		return mar2;
	}
	
	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6,7,8};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2)); 
		
		int m[]=mergeAlternate(arr1, arr2);
		System.out.println("After complete merge alternate :");
		System.out.println("mar1:"+Arrays.toString(m));
		
		int m1[]=mergeAlternateSkip(arr1, arr2);
		System.out.println("After complete merge alternate skip:");
		System.out.println("mar2:"+Arrays.toString(m1));
	}

}
