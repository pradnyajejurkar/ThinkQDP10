package com.assignments;
// Find the second minimum number in an array without sorting

import java.util.Arrays;

public class SecondMinimum {

	static int findSecondMinimum(int arr[]) {
		int lowest=Integer.MAX_VALUE;
		int slowest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<lowest) {
				slowest=lowest;
				lowest=arr[i];
			}
			else if(arr[i]<slowest) {
				slowest=arr[i];
			}
		}
		return slowest;
	}
	public static void main(String[] args) {
		int arr[]= { 2, 5, 3, 1, 4, 6, 0 };
		System.out.println(Arrays.toString(arr));

		int sl = findSecondMinimum(arr);

		System.out.println("Second minimum:" + sl);
	}
}
