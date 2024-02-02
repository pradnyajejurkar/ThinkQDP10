package com.basic.assignments;
/*6.  Write two methods that return the average of an array with following headers.
a.  public static int average(int[] array)
b.  public static double average(double[] array).*/

import java.util.Arrays;
import java.util.Scanner;

public class TwoMethodsAvg {

	public static int averageInt(int[] arr) {
		int sum = 0, avg;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		return avg;
	}

	public static double averageDouble(double[] arr) {
		double avg, sum = 0;
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

		double a[] = { 1.4, 1.2, 1.3, 1.4, 1.5 };

		System.out.println(Arrays.toString(arr));

		System.out.println("Int Average:" + averageInt(arr));
		System.out.println("double average:" + averageDouble(a));

		sc.close();
	}

}
