package com.basic.assignments;

import java.util.Arrays;

public class SortArray {

	public static void sortAscending(int arr[]) {
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[i]=arr[j];
					arr[j]=temp;
					
			   }
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {5,2,8,7,1};
		
		sortAscending(arr);

	}

}
