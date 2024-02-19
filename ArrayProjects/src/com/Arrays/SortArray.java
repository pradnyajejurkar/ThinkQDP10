package com.Arrays;

import java.util.Arrays;

public class SortArray {

	public static void sortArray(int arr[]) {
		
		//int index=0;
		//int j=(arr.length/2)-1;
		for(int i=1;i<arr.length/2;i++) {
			for(int j=i+1;j<arr.length/2;j++) {
				
			if(arr[i]<arr[j]) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			
		}
		}
			}
	}
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,1,2,6,4,5,9,0};
		
		System.out.println(Arrays.toString(arr));
		sortArray(arr);
		System.out.println(Arrays.toString(arr));

		
	}

}
