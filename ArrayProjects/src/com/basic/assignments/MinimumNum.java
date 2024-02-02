package com.basic.assignments;

public class MinimumNum {

	public static int findMinNum(int arr[]) {
		int min=arr[0];	
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		
		int arr[] = { 10, 2, 35, 40, 5 };
		findMinNum(arr);	
		System.out.println("minimum number:"+findMinNum(arr));
		}
	}


