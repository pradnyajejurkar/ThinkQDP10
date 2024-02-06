package com.Arrays;

import java.util.Arrays;

//Shift all the even number at the end of array using temporary array 
public class ShiftEvenTemp {

	public static void shiftEvenTemp(int[] arr) {
	//public static void shiftEvenTemp2(int[] arr) {
		int temp[] = new int[arr.length];
		int index = 0; //count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				temp[index] = arr[i];
				index++;

			
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 7, 8, 1, 9, 5 };

		System.out.println(Arrays.toString(arr));

		shiftEvenTemp(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}

}
