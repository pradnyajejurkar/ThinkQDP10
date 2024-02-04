package com.Arrays;

import java.util.Arrays;

/*Find the max and minimum number from an array and swap their positions
eg:{1,2,3,4,5,6}
o/p:{6,2,3,4,5,1}*/

public class SwapMinMax {

	static void swapMinMax(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int maxpos = 0;
		int minpos = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
				maxpos = i;
			}

			if (arr[i] < min) {
				min = arr[i];
				minpos = i;
			}
		}

		int temp=arr[maxpos];
		arr[maxpos]=arr[minpos];
		arr[minpos]=temp;
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(arr));

		swapMinMax(arr);
	}

}
