package com.intermediate;

import java.util.Arrays;

public class SeperateNegativePositive {

	// at the end :negative

	static void shiftNegative(int ar[]) {
		int left = 0;
		int right = ar.length - 1;

		while (left < right) {
			while (ar[left] > 0 && left < right)
				left++;
			while (ar[right] < 0 && left < right)
				right++;
			if (left < right) {
				int temp = ar[left];
				ar[left] = ar[right];
				ar[right] = temp;
				left++;
				right--;
			}
		}
	}

	//at the end:negative
	static void shiftNegative2(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = ar.length - 1; j >= 0; j--) {
				if (ar[i] < 0 && i < j) {//if(ar[i]> &&i<j)->  shift negative element at the start
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {3,4,-1,6,-7,8,-5,2,9};

		System.out.println(Arrays.toString(arr));
		shiftNegative(arr);
		System.out.println(Arrays.toString(arr));
		

		System.out.println(Arrays.toString(arr));
		shiftNegative2(arr);

	}

}
