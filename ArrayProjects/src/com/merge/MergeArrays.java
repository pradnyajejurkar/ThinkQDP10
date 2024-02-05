package com.merge;

import java.util.Arrays;

public class MergeArrays {

	static int[] mergeAll(int a1[],int a2[]) {
		int length1=a1.length;
		int length2=a2.length;
		
		int mar[]=new int[length1+length2];
		int index=0; //for the mar
		
		for(int i=0;i<a1.length;i++) {
			mar[index++]=a1[i];
		}
		
		for(int i=0;i<a2.length;i++){
			mar[index++]=a2[i];
		}
		
		return mar;
		}
 	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {10,20,30,40,50,60};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int mr[]=mergeAll(arr1, arr2);
		
		System.out.println("After complete merge:");
		System.out.println(Arrays.toString(mr));
				
		}
		}
	