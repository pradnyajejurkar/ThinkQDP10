package com.basic;

import java.util.Arrays;
//import java.util.Scanner;

public class EvenNoArray {
	static void evenArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
	}
	}
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the size of array:");
//		int size=sc.nextInt();
//		
//		int arr[]=new int[size];
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("give value for index "+ i +":");
//			arr[i]=sc.nextInt();
//		}
//		
//		System.out.println("Even numbers in array");
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				System.out.println(arr[i]);
//			}
//			sc.close();
//		}
//	}

		
		int arr[]= {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(arr));
		evenArray(arr);
}
}
