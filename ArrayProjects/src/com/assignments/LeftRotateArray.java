package com.assignments;
/*WAP to left rotate the array
    ar={1,2,3,4,5}
    o/p: {3,4,5,1,2}*/

import java.util.Arrays;

public class LeftRotateArray {

	public static void leftRotate(int ar[]) {

		int lastE = ar[0];

		// shifting
		for (int i = 0; i < ar.length - 1; i++) {
			ar[i] = ar[i + 1];
		}
		ar[ar.length - 1] = lastE;
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		

		System.out.println(Arrays.toString(ar));
		System.out.println("------------------------------");
		for (int i = 0; i < 2; i++) {

			leftRotate(ar);

			System.out.println(Arrays.toString(ar));
		}
		System.out.println("------------------------");
		System.out.println(Arrays.toString(ar));

	}
}