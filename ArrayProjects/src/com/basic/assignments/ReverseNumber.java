package com.basic.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {

	public static void reverseNum(int arr[]) {
		int arr1[] = new int[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr1[index++] = arr[i];

		}
		System.out.println(Arrays.toString(arr1));
	}

	public static void reverseArray(int arr[]) {
		int j = (arr.length - 1);
		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elemnts:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// reverseNum(arr);
		reverseArray(arr);
		sc.close();
	}
	
}
