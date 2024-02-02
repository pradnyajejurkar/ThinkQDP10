package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class FindSquareCube {

	public static void findSquare(int[] arr) {
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[i] = arr[i] * arr[i];
		}
		System.out.println(Arrays.toString(ans));
	}

	public static void findCube(int[] arr) {
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[i] = arr[i] * arr[i] * arr[i];
		}
		System.out.println(Arrays.toString(ans));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int arr[] = new int[sc.nextInt()];

		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("1.Square\n2.Cube");
		System.out.println("Enter the choice:");
		switch (sc.nextInt()) {
		case 1: 
			System.out.println("Square of all elements in array are");
			findSquare(arr);
			break;
			
		case 2:
			System.out.println("Cube of all elements in array are ");
			findCube(arr);
			break;
		default:
			System.out.println("invalid choice");

		}
	}

}
