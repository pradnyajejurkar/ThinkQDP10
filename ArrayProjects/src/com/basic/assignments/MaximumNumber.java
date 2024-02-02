package com.basic.assignments;

//import java.util.Arrays;
//import java.util.Scanner;

public class MaximumNumber {

	public static int findMaxNum(int arr[]) {
		int max=arr[0];	
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the size:");
//		int size=sc.nextInt();
//		
//		int arr[]=new int[size];
//		
//		System.out.println("Enter the elements:");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();		
		
		int arr[] = { 10, 2, 35, 40, 5 };
		findMaxNum(arr);	
		System.out.println("maximum number:"+findMaxNum(arr));
		}
	}


