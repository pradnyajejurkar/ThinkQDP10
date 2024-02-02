package com.intermediate;

import java.util.Arrays;

public class SecondHighest {

	static int findSecondHighest(int arr[]) {
		int highest = Integer.MIN_VALUE; // arr[0]
		int shighest = Integer.MIN_VALUE; // arr[0]

		//using enhanced for loop
		for (int x : arr) {
			if (x > highest) {
				shighest = highest;
				highest = x;
			} else if (x > shighest) {
				shighest = x;
			}
		}

		//using counter
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>highest) {
//				shighest=highest;
//				highest=arr[i];
//			}
//			else if(arr[i]>shighest) {
//				shighest=arr[i];
//			}
//		}

		return shighest;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 1, 4, 6, 0 };
		System.out.println(Arrays.toString(arr));

		int sh = findSecondHighest(arr);

		System.out.println("Second highest:" + sh);
	}

}
