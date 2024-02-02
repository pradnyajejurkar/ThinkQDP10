package com.basic.assignments;

public class SumOfOddNum {

	public int oddSum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum += arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfOddNum s1 = new SumOfOddNum();

		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println("Sum of odd Number:" + s1.oddSum(arr));
	}
}