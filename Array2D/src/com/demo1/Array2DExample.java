package com.demo1;

/*
 * 1 2 3 
   4 5 6 
   7 8 9 
 * 
 */
public class Array2DExample {

	public static void main(String[] args) {
		// declaration

		int arr[][];
		// or
		int[][] arr1;

		int rows = 3;
		int cols = 3;
		arr = new int[rows][cols];

		int no = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = no;
				no++;
			}
		}

		System.out.println("-------------------");
		// enhanced for loop
		for (int i = 0; i < rows; i++) {
			for (int a : arr[i]) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

		System.out.println("=====================");
		//or use regualar for loop

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}
}