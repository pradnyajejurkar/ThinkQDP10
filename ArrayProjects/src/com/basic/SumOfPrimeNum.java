package com.basic;

public class SumOfPrimeNum {

	public static boolean checkPrime(int n) {

		if (n <= 1) {
			return false;

		} else {

			boolean flag = true;
			for (int i = 2; i <=n / 2; i++) {
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
			return flag;

		}
	}

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (checkPrime(arr[i]))
				sum = arr[0]+arr[1];
		}

		System.out.println("Sum is:" + sum);

	}

}
