package com.basic;

import java.util.Arrays;

public class AdditionOfArray {
	public static void additionOfArray(int arr[], int arr1[]) {
		int sum;
		int sum1[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + arr1[i];
			sum1[i] = sum;

		}

		System.out.println("sum of array:" + Arrays.toString(sum1));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int arr1[] = { 2, 3, 4, 5, 6 };

		additionOfArray(arr, arr1);
	}

}
