package com.Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void reverseArray(int[] arr) {
		int n = arr.length;
		int mid = n / 2;

		// Swap elements from the first half with elements from the second half
		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] inputArray1 = { 1, 2, 5, 7, 3, 4 };
		int[] inputArray2 = { 5, 22, 55, 21, 4, 54, 10 };

		System.out.println("Original array 1: " + Arrays.toString(inputArray1));
		reverseArray(inputArray1);
		System.out.println("Reversed array 1: " + Arrays.toString(inputArray1));

		System.out.println("\nOriginal array 2: " + Arrays.toString(inputArray2));
		reverseArray(inputArray2);
		System.out.println("Reversed array 2: " + Arrays.toString(inputArray2));
	}

}
