package com.assignments;

import java.util.Arrays;

// WAP to half sort the array in ascending and half in descending

public class SortArrayAscDec {

	static void halfSortArray(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			for(int j=i+1;j<arr.length/2;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=arr.length/2;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
				arr[i]=arr[j];
					arr[j]=temp;
			}
		}
	}
}
	public static void main(String[] args) {
		int arr[]= {4,2,1,3,6,5,7,9,8};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arr));
		
		halfSortArray(arr);
		
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
	}

}
