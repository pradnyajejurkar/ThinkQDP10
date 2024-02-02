package com.basic.assignments;

import java.util.Scanner;

public class AverageOfRainfall {

	public static float pintAvgRainfall(int arr[]) {
		int size = arr.length, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (sum / size);
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
		System.out.println("Average rainfall is:" + pintAvgRainfall(arr));

		sc.close();
	}
}
