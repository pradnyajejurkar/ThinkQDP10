package com.intermediate;

import java.util.Arrays;

public class PairOfElement {

	static void findPairSum(int arr[]) {
		int sum=8;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+ " " +arr[j]);
					break;
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,0,8};
		
		System.out.println(Arrays.toString(arr));
		findPairSum(arr);
	}

}
