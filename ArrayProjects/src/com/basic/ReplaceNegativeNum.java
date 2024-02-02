package com.basic;

import java.util.Arrays;

public class ReplaceNegativeNum {

	public static void replaceNegativeNum(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, -6, 0, -1, 7, -9 };

		replaceNegativeNum(arr);

	}
}