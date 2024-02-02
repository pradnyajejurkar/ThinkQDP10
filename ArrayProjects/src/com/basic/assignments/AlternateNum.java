package com.basic.assignments;

public class AlternateNum {

	public static void printAlternateNum(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {11,12,13,14,15};
		printAlternateNum(arr);
	}

}
