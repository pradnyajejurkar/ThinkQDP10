package com.basic;

public class TraverseArray {
public static void main(String[] args) {
	
	int []arr=new int[5];
	arr[0]=90;
	arr[1]=89;
	arr[2]=100;
	arr[3]=80;
	arr[4]=67;
	//arr[5]=99;//ArrayIndexOutOfBoundException
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("--------------------");
	//array as aliteral
	//int arr[1]={5,6,8,2,4};//new int[]
	
	
	int arr1[]=new int[] {5,6,8,4,2};
	
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
	}
	
}
}
