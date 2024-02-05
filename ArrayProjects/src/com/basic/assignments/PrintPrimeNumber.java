package com.basic.assignments;

import java.util.Scanner;

public class PrintPrimeNumber {

	public static boolean checkPrimeNum(int n) {
		if (n <= 1) {
			return false;
		} else {
			int count = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					count++;
				break;
			}
		}
			return count == 0;
		}
	}
//			boolean flag = true;
//			for (int i = 2; i <=n / 2; i++) {
//				if (n % i == 0) {
//					flag = false;
//					break;
//				}
//			}
//			return flag;
//		}
//	}
			
			
			
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (checkPrimeNum(arr[i])) {
				System.out.println(arr[i] + " ");
			}

		}
		sc.close();
	}

}
