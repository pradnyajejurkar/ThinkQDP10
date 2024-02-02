package com.basic.assignments;

import java.util.Scanner;

/*WAP to accept dimension of 1D array and create and accept data in that array.
 *  Calculate the average value of array elements.*/

public class FindAverage {

	public static double calAverage(int arr[]) {
		int sum = 0, avg;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("average is:" + calAverage(arr));

	}

}
