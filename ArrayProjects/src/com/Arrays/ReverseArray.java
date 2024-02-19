package com.Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void reverseArray(int[] arr) {
		int arr2[]=new int[arr.length];
		int index=0;
		
		if(arr.length%2==0) {
			for(int i=arr.length/2;i<arr.length;i++) {
				arr2[index++]=arr[i];
			}
			
			for(int i=0;i<arr.length/2;i++) {
				arr2[index++]=arr[i];
			}
		}
		else {
			for(int i=(arr.length/2)+1;i<arr.length;i++) {
				arr2[index++]=arr[i];
			}
			
			arr2[index++]=arr[arr.length/2];
			for(int i=0;i<arr.length/2;i++) {
				arr2[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
	
	public static void main(String args[]) {
		int arr[]= {1,2,5,7,3,4};
		System.out.println(Arrays.toString(arr));
		reverseArray(arr);
		
//		System.out.println("----------------------");
//		int arr1[]= {5,22,55,21,4,54,10};
//		System.out.println(Arrays.toString(arr1));
//		reverseArray(arr1);
	}
}
		