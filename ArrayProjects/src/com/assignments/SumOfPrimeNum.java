package com.assignments;
//Find the sum of prime numbers in array using enhanced for loop

import java.util.Arrays;

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
	
//	public static int sumOfPrime(int arr[]) {
//		int sum=0;
//		for(int x:arr) {
//			if(checkPrime(x)) {
//				sum+=x;
//			}
//		}
//		return sum;
//	}

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9,10};
	
		System.out.println(Arrays.toString(arr));
		//System.out.println("Sum of prime numbers:"+sumOfPrime(arr));
	}

}
